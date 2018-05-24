package Chapter9Inheritance;

public class Animal {
    private String Name;
    private int Age;

    public Animal(String name, int age) {
        Name = name;
        Age = age;
    }

    public void showProfile(){
        System.out.println("Name is " + Name +" "+  Age + " years old");
    }

    public void Speak(){
        System.out.println("......");
    }


}
