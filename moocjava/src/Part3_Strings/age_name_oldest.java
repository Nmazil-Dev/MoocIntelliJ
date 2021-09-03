package Part3_Strings;
import java.util.Scanner;
public class age_name_oldest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter csv names to extract age and name of oldest: ");
        String oldestName = "";
        int oldestAge = 0;
        int count = 0;
        int sumYears = 0;
        int longestNameNum = 0;
        String longestName = "";
        while(true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            } else {
                String[] parts = input.split(",");
                int age = Integer.valueOf(parts[1]);
                if (age > oldestAge){
                    oldestName = parts[0];
                    oldestAge = age;
                }
                if(parts[0].length() > longestNameNum){
                    longestNameNum = parts[0].length();
                    longestName = parts[0];
                }
                int birthYear = 2021 - age;
                sumYears += birthYear;
                count += 1;
            }
        }
        double averageYears = sumYears / count;
        System.out.println("Name of oldest: " + oldestName);
        System.out.println("Age of oldest: " + oldestAge);
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageYears);
    }
}
