package Entities;

public class Account {

    private int number;
    private String holder;
    private double balance;

    public Account(){}

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber(int number){ return number;
    }

    public double getBalance(){ return balance;
    }

    public String getHolder(String holder){ return holder;
    }

    public void setHolder(){ this.holder = holder; }

    public double getBalance(double balance){return balance;}

    public double withdraw(double amount){
        return balance -= amount + 5.0;
    }

    public double deposit(double amount){
        return balance +=amount;
    }

    @Override
    public String toString() {
        return "Account = " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
    }
}
