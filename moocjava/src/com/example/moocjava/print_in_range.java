package com.example.moocjava;
import java.util.Scanner;
import java.util.ArrayList;
public class print_in_range {
    static void PrintNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        System.out.println("The numbers in the range " + "[" + lowerLimit + "," + upperLimit + "]");
        for(int number: numbers){
            if (number <= upperLimit && number >= lowerLimit){
                System.out.println(number);
            }
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        PrintNumbersInRange(numbers, 0,5);
    }
}
