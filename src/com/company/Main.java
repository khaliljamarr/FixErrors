package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = input.nextLine();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter your DOB year: ");
        int dob = input.nextInt();
        System.out.println("Summary: " + "Your name is: " + name + "\n" + "Your age is: " + age + "\n" + "Your birth year is: " + dob);
    }
}
