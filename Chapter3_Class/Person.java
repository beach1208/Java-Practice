package Chapter3_Class;

public class Person {
    public static int instancecount;
    public int localCount;

    public Person(){
        instancecount++;
        localCount++;
    }

}
