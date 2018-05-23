package Chapter4_FlowCont;

public class Ex4_5 {
    public static void main(String[] args) {
       int x = 1;
       int total = 0;

       while(x <= 10){
           int y = x * x;
           System.out.println(y);
           total += y;
           ++x;
       }
        System.out.println("Total is " + total);
    }
}
