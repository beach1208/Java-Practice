package Chapter6_Method;

public class Method {
    private double instance_PI = 3.14;  // instance variable   non-static method からアクセスできる
    private static final double STATIC_PI = 3.14; //shared value  you want to have constant value


    public static void main(String[] args) {
        Method.printSomething("Nagisa"); // class 名とstatic method だけで動く class direct call
        System.out.println(Method.STATIC_PI);

        Method print2 = new Method(); // non static の時はnew instance 必要  non static >> new instance >> call method
        print2.printSomething2("Nagisa");
        System.out.println(print2.instance_PI);

    }

    public static void printSomething(String name){ // static method you can call without instance
        System.out.println("Hello " + name);

    }

    public static void printSomething2(String name){ // static method you can call without instance
        System.out.println("Hello " + name);

    }

    public void printSomething3(String name){
        if(name.length() >= 2) {
            System.out.println("Hello " + name);
            return;
        }
        System.out.println("Hi");
    }

//    public static void printSomething4(String name){ // static method you can call without instance
//        System.out.println("Hello " + name);
//        if(name.length() == 2){
//            return null;
//        }
//        return new int[]{1,2,3};
//
//    }


}
