package EmailApp;

import java.util.Scanner;

public class EmailApp {
    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String emailSuffix = "company.com";
    private String password;
    private int capacity = 500;
    private int defaultPasswordLength = 10;
    private String alterEmail;
    private int changePassword;

    //Constructor to receive the firstname and lastname

    public EmailApp(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println(firstName + lastName);
        this.department = setDepartment();
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is " + this.password);

        email = firstName.toLowerCase() + "."+ lastName.toLowerCase() + "@" + department.toLowerCase() + "."+ emailSuffix;
        System.out.println("Your email address : " + email);
    }

    //Ask for the department
    public String setDepartment() {
        System.out.print("Hello "+ firstName + "\nEnter the Department Dode \n1 for Sales\n2 for Development\n3 for Accounting ");
        Scanner scan = new Scanner(System.in);
        int depChoice = scan.nextInt();

        if(depChoice == 1){
            return  "Sales";
        }else if(depChoice == 2){
           return "Development";
        }else if(depChoice == 3){
           return "Accounting";
        }else{
            return  "";
        }

    }

//Generate random passwords
    public String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length;i++){
            int rand = (int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //Set the mailbox capacity
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
    //Set the alternate email

    public void setAlterEmail(String alterEmail) {
        this.alterEmail = alterEmail;
    }

    public String getAlterEmail() {
        return alterEmail;
    }

    public void setChangePassword(int changePassword) {
        this.changePassword = changePassword;
    }

    public int getChangePassword() {
        return changePassword;
    }


    public String showInfo(){
        return "DISPLAY NAME: " + firstName + ""+ lastName +
                "\nCOMPANY EMAIL: " + email+
                "\nMAILBOX CAPACITY: " + capacity + "MB";

    }
}

