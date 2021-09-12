/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 alden bagarra
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print( "What is your weight in pounds? " );
        double wgt = scnN.nextDouble();
        System.out.print("What is your height in inches? ");
        double hgt = scnN.nextDouble();
        double bmi = (wgt/(hgt*hgt))*703;
        if(bmi > 18.5 && bmi < 25){
            System.out.print("Your BMI is "+ String.format("%.1f", bmi) +"."+
                    "\nYou are within the ideal weight range.");
        }
        if(bmi < 18.5){
            System.out.print("Your BMI is "+ String.format("%.1f", bmi) +"."+
                    "\nYou are underweight. You should see your doctor.");
        }
        if(bmi > 25){
            System.out.print("Your BMI is "+ String.format("%.1f", bmi) +"."+
                    "\nYou are overweight. You should see your doctor.");
        }
    }
}
