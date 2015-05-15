
public class TwoSum {
	public int[] twoSum(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
		java.util.HashMap<Integer, Integer> map = new java.util.HashMap<Integer, Integer>();
		int n = numbers.length;
		int[] result = new int[2];
		for (int i = 0; i < numbers.length; i++)
        {
            if (map.containsKey(target - numbers[i]))
            {
                result[0] = map.get(target-numbers[i]) + 1;
                result[1] = i + 1;
            }
            else
            {
                map.put(numbers[i], i);
            }
        }
		return result;   
    }
	
	public static void main (){
		
	}
}
