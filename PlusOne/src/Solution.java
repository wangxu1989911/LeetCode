import java.util.Arrays;

/**
 * Practice use
 */

/**
 * @author Zhendong Xu
 *
 */
public class Solution {
    public static int[] plusOne(int[] digits) {
        int carry=1;
        for (int i=digits.length-1; i>=0; i--){
            if (digits[i]==9) digits[i]=0;
            else{
                digits[i]+=carry;
                return digits;
            }
        }
        int[] res= new int[digits.length+1];
        res[0]=1;
        System.arraycopy(digits, 0, res, 1, digits.length);
        return res;
    }
}