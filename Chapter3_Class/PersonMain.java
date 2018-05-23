package Chapter3_Class;

public class PersonMain {
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++){
////            Person p1 = new Person();
////            System.out.println(p1.instancecount);
////        }

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();

        System.out.println(p4.localCount + "," + Person.instancecount);


        int x = 6;
        x++;

        System.out.println(x);

        int y = 6;
        int c = y++;
        int z = ++y;
        System.out.println(z);





    }
}
