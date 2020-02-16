package section2.task9;

import java.util.regex.Pattern;

/**
 * Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке
 * массив. Массивы могут быть любой длины, в том числе нулевой.
 * <p>
 * Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность:
 * он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий массив.
 * Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась.
 * К сожалению, автоматически это не проверить, так что это остается на вашей совести :)
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 * <p>
 * Пример
 * <p>
 * Если на вход подаются массивы {0, 2, 2} и {1, 3}, то на выходе должен получиться массив {0, 1, 2, 2, 3}
 *
 * @author Firsin
 * @since 31.08.2018
 */
public class MergingSortingArrays {
	public static void main(String[] args) {
		int[] a1 = new int[]{21, 23, 24, 40, 75, 76, 78, 77, 900, 2100, 2200, 2300, 2400, 2500};
		int[] a2 = new int[]{10, 11, 41, 50, 65, 86, 98, 101, 190, 1100, 1200, 3000, 5000};
		for (int p : mergeArrays(a1, a2)) {
			System.out.print(p + ",");
		}
	}

	/**
	 * Merges two given sorted arrays into one
	 *
	 * @param a1 first sorted array
	 * @param a2 second sorted array
	 * @return new array containing all elements from a1 and a2, sorted
	 */
	public static int[] mergeArrays(int[] a1, int[] a2) {
		int[] a3 = new int[a1.length + a2.length];
		for (int i = 0, j = 0, k = 0; k < a3.length; k++) {
			if (i > a1.length - 1) {
				a3[k] = a2[j];
				j++;
			} else if (j > a2.length - 1) {
				a3[k] = a1[i];
				i++;
			} else if (a1[i] < a2[j]) {
				a3[k] = a1[i];
				i++;
			} else {
				a3[k] = a2[j];
				j++;
			}
		}
		return a3;
	}
}
