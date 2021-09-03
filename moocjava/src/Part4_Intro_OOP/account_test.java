package Part4_Intro_OOP;
public class account_test{
    public static class Account {
        private double balance;
        private String name;
        private int withdrawal;

        public Account(String name, double balance) {
            this.balance = balance;
            this.name = name;
        }
        public void withdraw(int withdrawal){
            this.balance -= this.withdrawal;
        }
        public double balance(){
            return this.balance;
        }
    }
    public static void main(String[] args) {
        Account artosAccount = new Account("Arto's account", 100.0);
        artosAccount.withdraw(5);
        System.out.println(artosAccount.balance());
    }
}



