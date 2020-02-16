package section3.task2;

/**
 * @author Alexandr_Firsin
 * @since 2019.03.13
 */
public final class ComplexNumber {
	private final double re;
	private final double im;

	public ComplexNumber(double re, double im) {
		this.re = re;
		this.im = im;
	}

	public double getRe() {
		return re;
	}

	public double getIm() {
		return im;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof ComplexNumber)) return false;

		ComplexNumber that = (ComplexNumber) o;

		if (Double.compare(that.getRe(), getRe()) != 0) return false;
		return Double.compare(that.getIm(), getIm()) == 0;
	}

	@Override
	public int hashCode() {
		return Double.hashCode(re + im);
	}
}
