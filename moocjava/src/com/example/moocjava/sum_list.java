package com.example.moocjava;
import java.util.Scanner;
import java.util.ArrayList;
public class sum_list {
    public static void main(String[] args){
        ArrayList <Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers to get the sum: ");
        while (true){
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1){
                break;
            } else{
                numbers.add(num);
            }
        }
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
        }
        System.out.println("The sum is " + sum);
        System.out.println("The average of the list is " + sum/numbers.size());
    }
}
