package com.generics;
//Use Case 1 is to give 3 integers and find out the maximum and its position in array.
//Use Case 2 is to give 3 floats and find out the maximum and its position in array.
//Use Case 3 is to give 3 strings and find out the maximum and its position in array.

import java.util.Scanner;

public class MaxOf3Strings <T> {

        public static void main(String[] args) {
            MaxOf3Strings testMaximum = new MaxOf3Strings();

            //Define the array where size is 3
            String[] array = addToArray();
            printArray(array);
            getMaximum(array);
        }

        //Get maximum from the array and its position.
        public static void getMaximum(String[] array) {
            String max = array[0];
            int position = 0;
            for (int i = 0; i < array.length; i++)
            {
                int a = array[i].compareTo(max);
                if(a > 0)
                {
                    max = array[i];
                    position = i;
                }
            }
            System.out.println("\nMaximum integer is : "+max);
            System.out.println("Maximum integer position is : "+position+" in array.");
        }

        //Printing to array.
        public static void printArray(String[] array) {
            System.out.println("Array is : ");
            for (int i = 0; i < array.length; i++)
            {
                System.out.print(array[i]+"  ");
            }
        }

        //Adding values to array.
        public static String[] addToArray() {
            System.out.println("Enter 3 values");
            Scanner scan = new Scanner(System.in);
            String x = scan.nextLine();
            String y = scan.nextLine();
            String z = scan.nextLine();
            scan.close();
            return new String[]{x,y,z};
        }

    }

