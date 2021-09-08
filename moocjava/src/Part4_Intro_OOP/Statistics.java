package Part4_Intro_OOP;
import java.util.Scanner;
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        // write code here
        this.count +=1;
        this.sum += number;
    }

    public int getCount() {
        // write code here
        return this.count;
    }

    public int sum(){
        return this.sum;
    }

    public double average(){
        return (double)this.sum / this.count;
    }
    public static void main(String[] args){
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        Scanner scanner = new Scanner(System.in);
        while (true){
            int check = Integer.valueOf(scanner.nextLine());
            if (check != -1){
                statistics.addNumber(check);
                if (check % 2 == 0){
                    statisticsEven.addNumber(check);
                } else {
                    statisticsOdd.addNumber(check);
                }
            } else {
                break;
            }
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
    }
}

