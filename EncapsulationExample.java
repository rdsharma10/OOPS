class Account {
    private String owner;
    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public String getOwner() {
        return owner;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Account acc = new Account("Rishi", 5000);
        acc.deposit(1000);
        acc.withdraw(200);
        System.out.println("Balance for " + acc.getOwner() + ": " + acc.getBalance());
    }
}