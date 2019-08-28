package Basic;

import java.util.Scanner;

import utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str1,str2;
		System.out.println("Enter First String : ");
		str1 = scanner.next();
		System.out.println("Enter Second string : ");
		str2= scanner.next();
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		
	
		if(Utility.checkAnagram(arr1, arr2))
		{
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}

	}

}
