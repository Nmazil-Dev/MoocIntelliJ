package Part3_Arrays;

public class sum_of_array {
    public static int sumOfNumbersInArray(int[] array){
        int sum = 0;
        for (int number: array){
            sum += number;
        }
        return sum;
    }
    public static void main(String[] args){
        int numbers[] = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println("The sum of the array is: " + sumOfNumbersInArray(numbers));
    }
}
