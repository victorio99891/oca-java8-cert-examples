package pl.wiktor.application;

import java.lang.Integer;

public class Numbers {


int binaryTen = 0b1010;
int binaryTwo = 0b10;

public void exec(){


int result = binaryTen + binaryTwo;

System.out.println("decimal=" + binaryTen +" binary=" + Integer.toBinaryString(binaryTen));
System.out.println("decimal=" + binaryTwo +" binary=" + Integer.toBinaryString(binaryTwo));
System.out.println("Results: decimal=" + result +" binary=" + Integer.toBinaryString(result));



}




}