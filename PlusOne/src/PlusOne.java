import java.util.Arrays;

/**
Plus One
Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list. 
 */

/**
 * @author Zhendong Xu
 *
 */
public class PlusOne {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input={9,9,9};
		System.out.println("Input Arrays:"+Arrays.toString(input));
		System.out.println("Plus One Arrays:"+Arrays.toString(Solution.plusOne(input)));
	}
}
