package Part4_Intro_OOP;

public class Door {
    public void knock(){
        System.out.println("Who's there?");
    }
    public static void main(String[] args){
        Door alexander = new Door();
        alexander.knock();
    }
}
