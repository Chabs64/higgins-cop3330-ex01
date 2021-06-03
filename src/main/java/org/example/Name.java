package org.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Chad Higgins
 */

/*
Create a program that prompts for your name and prints a greeting using your name.

Example Output
What is your name? Brian
Hello, Brian, nice to meet you!
Constraint
Keep the input, string concatenation, and output separate.
 */


import java.util.Scanner;

public class Name {
    public static void main(String[] args)
    {
        System.out.println("What is your name?");
        Scanner name = new Scanner(System.in);

        String Name = name.nextLine();

        System.out.println("Hello, " + Name + ", nice to meet you!");
    }
}
//git commands
// git status - what is being push
// git add - stage changes
// git commit -m "add a comment"- comfirm changes
// git push - push to repository