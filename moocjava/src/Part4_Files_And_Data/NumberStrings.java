package Part4_Files_And_Data;
import java.util.Scanner;
public class NumberStrings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
