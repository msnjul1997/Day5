package com.kittu;

import java.util.Scanner;

public class QuotRem {
	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter Divident: ");
	        int divident = s.nextInt();
	        System.out.print("Enter Divisor: ");
	        int divisor = s.nextInt();
	        System.out.println("Quotient is: "+(divident/divisor));
	        System.out.print("Remainder is: "+(divident%divisor));
	    }

}
