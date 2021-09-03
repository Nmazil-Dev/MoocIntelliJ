package Part3_Strings;
import java.util.Scanner;
public class first_words {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string and get the first and last parts: ");
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            } else {
                String[] parts = input.split(" ");
                System.out.println("First part: " + parts[0]);
                System.out.println("Last part: " + parts[parts.length - 1]);
            }

        }


    }
}
