package Chapter7_Array;

import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {

        //sum of array and average of array
        int [] a1 = {42,42,50,60,70,90};
        int sum = 0;
        int average = 0;
        for (int i = 1; i < a1.length; i++){
            sum += a1[i];
            average = sum / a1.length;
        }
        System.out.println(sum +" " + average);

        int [] a4 = {5,4,3,6,7,2,1};
        Exercises a2 = new Exercises();
        a2.sortArray();
        System.out.println(a2.sumArray(a4));
        a2.gridArray();
        System.out.println(a2.specialValue(a4,10));

    }

//    Write a Java program to sort a numeric array and a string array.
    int [] a2 = {5,4,3,6,7,2,1};
    public void sortArray(){
        System.out.println(Arrays.toString(a2));
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a2));
    }

    public int sumArray(int [] nums){
        int sum = 0;
        for(int number : nums){
            sum += number;

        }
        return sum;
    }

    public void gridArray(){
        for (int row = 1; row <= 10; row++){
            for (int col = 1; col <= 10; col++){
                System.out.print("-");
            }
            System.out.println();
        }

    }
//    Write a Java program to test if an array contains a specific value.
    public static boolean specialValue(int[] nums,int num){
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == num){
                return true;
            }
        }return false;
    }










}
