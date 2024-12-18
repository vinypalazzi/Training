package exercicios.java.ClassesEMetodos;

public class BankAccount {
    String name;
    int AccountNumber;
    double Balance;

    BankAccount(String YourName, int YourAccountNumber, double YourBalance) {
        name = YourName;
        AccountNumber = YourAccountNumber;
        Balance = YourBalance;
    }

    void deposit(double Deposit) {
        Balance += Deposit;
    }

    void withdrawal(double Withdrawal) {
        Balance -= Withdrawal;
    }

    String display_balance() {
        return String.format("$%.2f", Balance);
    }
}
