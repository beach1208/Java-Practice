package Chapter3_Class;
import java.util.Scanner;
import java.util.Random;
public class RandomInteger { // positive integer をユーザーから受け取って 1 ~ input number の間の数字をだす
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Please enter a positive integer");
        int inputNum = input.nextInt();
        int randNum = generator.nextInt(inputNum) + 1;

        System.out.println("Your random number is " + randNum);
    }

}
