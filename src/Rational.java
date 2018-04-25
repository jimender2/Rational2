/**
 * The purpose of this class is to implement a way to work with rational
 * numbers using a custom made class.  This is the second revision of it
 * for programming assignment 12 for CS 121.
 * @author Jonathan Meredith
 * 
 */
public class Rational {
	private int numerator;
	private int denominator;
	
	/**
	 * The setNumerator method stores a value in
	 * the numerator field
	 * @param num The value to store in numerator
	 */
	public void setNumerator(int num){
		numerator = num;
	}
	
	/**
	 * The setNumerator method stores a value in
	 * the numerator field
	 * @param num The value to store in numerator
	 */
	public void setNumerator(String num) {
		numerator = Integer.parseInt(num);
	}
	
	/**
	 * The setDenominator method stores a value in
	 * the denominator field
	 * @param den The value to store in denominator
	 */
	public void setDenominator(int den){
		denominator = den;
	}
	
	/**
	 * The getNumerator method returns the
	 * numerator of the Rational object
	 * @return The numerator of the object
	 */
	public int getNumerator(){
		return numerator;
	}
	
	/**
	 * The getDenominator method returns the
	 * denominator of the Rational object
	 * @return The denominator of the object
	 */
	public int getDenominator(){
		return denominator;
	}
	
	/**
	 * The getDecimal method returns the
	 * decimal value of the Rational object
	 * @return The calculated decimal of the Rational number
	 */
	public double getDecimal(){
		return( ((double)(numerator) / (double)(denominator)) );
	}	
}