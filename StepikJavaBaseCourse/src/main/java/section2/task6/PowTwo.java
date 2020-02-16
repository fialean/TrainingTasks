package section2.task6;

/**
 * Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
 * <p>
 * Решать можно разными способами:
 * воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
 * применив пару трюков из двоичной арифметики;
 * написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после просмотра соответствующих уроков).
 * <p>
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 * <p>
 * Sample Input 1: 0; Sample Output 1: false;
 * Sample Input 2: 1; Sample Output 2: true;
 * Sample Input 3: -2; Sample Output 3: true;
 *
 * @author Firsin
 * @since 31.08.2018
 */

public class PowTwo {

	public static boolean isPowerOfTwo(int value) {

		//        return Integer.bitCount(Math.abs(value)) == 1;

		value = Math.abs(value);

		return ((value & (value - 1)) == 0) & (0 != value);
		// return v != 0 && (v & -v) == Math.abs(v);
		//return (Math.log(Math.abs(value)) / Math.log(2)) % 1 == 0;
		//return (Integer.numberOfLeadingZeros(Math.abs(value))+Integer.numberOfTrailingZeros(Math.abs(value)))==31;
	}
}

//    public static boolean isPowerOfTwo1(int value) {
//        if (value == 0) return false;
//        value = Math.abs(value);
//        if (value == 2) return true;
//        double d = Math.sqrt(value);
//        d = d % 1;
//        if (d == 0)
//            return true;
//        else return false;
//    }