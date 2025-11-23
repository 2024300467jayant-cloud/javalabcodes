package myFunc;

import java.util.Scanner;

public class Functions {
		
		public static int calculateSum(int a, int b) {
			int sum=a+b;
			return sum;
		}
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the no. a and b:");
			int a=scan.nextInt();
			int b=scan.nextInt();
			
			int sum=calculateSum(a,b);
			System.out.println("sum of 2 numbers is:"+sum);
			
		}
}
