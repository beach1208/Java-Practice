package Chapter8_Obj_Class;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean login = false;

        System.out.println("Enter your username: ");
        String userId = scan.nextLine();
        System.out.println("Enter your password: ");
        String userPw = scan.nextLine();
        System.out.println("Enter your age: ");
        int userAge = scan.nextInt();

        try{
            User u1 = new User(userId,userPw,userAge);
        } catch (IllegalArgumentException iE){
//            iE.printStackTrace();
            System.out.println("Password too short");
        } catch (AgeRestrictionException aE){
            System.out.println("Too young");
        } finally {
            System.out.println("Runs no matter what!");
        }


    }

}
