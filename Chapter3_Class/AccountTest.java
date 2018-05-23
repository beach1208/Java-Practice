package Chapter3_Class;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        //create a Scanner object to obtain input from the command window.
        Scanner input = new Scanner(System.in);

        //create an Account object and assign it to myAccount
        Account myAccount1 = new Account("Jane Green",50);
        Account myAccount2 = new Account("John Blue",-7.59);
        myAccount1.withdraw(60);

        System.out.printf("%s balance: $%.2f%n",myAccount1.getName(),myAccount1.getBalance());
        System.out.printf("%s balance: $%.2f%n",myAccount2.getName(),myAccount2.getBalance());

    }
}
