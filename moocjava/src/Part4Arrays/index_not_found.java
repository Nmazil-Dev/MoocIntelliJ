package Part4Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class index_not_found {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numbers[] = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;
        System.out.print("Search for: ");
        int num = Integer.valueOf(scanner.nextLine());
        int index = 0;
        while (index < numbers.length){
            if (numbers[index] == num){
                System.out.println(num + " is at index " + index + ".");
                break;
            } else {
                index++;
            }
        }
        if (index == numbers.length){
            System.out.println(num + " was not found.");
        }
    }
}
