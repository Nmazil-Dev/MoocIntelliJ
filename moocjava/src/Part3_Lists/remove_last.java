package Part3_Lists;
import java.util.ArrayList;
public class remove_last {
    public static void removeLast(ArrayList<String> strings){
        if (strings.size() > 0) {
            strings.remove(strings.size() - 1);
        }
    }
    public static void main(String[] args){
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }
}
