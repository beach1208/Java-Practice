package Chapter3_Class;

public class Account {
    private String name;
    private double balance;

    public Account(String name,double balance) {
        this.name = name;

        if(balance > 0)
            this.balance = balance;
    }

    public void deposit(double depositAmount){
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }

    public void withdraw(double withdrawAmount){
        if(balance > withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println(balance);
        }else if(balance < withdrawAmount){
            this.balance = balance;
            System.out.println("Withdrawal amount exceeded account balance");
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
