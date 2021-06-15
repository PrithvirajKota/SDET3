package com.devlabs.lab4;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		int a;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        
        a = scan.nextInt();
        
        int b;
        Scanner scan1 = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        
        b = scan1.nextInt();
        
        int c;
        Scanner scan2 = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        
        c = scan2.nextInt();
        
        scan.close();
        
        if(a>b && a>c)
        {
            System.out.println("a is greater");
        }
        else if(b>a && b>c)
        {
            System.out.println("b is greater");
        }
        
        else
        {
            System.out.println("c is greater");
        }
        

	}

}
