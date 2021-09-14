package org.example;

import java.util.Scanner;

/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mohammed_Almeaither
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Exercise 8 - Pizza Party");
        System.out.print("How many people? ");
        Scanner in = new Scanner(System.in);
        int people = in.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizzas = in.nextInt();
        System.out.print("How many slices per pizza? ");
        int peices = in.nextInt();
        int slices = pizzas*peices;
        System.out.println(people + " people with " + pizzas + "pizzas ("+slices +" slices)");
        int perheadPeices = (int)slices/people;
        int leftover = slices-perheadPeices*people;
        System.out.println("Each person gets " + perheadPeices + " pieces of pizza.\nThere are " + leftover + " leftover pieces.");
    }
}
