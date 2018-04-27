
public class test {

	public static void main(String[] args) {
		Rational rat = new Rational();
		rat.setDenominator(0);
		rat.setNumerator(100);
		System.out.println(rat.getNumerator());
		System.out.println(rat.getDenominator());
		System.out.println(rat.getDecimal());
	}

}
