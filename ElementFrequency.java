import java.util.HashMap;
import java.util.Map;

/*
 * To count occurrences of each integer in given array of integers. 
*/

public class ElementFrequency
{
	public static void recordFrequency(int arr[])
	{
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++)
		{
			Integer c = map.get(arr[i]);
			if(c == null)
			{
				map.put(arr[i], 1);
			}
			else
			{
				map.put(arr[i], ++c);
			}
		}
		
		for(Map.Entry<Integer, Integer> m: map.entrySet())
		{
			System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
		}
	}
	
	public static void main(String[] args)
	{
		int arr[] = {10,20,10,3,3,5,6,9,4,5,4,5};
		recordFrequency(arr);
	}
}