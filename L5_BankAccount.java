// В класс BankAccount добавьте 2 метода
// Первый метод - пополнение счета - увеличивает баланс на сумму, указанную в параметре этого метода
// Второй метод - снятие со счета - уменьшает баланс на сумму, указанную в параметре этого метода


package Homework.Lesson5;

public class BankAccount {

    int id = 10;
    String name = "Margarita";
    double balance = 100.1;

    void replenish(double addsum) {
        System.out.println("Balance before replenishing: " + balance);
        System.out.println("Balance is being recharged for: " + addsum);
        balance += addsum;

        System.out.println("Balance after replenishing: " + balance);
        System.out.println();
    }

    void withdrawal(double takesum) {
        System.out.println("Balance before withdrawal: " + balance);
        System.out.println("Balance is being declined for: " + takesum);
        balance -= takesum;
        System.out.println("Balance after withdrawal: " + balance);
        System.out.println();
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        MyAccount.replenish(30.5);
        MyAccount.withdrawal(20.1);

    }
}
