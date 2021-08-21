package com.khubaib;

import java.util.Scanner;

public class DupElem {

    public static void main(String[] args) {

        //declaring input variable
        Scanner input = new Scanner(System.in);

        //asking the user how many elements would they like in the array
        System.out.println("enter the number of elements in the array: ");
        int total = input.nextInt();

        //declaring the array
        int array[] = new int [total];

        //inputing the numbers in the array
        for (int i = 0 ; i <total; i++){
            System.out.println("Enter the number in array: ");
            array[i] = input.nextInt();
        }

        //another array which will contain the frequency of each element
        int[] frequencies = new int[array.length];

        int a = -1;

        //two for loops take one element from the array and compares it with the other elements
        //to check for the equivalent element
        for (int i = 0 ; i < array.length;i++){
            int freq = 1;

            for (int j = i+1 ; j < array.length; j++){
                if (array[i] == array[j]){

                    freq++;
                    frequencies[j]= a;
                }
                if(frequencies[i] != a){
                    frequencies[i] = freq;
                }
            }
        }

        //printing the element along with its frequency
        System.out.println("Element\tFrequency");
        for (int i =0 ; i < frequencies.length; i++){
            if(frequencies[i] != a) {
                System.out.println(array[i]+"\t"+frequencies[i]);
            }
        }
    }

}
