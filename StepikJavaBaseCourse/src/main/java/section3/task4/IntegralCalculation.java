package section3.task4;

import java.util.function.DoubleUnaryOperator;

/**
 * Реализуйте метод, выполняющий численное интегрирование заданной функции на заданном интервале
 * <a href="https://ru.wikipedia.org/wiki/Метод_прямоугольников">по формуле левых прямоугольников</a>.
 * <p>
 * Функция задана объектом, реализующим интерфейс java.util.function.DoubleUnaryOperator.
 * Его метод applyAsDouble() принимает значение аргумента и возвращает значение функции в заданной точке.
 * <p>
 * Интервал интегрирования задается его конечными точками a и b,
 * причем a<=b. Для получения достаточно точного результата используйте шаг сетки не больше 10^−6.
 * <p>
 * Пример. Вызов
 * <p>
 * integrate(x -> 1, 0, 10)
 * <p>
 * должен возвращать значение 10.
 * <p>
 * P.S. Если задача слишком легкая, то дополнительно можете реализовать динамический выбор шага сетки по следующему алгоритму:
 * <p>
 * Вычислить приближенное значение интеграла функции при начальном значении шага сетки (например, 1).
 * Вычислить приближенное значение интеграла функции при более мелком шаге сетки (например, уменьшить шаг сетки в два раза).
 * Если разность двух последовательных приближений интеграла функции достаточно мала, то завершаем алгоритм и возвращаем текущее приближение в качестве результата.
 * Иначе возвращаемся к шагу 2.
 *
 * @author Alexandr_Firsin
 * @since 2019.03.18
 */
public class IntegralCalculation {

	private static final double EPSILON = 1e-5;

	private static final double INTEGRATION_STEP_DENOMINATOR = 2.0;

	public static void main(String[] args) {
		System.out.println(integrate(x -> 1, 0, 10));//10.0
		System.out.println(integrate(x -> x + 2, 0, 10));//70.0
		System.out.println(integrate(x -> Math.sin(x)/x, 1, 5));//0.603848
	}

	public static double integrate(DoubleUnaryOperator f, double a, double b) {
		double h = 0.000001;
		double result = 0.0;
		double x = a;
		do {
			result += f.applyAsDouble(x);
			x += h;
		}
		while ((x - b) < h);
		return result*h;
	}

	//PS
	private static double integrateWithDynamicStep(DoubleUnaryOperator f, double a, double b, double step) {
		double result1;
		double result2 = integrateWithStep(f, a, b, step);
		do {
			result1 = result2;
			step /= INTEGRATION_STEP_DENOMINATOR;
			result2 = integrateWithStep(f, a, b, step);
		} while (Math.abs(result1 - result2) > EPSILON);
		return result2;
	}

	private static double integrateWithStep(DoubleUnaryOperator f, double a, double b, double step) {
		final double stepValidated = (step < Double.MIN_VALUE) ? Double.MIN_VALUE : step;
		double x = a;
		double sum = 0.0;
		while (x < b) {
			sum += stepValidated * f.applyAsDouble(x);
			x += stepValidated;
		}
		return sum;
	}
}
