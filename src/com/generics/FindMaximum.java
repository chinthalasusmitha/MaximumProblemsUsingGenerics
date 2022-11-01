package com.generics;

import java.util.Scanner;

public class FindMaximum {
        public static void main(String[] args) {
            FindMaximum testMaximum = new FindMaximum();

            Integer[] array = addToArray();            //Define the array where size is 3
            printArray(array);
            getMaximum(array);
        }

        //Get maximum from the array and its position.
        public static void getMaximum(Integer[] array) {
            int max = array[0];
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
        public static void printArray(Integer[] array) {
            System.out.println("Array is : ");
            for (int i = 0; i < array.length; i++)
            {
                System.out.print(array[i]+"  ");
            }
        }

        //Adding values to array.
        public static Integer[] addToArray() {
            System.out.println("Enter 3 values");
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            scan.close();
            return new Integer[]{x,y,z};
        }
    }
