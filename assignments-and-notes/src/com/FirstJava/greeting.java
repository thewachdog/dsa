package com.FirstJava;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String s = input.nextLine();
        System.out.println("Welcome, " + s + "!");
    }
}
