package Part3Lists;
import java.util.Scanner;
import java.util.ArrayList;
public class index_of {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> numbers = new ArrayList<>();
        System.out.println("Add new numbers to the array: ");
        while (true){
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1){
                break;
            } else {
                numbers.add(num);
            }
        }
        System.out.println("Search for: ");
        int search = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) == search){
                System.out.println(search + " is at index: " + i);
            }
        }

    }
}
