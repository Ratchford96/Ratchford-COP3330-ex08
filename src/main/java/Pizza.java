/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joseph Ratchford
 */

import java.util.Scanner;
public class Pizza {
    public static void main(String[] args)
    {

        // Here we declare our integers;
        int numPeople;
        int pizza;
        int slices;
        int total;
        int totalSlices;
        int pieces;
        int slicesLeft;
        Scanner scan = new Scanner(System.in);

        // This is where we input the number of people
        System.out.print("How many people?");
        numPeople = scan.nextInt();
        // This is where we tell the user how many slices
        System.out.print("How many pizzas do you have?");
        pizza = scan.nextInt();

        System.out.print("How many slices per pizza?");
        slices = scan.nextInt();
        // This math calculate the total slices of pizza
        totalSlices = slices * pizza;

        System.out.println(numPeople + " people with " + pizza + " pieces of pizza" + " ( " + totalSlices + " slices ) ");
        //  This calculates the slices left over the people eat the pizza if any
        slicesLeft = slices % pizza;

        System.out.println("Each person gets " + pizza + " pieces of pizza. ");

        System.out.println("There are " + slicesLeft + " left over pieces.");


    }
}
