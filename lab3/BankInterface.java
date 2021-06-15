package com.devlabs.lab3;

        interface BankInterface
        {  
            int getRateOfInterest();  
        }  
        
        //Creating implementing classes.  
        class SBI implements BankInterface{  
            public int getRateOfInterest(){return 8;}  
        }  
          
        class ICICI implements BankInterface{  
            public int getRateOfInterest(){return 7;}  
        }  
        class AXIS implements BankInterface{  
            public int getRateOfInterest(){return 9;}  
        }  
        
        
