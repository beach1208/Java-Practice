package Chapter9Inheritance;

public class Client {
    public static void main(String[] args) {
        MountainBicycle mb1 = new MountainBicycle("Nike",20,10,20);
        mb1.setSeatHeight(30);
        mb1.speedUp(30);
        mb1.applyBreak(5);

        System.out.println(mb1.getSpeed());

    }
}
