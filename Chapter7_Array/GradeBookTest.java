package Chapter7_Array;

public class GradeBookTest {
    public static void main(String[] args) {
        int[] gradesArray = {87,68,94,100,83,78,85,91,76,87};
        GradeBook b1 = new GradeBook("CS101",gradesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n",b1.getCourseName());
        b1.printAll();
    }
}
