package Part5String;
import java.util.Scanner;
public class is_it_true {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a string: ");
        String input = scanner.nextLine();
        if(input.equals("true")){
            System.out.println("You got it right!");
        } else{
            System.out.println("Try again!");
        }

    }
}
