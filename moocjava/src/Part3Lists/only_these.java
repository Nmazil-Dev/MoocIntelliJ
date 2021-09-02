package Part3Lists;
import java.util.Scanner;
import java.util.ArrayList;
public class only_these {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> numbers = new ArrayList<>();
        System.out.println("Add numbers to list: ");
        while (true){
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1){
                break;
            } else {
                numbers.add(num);
            }
        }
        System.out.println("From where: ");
        int from  = Integer.valueOf(scanner.nextLine());
        System.out.println(numbers.get(from));
        System.out.println("To where:");
        int to = Integer.valueOf(scanner.nextLine());
        System.out.println(numbers.get(to));
    }
}
