package com.FirstJava;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("The largest of two number is:");
        if(num1 > num2)
            System.out.println(num1);
        else
            System.out.println(num2);
    }
}
