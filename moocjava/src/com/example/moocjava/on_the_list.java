package com.example.moocjava;
import java.util.Scanner;
import java.util.ArrayList;
public class on_the_list {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Enter names for list: ");
        while (true) {
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            } else {
                names.add(name);
            }
        }
        System.out.println("Search for: ");
        String search = scanner.nextLine();
        if (names.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + "was not found");
            }
        }
    }
