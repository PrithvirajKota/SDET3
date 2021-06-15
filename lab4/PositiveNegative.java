package com.devlabs.lab4;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
	      System.out.println("Enter the Number : ");
	      
	      int num = reader.nextInt();
	      
	      reader.close();
	      
	      if(num > 0)
	      {
	          //condition is true
	          System.out.println("Number is positive");
	      }
	      else
	      {
	          //condition is false
	          System.out.println("Number is negative");
	      }
	
	}

}
