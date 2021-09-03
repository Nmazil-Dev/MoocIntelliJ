package Part3_Strings;
import java.util.Scanner;
public class av_club {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to search for 'av': ");
        while(true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            } else {
                String[] parts = input.split(" ");
                for (String part: parts){
                    if(part.contains("av")){
                        System.out.println(part);
                    }
                }
            }
        }
    }
}
