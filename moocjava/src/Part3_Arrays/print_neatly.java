package Part3_Arrays;

public class print_neatly {
    public static void printNeatly(int[] array){
        int index = 0;
        while (index < array.length){
            if (index == array.length - 1){
                System.out.print(array[index]);
                index++;
            } else {
                System.out.print( array[index] + ", ");
                index++;
            }
        }
    }
    public static void main(String[] args){
        int[] array = {5, 4, 3, 2, 1};
        printNeatly(array);
    }
}
