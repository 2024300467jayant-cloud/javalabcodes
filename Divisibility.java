package Mth;

import java.util.Scanner;

public class Divisiblity {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the srange:");
		int srange = scan.nextInt();
		
		System.out.println("enter the erange:");
		int erange = scan.nextInt();
		
		int count = 0;
		
		for(int i=srange; i<=erange; i++) {
			if(i%3==0) {
				count++;
			}
		}
		System.out.println("divisible by 3=" +count+ " times");
		count=0;
		
		
		for(int i=srange; i<=erange; i++) {
			if(i%4==0) {
				count++;
			}
		}
		System.out.println("divisible by 4=" +count+ " times");
		count=0;
		
		
		for(int i=srange; i<=erange; i++) {
			if(i%5==0) {
				count++;
			}
		}
		System.out.println("divisible by 5=" +count+ " times");
		count=0;
	}

}
