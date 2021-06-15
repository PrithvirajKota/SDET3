package com.devlabs.lab8;

public class StringBufferBuilder {

public static void main(String[] args) {
// TODO Auto-generated method stub3

String Name1 = "Pavan ";

StringBuilder sb1 = new StringBuilder(Name1);

//ctrl+space : to see the methods in API

sb1.append("Kumar");

System.out.println("StringBuilder sb1 " +sb1);

////StringBuffer
StringBuffer sb2 = new StringBuffer("Pavan Kumar");
sb2.append(" Moram");
System.out.println("StringBuffer sb2 " +sb2);


}

}