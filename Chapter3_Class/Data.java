package Chapter3_Class;

public class Data {
    private int month;
    private int day;
    private int year;

    public Data(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() { return month; }

    public void setMonth(int month) { this.month = month; }

    public int getDay() { return day; }

    public void setDay(int day) { this.day = day;}

    public int getYear() {return year; }

    public void setYear(int year) {this.year = year;}

    public void displayDate(){
        System.out.println(this.month +"/"+ this.day + "/" +this.year);
    }

}
