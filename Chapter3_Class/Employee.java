package Chapter3_Class;

public class Employee {
    private String firstname;
    private String lastname;
    private double monthlySalary;

    public Employee(String firstname, String lastname, double monthlySalary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.monthlySalary = monthlySalary;

    }

//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public double getMonthlySalary() {
//        return monthlySalary;
//    }

    public void setMonthlySalary() {
        if(monthlySalary > 0){
            this.monthlySalary = monthlySalary;

        }
        System.out.println(firstname + " "+ lastname + " Monthly Salary: " + this.monthlySalary);

    }

    public void yearlySalary(){
        System.out.println(firstname + " "+ lastname + " Yearly Salary: " + this.monthlySalary * 12);
    }

    public void raiseSalary(){
        System.out.println(firstname + " "+ lastname + " After raised Monthly Salary: "+ this.monthlySalary*1.10);
    }

    public void RaisedYearlySalary(){
        System.out.println(firstname + " "+ lastname + " After raised Yearly Salary: " + this.monthlySalary * 1.10 * 12);
    }




}
