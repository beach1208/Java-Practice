package Chapter5;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        System.out.printf("%20.2f",3.142484948); //右に−７スペース　ーじゃなかったら左からスペース
        System.out.printf("%.5f",3.142484948); // 小数点5位まで出る

        int a = 10;
        int b = 11;

        if((a == 9) && (b / 0 >= 10)){ //a /0 >= 10だとエラーだし || でもエラー。でもa == 9はtrueでそこを先に読んで　bはエラーにならない
            System.out.println("Hi");
        }else{
            System.out.println("Bye");
        }

        if((a == 10) || (b / 0 >= 10)){
            System.out.println("Hi");
        }else{
            System.out.println("Bye");
        }

       for (int i = 0; i < 10; i++){
           if(i == 7){
               continue;
           }
           int sum = i;
           System.out.print(i + " ");
       }

        for (int i = 0; i < 10; i++){
            if(i == 7){
                break;
            }
            System.out.print(i + " ");
        }

    }


    //switch statement
}
