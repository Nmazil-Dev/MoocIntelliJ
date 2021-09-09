package Part4_Objects_In_A_List;
import java.util.Scanner;
import java.util.ArrayList;
public class PersonalInformation {
    private String first;
    private String last;
    private int identification;
    public PersonalInformation(String first, String last, int id){
        this.first = first;
        this.last = last;
        this.identification = id;
    }
    public String toString(){
        return this.first + " " + this.last;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInformation> information = new ArrayList<>();
        while (true){
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()){
                break;
            } else {
                System.out.print("Last Name: ");
                String lastName = scanner.nextLine();
                System.out.print("Id Number: ");
                int identification = Integer.valueOf(scanner.nextLine());
                information.add(new PersonalInformation(firstName, lastName, identification));
            }
        }
        for (PersonalInformation person:information){
            System.out.println(person);
        }
    }
}
