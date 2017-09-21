import java.util.ArrayList;

public class Course
{
    private String title;
    private String teacher;
    private ArrayList<Student> students;

    public Course(String title, String teacher)
    {
        this.title = title;
        this.teacher = teacher;
        this.students = new ArrayList<Student>();
    }

    public void show() {
        for (Student student : students) {
            student.display();
        }
    }

    public void showPassed() {
        for (Student student : students) {
            if (student.hasPassed()) {
                student.display();
            }
        }
    }
}
