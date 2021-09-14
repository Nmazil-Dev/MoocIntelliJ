package Part4_Files_And_Data;
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;
public class IsInFile {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        while(true){
            System.out.print("File to search: ");
            String fileInput = reader.nextLine();
            System.out.print("Person to find: ");
            String person = reader.nextLine();
            try (Scanner scanner = new Scanner(Paths.get(fileInput))){
                while(scanner.hasNextLine()){
                    if (scanner.nextLine().equals(person)){
                        System.out.println("Found!");
                        break;
                    } else {
                        System.out.println("Not Found.");
                        break;
                    }
                }
            } catch (Exception e){
                System.out.println("Reading the file for " + fileInput + " failed.");
                break;
            }
            break;
        }
    }
}
