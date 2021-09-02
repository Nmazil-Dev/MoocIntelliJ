package Part4Arrays;
import java.util.Scanner;
public class swap {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;
        for (int number: numbers){
            System.out.println(number);
        }
        System.out.println("Give first index to swap: ");
        int firstIndex = Integer.valueOf(scanner.nextLine());
        System.out.println("Give second index to swap: ");
        int secondIndex = Integer.valueOf(scanner.nextLine());
        int first = numbers[firstIndex];
        int second = numbers[secondIndex];
        numbers[firstIndex] = second;
        numbers[secondIndex] = first;
        for (int number: numbers){
            System.out.println(number);
        }
    }
}
