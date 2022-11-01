package com.generics;

import java.util.Scanner;

//Use Case 1 is to give 3 integers and find out the maximum and its position in array.
//Use Case 2 is to give 3 floats and find out the maximum and its position in array.
public class MaxOf3Floats {


        public static void main(String[] args) {
            MaxOf3Floats testMaximum = new MaxOf3Floats();

            Float[] array = addToArray();            //Define the array where size is 3

            printArray(array);
            getMaximum(array);
        }

        //Get maximum from the array and its position
        public static void getMaximum(Float[] array) {
            float max = array[0];
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

        //Printing the array.
        public static void printArray(Float[] array) {
            System.out.println("Array is : ");
            for (int i = 0; i < array.length; i++)
            {
                System.out.print(array[i]+"  ");
            }
        }

        //Adding values to array.
        public static Float[] addToArray() {
            System.out.println("Enter 3 values");
            Scanner scan = new Scanner(System.in);
            float x = scan.nextFloat();
            float y = scan.nextFloat();
            float z = scan.nextFloat();
            scan.close();
            return new Float[]{x,y,z};
        }
    }

