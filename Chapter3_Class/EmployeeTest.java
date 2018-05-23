package Chapter3_Class;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee em1 = new Employee("John","Smith",4000);
        Employee em2 = new Employee("David","Park",5000);
        em1.setMonthlySalary();
        em2.setMonthlySalary();

        em1.yearlySalary();
        em2.yearlySalary();

        em1.raiseSalary();
        em2.raiseSalary();

        em1.RaisedYearlySalary();
        em2.RaisedYearlySalary();


    }


}
