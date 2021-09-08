package Part4_Intro_OOP;

public class DecreasingCounter {
    private int value;

    public DecreasingCounter(int initialValue){
        this.value = initialValue;
    }

    public void printValue(){
        System.out.println("Value: " + this.value);
    }
    public void decrement(){
        if (this.value >= 0){
            this.value -= 1;
        }
    }
    public void reset(){
        this.value = 0;
    }
    public static void main(String[] args){
        DecreasingCounter counter = new DecreasingCounter(10);
        counter.printValue();
        counter.decrement();
        counter.printValue();
        counter.reset();
        counter.printValue();
    }
}
