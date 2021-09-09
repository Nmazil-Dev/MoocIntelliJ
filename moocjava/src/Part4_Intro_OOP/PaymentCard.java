package Part4_Intro_OOP;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
    }

    public String toString(){
        return "This card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably(){
        if (this.balance - 2.60 > 0){
            this.balance -= 2.60;
        }
    }

    public void eatHeartily(){
        if (this.balance - 4.60 > 0){
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount){
        if (amount > 0){
            this.balance += amount;
        }
    }

    public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println("Paul's Card Balance: " + paulsCard);
        System.out.println("Paul's Card Balance: " + mattsCard);
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.println("Paul's Card Balance: " + paulsCard);
        System.out.println("Paul's Card Balance: " + mattsCard);
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println("Paul's Card Balance: " + paulsCard);
        System.out.println("Paul's Card Balance: " + mattsCard);
    }
}
