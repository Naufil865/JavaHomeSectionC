package Basic;

import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args) {
		int first=0,second=1,n,i,count;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number :");
		count = scanner.nextInt();
		
		System.out.println("Start with "+ first + " " + second);
		
		for(i = 0 ; i<count;i++)
		{
			n = first + second;
			System.out.println(" "+ n);
			first=second;
			second=n;
		}
		

	}

}
