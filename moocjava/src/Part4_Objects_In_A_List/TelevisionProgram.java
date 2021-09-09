package Part4_Objects_In_A_List;
import java.util.ArrayList;
import java.util.Scanner;
public class TelevisionProgram {
    private String name;
    private int duration;
    public TelevisionProgram(String name, int duration){
        this.name = name;
        this.duration = duration;
    }
    public String toString(){
        return this.name + ", " + duration + " minutes";
    }
    public static void main(String[] args){
        ArrayList <TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(name, duration));
        }
        System.out.print("Program's maximum duration: ");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram program:programs){
            if(program.duration <= maxDuration){
                System.out.println(program);
            }
        }
    }
}
