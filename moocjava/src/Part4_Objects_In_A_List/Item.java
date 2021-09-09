package Part4_Objects_In_A_List;
import java.util.Scanner;
import java.util.ArrayList;
public class Item {
    private String name;
    private int created;

    public Item(String name, int created){
        this.name = name;
        this.created = created;
    }
    public String toString(){
        return this.name + " (created at: " + this.created + ")";
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        int counter = 0;
        while (true){
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            } else {
                items.add(new Item(name, counter));
                counter++;
            }
        }
        for (Item item:items){
            System.out.println(item);
        }
    }
}
