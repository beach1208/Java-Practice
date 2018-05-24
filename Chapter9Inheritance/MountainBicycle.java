package Chapter9Inheritance;

public class MountainBicycle extends Bicycle {
    //inheritance from bicycle class
    //brand is private class so i cant access from this class

    private  int seatHeight;

    public MountainBicycle(String brand, int gear, int speed, int seatHeight) {
        // first create super class
        //initializing my properties
        //super class constructor needs to be set up here
        super(brand, gear, speed); // have to create a super class constructor to create an instance
        this.seatHeight = seatHeight;

    }

    public void setSeatHeight(int newHeight){
        this.seatHeight = newHeight;
        this.brand = ""; //protected class you can access in subclass
    }


}
