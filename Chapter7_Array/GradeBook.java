package Chapter7_Array;

public class GradeBook {
    private String courseName;
    private int[] grades;

    public GradeBook(String courseName, int[] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void printAll(){
        outputGrades(grades);
        System.out.println("Lowest Score is " + lowest(grades));
        highest(grades);
        average(grades);
    }


    public void outputGrades(int[] grades){
        for (int student = 0; student < grades.length;student++){
            System.out.printf("Student %2d: %3d%n",
                    student + 1, grades[student]);
        }
    }

    public int lowest(int[] grades){
        int low = grades[0];

        for(int i = 0; i < grades.length; i++){
            if (grades[i] < low){
                low = grades[i];
            }
        }
        return low;
    }

    public void highest(int[] grades){
        int high = grades[0];

        for(int i = 0; i < grades.length; i++){
            if (grades[i] > high){
                high = grades[i];
            }
        }
        System.out.println("Highest Score is " + high);

    }

    public void average(int[] grades){
        int average = grades[0];
        int sum = 0;

        for(int i = 0; i < grades.length; i++){
            sum += grades[i];
            average = sum / grades.length;
        }
        System.out.println("Average Score is " + average);

    }



}
