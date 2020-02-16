package section3.task5;

import java.util.Arrays;

/**
 * Напишите класс AsciiCharSequence, реализующий компактное хранение последовательности ASCII-символов
 * (их коды влезают в один байт) в массиве байт. По сравнению с классом String, хранящим каждый символ как char,
 * AsciiCharSequence будет занимать в два раза меньше памяти.
 * <p>
 * Класс AsciiCharSequence должен:
 * реализовывать интерфейс java.lang.CharSequence;
 * иметь конструктор, принимающий массив байт;
 * определять методы length(), charAt(), subSequence() и toString()
 * <p>
 * Сигнатуры методов и ожидания по их поведению смотрите в описании интерфейса java.lang.CharSequence (JavaDoc или исходники).
 * <p>
 * В данном задании методам charAt() и subSequence() всегда будут подаваться корректные входные параметры,
 * поэтому их проверкой и обработкой ошибок заниматься не нужно. Тем более мы еще не проходили исключения.
 * P.S. В Java 9 ожидается подобная оптимизация в самом классе String: http://openjdk.java.net/jeps/254*
 *
 * @author Alexandr_Firsin
 * @since 2019.03.18
 */
public class AsciiCharSequence implements CharSequence {

	private byte[] bytes;

	public AsciiCharSequence(byte[] bytes) {
		this.bytes = bytes;
	}

	/**
	 * Returns the length of this character sequence.  The length is the number
	 * of 16-bit <code>char</code>s in the sequence.
	 *
	 * @return the number of <code>char</code>s in this sequence
	 */
	@Override
	public int length() {
		return this.bytes.length;
	}

	/**
	 * Returns the <code>char</code> value at the specified index.  An index ranges from zero
	 * to <tt>length() - 1</tt>.  The first <code>char</code> value of the sequence is at
	 * index zero, the next at index one, and so on, as for array
	 * indexing.
	 *
	 * <p>If the <code>char</code> value specified by the index is a
	 * <a href="{@docRoot}/java/lang/Character.html#unicode">surrogate</a>, the surrogate
	 * value is returned.
	 *
	 * @param index the index of the <code>char</code> value to be returned
	 * @return the specified <code>char</code> value
	 * @throws IndexOutOfBoundsException if the <tt>index</tt> argument is negative or not less than
	 *                                   <tt>length()</tt>
	 */
	@Override
	public char charAt(int index) {
		if ((index < 0) || (index >= bytes.length)) {
			throw new StringIndexOutOfBoundsException(index);
		}
		return (char) this.bytes[index];
	}

	/**
	 * Returns a <code>CharSequence</code> that is a subsequence of this sequence.
	 * The subsequence starts with the <code>char</code> value at the specified index and
	 * ends with the <code>char</code> value at index <tt>end - 1</tt>.  The length
	 * (in <code>char</code>s) of the
	 * returned sequence is <tt>end - start</tt>, so if <tt>start == end</tt>
	 * then an empty sequence is returned.
	 *
	 * @param start the start index, inclusive
	 * @param end   the end index, exclusive
	 * @return the specified subsequence
	 * @throws IndexOutOfBoundsException if <tt>start</tt> or <tt>end</tt> are negative,
	 *                                   if <tt>end</tt> is greater than <tt>length()</tt>,
	 *                                   or if <tt>start</tt> is greater than <tt>end</tt>
	 */
	@Override
	public AsciiCharSequence subSequence(int start, int end) {
		if (start < 0) {
			throw new StringIndexOutOfBoundsException(start);
		}
		if (end > bytes.length) {
			throw new StringIndexOutOfBoundsException(end);
		}
		int subLen = end - start;
		if (subLen < 0) {
			throw new StringIndexOutOfBoundsException(subLen);
		}
		return  new AsciiCharSequence(Arrays.copyOfRange(bytes, start, end));
	}

	@Override
	public String toString() {
		return new String(bytes);
	}

	public static void main(String[] args) {

		byte[] example = {72, 101, 108, 108, 111, 33};
		AsciiCharSequence answer = new AsciiCharSequence(example);
		System.out.println("Последовательность - " + answer.toString());//Hello!
		System.out.println("Размер её - " + answer.length());//6
		System.out.println("Символ под № 1 - " + answer.charAt(1));//e
		System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
		//проверка на нарушение инкапсуляции private поля
		System.out.println(answer.toString());//Hello!
		example[0] = 74;
		System.out.println(answer.toString());//Hello!
	}
}
