package Chapter9Inheritance;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void showProfile() {
        super.showProfile();
    }

    @Override
    public void Speak() {
        System.out.println("Myao! Myao!");
    }

    public void sleep(){
        System.out.println("Sleeping");
    }
}
