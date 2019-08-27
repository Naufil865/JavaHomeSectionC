package Search;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import utility.Utility;
public class BinarySearch {
	public static void main(String[] args)throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		String[] strarr = null;
		java.io.File file = new File("D:\\Naufil\\Java\\ab.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String str,str2;
		try 
		{
			while((str = br.readLine())!= null)
			{
				strarr = str.split(",");
			}
			System.out.println("Unsorted = ");
			for(int i = 0;i < strarr.length;i++) {
				System.out.println(strarr[i]);
			}
			Arrays.sort(strarr);
			System.out.println("Sorted = ");
			for(int i=0 ; i <strarr.length;i++)
			{
			System.out.println(strarr[i]);
			}
			System.out.println("Enter  string/word to be search : ");
			str2 = scanner.next();
			int result = Utility.binarySerch(strarr,  str2);
			 if (result == -1) 
		            System.out.println("Element not present"); 
		        else
		            System.out.println("Element found at "
		                              + "index " + result); 
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		}
	}

