package Chapter9Inheritance;

public class Bicycle {
    protected  String brand;
    private int gear;
    private int speed;

    public Bicycle(String brand, int gear, int speed) {
        this.brand = brand;
        this.gear = gear;
        this.speed = speed;
    }


    public void speedUp(int increment){
        this.speed += increment;

    }

    public void applyBreak(int decrement){
        this.speed -= decrement;
    }



    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public int getGear() {
        return this.gear;
    }

    public void setGear(int newGear) {
        this.gear = newGear;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int getSpeed) {
        this.speed = getSpeed;
    }
}
