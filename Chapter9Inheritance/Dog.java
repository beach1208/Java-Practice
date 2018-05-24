package Chapter9Inheritance;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void showProfile() {
        super.showProfile();
    }

    @Override
    public void Speak() {
        System.out.println("Wof wof!");
    }

    public void run(){
        System.out.println("Run! Run!");
    }

}
