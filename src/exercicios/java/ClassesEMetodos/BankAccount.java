package exercicios.java.ClassesEMetodos;

public class BankAccount {
    String name;
    int accountNumber;
    double balance;

    BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double deposit) {
        balance += deposit;
    }

    void withdrawal(double withdrawal) {
        balance -= withdrawal;
    }

    String display_balance() {
        return String.format("$%.2f", balance);
    }
}
