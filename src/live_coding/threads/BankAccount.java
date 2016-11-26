package live_coding.threads;

import java.util.Random;

public class BankAccount {

    private int balance = 0;

    private Object lock = new Object();
    private Object depositLock = new Object();
    private Object withdrawallock = new Object();

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public synchronized void deposit(int amount) {
        synchronized (lock) {
            balance = balance + amount;
        }
    }

    public void withdraw(int amount) {

        if (balance < amount)
            return;

        synchronized (lock) {
            balance = balance - amount;
        }

    }
}
