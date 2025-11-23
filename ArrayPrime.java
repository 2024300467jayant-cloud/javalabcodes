package myFunc;

import java.util.Scanner;

public class ArrayPrime {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the starting range:");
		int srange = scanner.nextInt();
		
		System.out.println("enter the erange:");
		int erange = scanner.nextInt();
		
		
		for(int i=srange; i<=erange; i++) {
			
			if(i==0 || i==1) {
				continue;
			}
			
			
			int count = 0;
			for(int j=2; j<i; j++) {
				if(srange==1) {
					srange++;
				}else {
					if(i%j == 0 ) {
						count++;
					}
				}
			}
			if(count==0) {
				System.out.println("prime no are:"+i);
				
			}
		}
	}

}
