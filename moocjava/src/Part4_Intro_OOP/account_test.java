package Part4_Intro_OOP;
public class account_test{
    public static class Account {
        private double balance;
        private String name;
        private int withdrawal;
        private double newBalance;

        public Account(String name, double balance) {
            this.balance = balance;
            this.name = name;
        }
        public void withdraw(int withdrawal){
            this.balance -= withdrawal;
        }
        public void deposit(int deposit){
            this.balance += deposit;
        }
        public double balance(){
            return this.balance;
        }
    }
    public static void main(String[] args) {
        Account artosAccount = new Account("Arto's account", 100.0);
        artosAccount.withdraw(50);
        System.out.println(artosAccount.balance());
        artosAccount.deposit(200);
        System.out.println(artosAccount.balance());
    }
}



