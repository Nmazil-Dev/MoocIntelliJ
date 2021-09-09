package Part4_Objects_In_A_List;
import java.util.Scanner;
import java.util.ArrayList;
public class Book {
    private String title;
    private int pages;
    private int year;
    public Book(String title, int pages, int year){
        this.title = title;
        this.pages = pages;
        this.year = year;
    }
    public String toString(){
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
    public static void main(String[] args){
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Title: ");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication Year: ");
            int year = Integer.valueOf(scanner.nextLine());
            books.add(new Book(name,pages, year));
        }
        System.out.print("What information should be printed: ");
        String information = scanner.nextLine();
        for (Book book:books){
            if (information.equals("everything")){
                System.out.println(book);
            } else if (information.equals("name")){
                System.out.println(book.title);
            }
        }
    }
}
