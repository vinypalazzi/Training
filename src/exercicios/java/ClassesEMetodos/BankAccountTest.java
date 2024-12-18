package exercicios.java.ClassesEMetodos;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount conta1 = new BankAccount("Vinicius", 1, 100);
        BankAccount conta2 = new BankAccount("Magda", 2, 1000);

        System.out.println(conta1.display_balance());
        System.out.println(conta2.display_balance());

        conta1.deposit(25);
        conta2.deposit(500);

        System.out.println(conta1.display_balance());
        System.out.println(conta2.display_balance());

        conta1.withdrawal(50);
        conta2.withdrawal(250);

        System.out.println(conta1.display_balance());
        System.out.println(conta2.display_balance());
    }
}
