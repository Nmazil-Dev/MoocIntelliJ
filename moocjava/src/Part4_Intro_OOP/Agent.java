package Part4_Intro_OOP;

public class Agent {
    private String first;
    private String last;
    public Agent(String first, String last){
        this.first = first;
        this.last = last;
    }
    public String toString(){
        return "My name is " + last + ", " + first + " " + last;
    }
    public static void main(String[] args){
        Agent bond = new Agent("James", "Bond");

        bond.toString(); // prints nothing
        System.out.println(bond);

        Agent ionic = new Agent("Ionic", "Bond");
        System.out.println(ionic);
    }
}
