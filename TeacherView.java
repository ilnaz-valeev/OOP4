import java.util.List;

public class TeacherView {
    public void displayTeachers(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public void displayTeacher(Teacher teacher) {
        if (teacher != null) {
            System.out.println(teacher);
        } else {
            System.out.println("Teacher not found.");
        }
    }
}
