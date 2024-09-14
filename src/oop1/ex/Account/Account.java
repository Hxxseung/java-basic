package oop1.ex.Account;

public class Account {
    int balance;


    void deposit(int amount){
        balance +=  amount;
    }

    void withdraw(int amount){
        if(balance >= amount){
            balance -= amount;
        }else{
            System.out.println("Insufficient balance");
        }
    }
}
