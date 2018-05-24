package Chapter6_Method;

import java.util.Scanner;

public class MethodExercise {
    public static void main(String[] args) {
        //6.7
        double a = Math.abs(-7.5); //return positive value
        System.out.println(a);

        double b = Math.floor(7.9); //　7.0 になる　切り捨て
        System.out.println(b);

        double c = Math.abs(0.0);
        System.out.println(c);

        double d = Math.ceil(-6.4); //切り上げ
        System.out.println(d);

        double e = Math.ceil(6.4);
        System.out.println(e);

        double f = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
        System.out.println(f);

        //6.9
        Scanner scan = new Scanner(System.in);
        double input = scan.nextDouble();
        System.out.println(input);

        double y = Math.floor(input + 0.5);
        System.out.println(y);

        //6.17
        System.out.println(isEven(2));

        //6.23
        float num1 = scan.nextFloat();
        float num2 = scan.nextFloat();
        float num3 = scan.nextFloat();
        System.out.println(minimum3(num1,num2,num3));




    }

    // 6. 17 even = 奇数　odd = 偶数
    public static boolean isEven(int num){
        if(num % 2 == 1){
            return true;
        }
        return false;

    }

    //6.23
    public static float minimum3(float num1,float num2,float num3){
        return Math.min(num1,Math.min(num2,num3));
    }









}
