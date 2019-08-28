package utility;

import java.util.Arrays;

public class Utility {
	/**
	 * @param arr
	 * @param x
	 * @return
	 */
	public static int binarySerch(String[] arr, String x) 
    { 
		 int l = 0, r = arr.length - 1; 
	        while (l <= r) { 
	            int m = l + (r - l) / 2; 
	  
	            int res = x.compareTo(arr[m]); 
	  
	            // Check if x is present at mid 
	            if (res == 0) 
	                return m; 
	  
	            // If x greater, ignore left half 
	            if (res > 0) 
	                l = m + 1; 
	  
	            // If x is smaller, ignore right half 
	            else
	                r = m - 1; 
	        } 
	  
	        return -1; 
    } 
	
	static final int NO_OF_CHARS = 256; 
	
	public static boolean checkAnagram(char[] str1,char[] str2)
	{
		int n1 = str1.length;
		int n2 = str2.length;
		
		if(n1 != n2)
		{
			return false;
		}
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for(int i=0 ; i<n1 ;i++)
		{
			if(str1[i] != str2[i])
			{
				return false;
			}
			
		}
		return true;
		
	}
}
