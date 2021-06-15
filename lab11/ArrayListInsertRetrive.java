package com.devlabs.lab11;

//Lab 11 Solution 1

import java.util.*;

public class ArrayListInsertRetrive {

    public static void main(String[] args) {
        List item = new ArrayList();
        
        item.add("Pavan");
        item.add("Anjali");
        item.add("Sandeep");
        
         for(int j=0;j<item.size();j++)
           {  
             System.out.println("Item at index : "+ j + " is " + item.get(j)); 
           }  
        
         item.add(1, "Mani");
         
         System.out.println("---------------------------------"); 
         
         for(int j=0;j<item.size();j++)
           {  
             System.out.println("Item at index : "+ j + " is " + item.get(j)); 
           }
         
    }

}



