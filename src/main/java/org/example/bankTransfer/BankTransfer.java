package org.example.bankTransfer;

public class BankTransfer {
    private Integer number;
    private Integer balance;
    public BankTransfer(Integer number, Integer balance) {
        this.number = number;
        this.balance = balance;
    }

    public Integer getBalance() {
        return balance;
    }

    void deposit(Integer amount) {
        this.balance  += amount;
    }

    void withdraw(Integer amount) {
        this.balance  -= amount;
    }

    void transfer(BankTransfer destination, Integer amount) {
        this.withdraw(amount);
        System.out.println(destination.balance);
        destination.deposit(amount);
    }

}
