package exercise5;

public interface PrimeDivisorList {

	/**
	 * adds a prime number to list, if num is present the count is incremented
	 * 
	 * @param nextInt
	 */
	public void add(Integer nextInt);
		
	/**
	 * Returns list in the form of [ num1^num1count * num2^num2count .... = total ]
	 * 
	 * @param nextInt
	 */
	public String toString();
}
