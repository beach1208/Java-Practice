package Chapter4_FlowCont;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("John Williams",80.0);

        System.out.printf("%s's letter grade is: %s%n",student1.getName(),student1.getLetterGrade());
    }

}
