package Mth;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int count = 0;
		
		while(count<3) {
			int a = scan.nextInt();
			
			System.out.println("Enter the number:");
			if(a%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
			count++;
		}
		
	}

}
