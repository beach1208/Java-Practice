package Chapter9Inheritance;

public class AnimalDrive {
    public static void main(String[] args) {
        System.out.println("------- Cat info -------");
        Cat c1 = new Cat("Sushi",5);
        c1.showProfile();
        c1.sleep();
        c1.Speak();

        System.out.println();

        System.out.println("------- Dog info -------");

        Dog d1 = new Dog("Stacy",4);
        d1.showProfile();
        d1.run();
        d1.Speak();

        System.out.println("------- Speak info -------");

        Animal[] myPets = new Animal[4];

        myPets[0] = new Cat("Tama",5);
        myPets[1] = new Dog("Pochi",5);
        myPets[2] = new Cat("Tama",5);
        myPets[3] = new Dog("Pochi", 5);

        for (Animal pet : myPets){
            pet.Speak();
        }
    }
}
