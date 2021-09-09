package Part4_Files_And_Data;
import java.sql.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;
public class GuestList {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> guests = new ArrayList<>();
        ArrayList<String> files = new ArrayList<>();
        String fileOne = "names.txt";
        String fileTwo = "other-names.txt";
        files.add(fileOne);
        files.add(fileTwo);

        // Get the guests for the array from files
        for (String file:files){
            //Make a scanner to read the files
            try (Scanner scanner = new Scanner(Paths.get(file))){
                while (scanner.hasNextLine()){
                    guests.add(scanner.nextLine());
                }
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
        //Check if user input name == name in guests
        System.out.println("Enter names, an empty line quits: ");
        while (true){
            String name = input.nextLine();
            if(name.isEmpty()){
                break;
            } else if (guests.contains(name)){
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list");
            }


        }
    }
}
