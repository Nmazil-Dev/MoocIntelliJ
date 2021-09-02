package Part4Arrays;

public class print_in_stars {
    public static void printArrayInStars(int[] array){
        for(int number: array){
            int stars = 1;
            while(stars < number) {
                System.out.print("*");
                stars += 1;
            }
            if (stars == number){
                System.out.println("*");
            }
        }
    }
    public static void main(String[] args){
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }
}
