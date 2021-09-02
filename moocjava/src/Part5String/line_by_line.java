package Part5String;
import java.util.Scanner;
public class line_by_line {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to split: ");
        String input = scanner.nextLine();
        if (input.equals("")){
            System.out.println("No input");
        } else {
            String[] pieces = input.split(" ");
            for(String piece: pieces){
                System.out.println(piece);
            }
        }
    }
}
