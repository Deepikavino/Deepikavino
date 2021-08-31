package org.arm;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		
		int a, c = 0;
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int j=n;
		System.out.println(j);
		
		while (n > 0) {
			
			a = n % 10;
			c = c + (a * a * a);
			n = n / 10;
		}
		
		if (c == j) {
			
			  System.out.println("Given Number is Armstrong");
		}
		  else {
			 
			  System.out.println("Number is not an Armstrong");
		}
	}

}
