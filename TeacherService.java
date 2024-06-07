import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers = new ArrayList<>();
    private int nextId = 1;

    public void addTeacher(String name, String subject) {
        Teacher teacher = new Teacher(nextId++, name, subject);
        teachers.add(teacher);
    }

    public void updateTeacher(int id, String name, String subject) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                teacher.setName(name);
                teacher.setSubject(subject);
                break;
            }
        }
    }

    public List<Teacher> getAllTeachers() {
        return new ArrayList<>(teachers);
    }

    public Teacher getTeacherById(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                return teacher;
            }
        }
        return null;
    }
}
