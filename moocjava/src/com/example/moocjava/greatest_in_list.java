package com.example.moocjava;
import java.util.Scanner;
import java.util.ArrayList;
public class greatest_in_list {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            } else {
                nums.add(num);
                }
            }
        int greatest = nums.get(0);
        int smallest = nums.get(0);
        for (int i = 0; i < nums.size();i++){
            if (nums.get(i) > greatest){
                greatest = nums.get(i);
            }
            if (nums.get(i) < greatest){
                smallest = nums.get(i);
            }

        }
        for (int i = 0; i < nums.size(); i++){
            if(nums.get(i) == greatest){
                System.out.println("The greatest number is: " + greatest);
                System.out.println("Greatest is at index: " + i);
            }
            if(nums.get(i) == smallest){
                System.out.println("The greatest number is: " + smallest);
                System.out.println("Greatest is at index: " + i);
            }
        }

        System.out.println("The smallest number is: " + smallest);
        }
    }