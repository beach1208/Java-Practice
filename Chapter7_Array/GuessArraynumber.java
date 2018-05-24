package Chapter7_Array;

import java.util.Scanner;

public class GuessArraynumber {
    public static void main(String[] args) {
        int[] numbers = {3,4,9};
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == input){
                System.out.println("Correct");
            }
        }


        //MoneyList Javaスッキリの問題

        int[] moneyList = {121902,8302,55100};
        for (int List: moneyList){
            System.out.println(List);
        }

    }
}
