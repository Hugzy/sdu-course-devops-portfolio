package dk.magida.bankingsolution;

public class Account {

    int balance;

    public Account() {
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public void withdrawal(int amount){
        balance -= amount;
    }
}
