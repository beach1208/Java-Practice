package Chapter4_FlowCont;

public class TableOutput4_22 {
    public static void main(String[] args) {
        System.out.printf("%7s%7s%7s%7s", "N", "10*N", "100*N", "1000*N");
        for (int i = 1; i < 5; i++) {
            System.out.println();
            System.out.printf("%7s%7s%7s%7s", i, i * 10, i * 100, i * 1000);
        }

        int row = 10;
        while (row >= 1) {
            int column = 1;
            while (column <= 10) {
                System.out.println(row % 2 == 1 ? "<" : ">");
                ++column;
            }

            --row;
            System.out.println();
        }


        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 5; j++){
                System.out.print("@");


            }
            System.out.println();
        }

        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");


            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 10; i++){
            for (int j = 10; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 10; i++){
            for (int j = 10; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for(int i = 1; i <= 4; i++){
            for (int j = 1; j <= 4; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }



}


