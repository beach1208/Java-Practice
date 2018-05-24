package ClassExe_RandomLetter_etc;

public class Ex4_22 {
    public static void main(String[] args) {
        System.out.printf("%-7s %-7s %-7s %-7s%n","N","10*N","100*N","1000*N");

        for(int i  = 1; i <= 5; i++){
            System.out.printf("%-7s %-7s %-7s %-7s%n",i,i*10,i*100,i*1000);
        }
    }
}
