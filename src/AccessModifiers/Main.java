package AccessModifiers;

public class Main {
    public static void main(String[] args) {
        Account timsAccount = new Account("Tim");
        timsAccount.deposit(1000);
        timsAccount.withdraw(500);
        timsAccount.withdraw(-200);
        timsAccount.deposit(-20);
        timsAccount.calculateBalance();

//        timsAccount.balance = 5000;


        System.out.println("Balance on account is " + timsAccount.getBalance());
        //modified because access modifier is public
//        timsAccount.transactions.add(3400);
//        timsAccount.calculateBalance();
    }
}
