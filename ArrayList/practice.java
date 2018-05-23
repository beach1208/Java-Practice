package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class practice {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList();
        list1.add("Red");
        list1.add("Blue");
        list1.add("Yellow");
        list1.add("Green");
        list1.add(0,"Purple"); //insert an elemtn at the first position.


        for (String arr: list1){
            System.out.println(arr); //Array loop(データ型　変数名: Array変数名)
        }

        if(list1.contains("Green")){
            System.out.println("Yes");
        }

        System.out.println(list1);
        System.out.println(list1.get(2));
        System.out.println(list1.remove(2));
        System.out.println();

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(50);
        nums.add(30);
        nums.add(140);
        nums.add(2);

        for (int i = 0; i < nums.size(); i++){
            System.out.println(nums.get(i));

        }
        System.out.println(nums.size());

        System.out.println(nums);

        Collections.sort(nums);
        System.out.println(nums);


    }
}
