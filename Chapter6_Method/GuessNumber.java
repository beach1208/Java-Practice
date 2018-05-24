package Chapter6_Method;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private String name;

//    public GuessNumber(String name) {
//        this.name = name;
//    }

    public void setName(){
        Scanner scan = new Scanner(System.in);
        String inputName = scan.nextLine();
        System.out.println("Welcome to Guess Number Game " + inputName);
    }

    public void randNumber(){
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();
        int randnumInput = scan.nextInt();
        int randomeNum = rd.nextInt(3)+1;
//        int randomeNum = (int)(Math.random()*3);
        System.out.println(randomeNum);


        while (randnumInput != randomeNum) {
            if (randnumInput != randomeNum) {
                System.out.println("Try Again");
            }
            randNumber();
            break;
        }
        if (randnumInput == randomeNum) {
            System.out.println("Correct!!");
        }
    }



}
