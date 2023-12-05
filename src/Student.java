import java.util.ArrayList;

public class Student {
    private String fullName;
    private  double averageGrade;

    public Student() {
    }

    public Student(String fullName, double averageGrade) {
        this.fullName = fullName;
        this.averageGrade = averageGrade;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    static double getAverageGrade(ArrayList<Student> students){
        double average = students.stream().mapToDouble(Student::getAverageGrade).average().orElseThrow();
        return average;
    }
}
