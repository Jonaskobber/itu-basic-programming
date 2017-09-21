import java.util.*;

public class Student
{
    private int id;
    private String name;
    private int grade;
    private ArrayList<Integer> legal_grades;

    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
        this.grade = 0;
        this.legal_grades = new ArrayList<Integer>();
        Collections.addAll(legal_grades, -3, 0, 2, 4, 7, 10, 12);
    }

    public void display()
    {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Grade: " + this.grade);
    }

    public void setGrade(int grade) {
        if (this.validateGrade(grade)) {
            this.grade = grade;
        } else {
            System.out.println("Incorrect grade");
        }
    }

    public boolean hasPassed() {
        return grade > 0;
    }

    private boolean validateGrade(int grade) {
        return legal_grades.contains(grade);
    }
}
