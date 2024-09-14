package oop1.ex.Account;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(1000);
        account.withdraw(1000);
        account.withdraw(2000);
        System.out.println("잔고: " + account.balance);
    }
}
