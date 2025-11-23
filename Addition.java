package Maths;

import java.util.Scanner;

public class Addition {
	public void Number() {
		Addition ads=new Addition();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num1=scn.nextInt();
		System.out.println("Enter the 2nd number:");
		int num2=scn.nextInt();
		int num3;
		num3=num1+num2;
		if(num3>30) {
			System.out.println(num3);
		}else {
			System.out.println("Enter the no. greater then 30:");
			ads.Number();
		}
	}
}
