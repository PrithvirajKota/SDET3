package com.devlabs.lab7;

import java.util.Scanner;

public class TrimTheString {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			String Adjust = " She sells sea shells on sea shore ";
			System.out.println(Adjust.trim());

			//using Scanner
			String adjustTrimScanner ;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter any String:");
			adjustTrimScanner = scan.next();
			System.out.println(adjustTrimScanner.trim());

	}
	}

