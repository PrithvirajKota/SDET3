package com.devlabs.lab8;

public class StringEqual {

public static void main(String[] args) {
// TODO Auto-generated method stub

String name1 = "pavan";
String name2 = "pavan2";

String name3 = "moram";
String name4 = "moram";

if(name1.equalsIgnoreCase(name2)) 
{
System.out.println("name1 is equal to name2");
}
else
{
System.out.println("name1 is not equal to name2");
}

if(name3.equals(name4))

{
System.out.println("name3 is equal to name4");
}
else
{
System.out.println("name3 is not equal to name4");
}



}

}