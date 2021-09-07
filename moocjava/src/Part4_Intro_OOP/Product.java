package Part4_Intro_OOP;

public class Product {
    private String initialName;
    private double initialPrice;
    private int initialQuantity;
    public Product(String initialName, double initialPrice, int initialQuantity){
        this.initialName = initialName;
        this.initialPrice = initialPrice;
        this.initialQuantity = initialQuantity;
    }
    public void printProduct(){
        System.out.print(initialName + ", price " + initialPrice + ", " + initialQuantity + " pcs");
    }
    public static void main(String[] args){
        Product banana = new Product("Banana", 1.1, 13);
        banana.printProduct();
    }
}
