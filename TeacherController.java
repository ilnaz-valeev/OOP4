import java.util.Scanner;

public class TeacherController {
    private TeacherService teacherService = new TeacherService();
    private TeacherView teacherView = new TeacherView();
    private Scanner scanner = new Scanner(System.in);

    public void createTeacher() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter subject: ");
        String subject = scanner.nextLine();
        teacherService.addTeacher(name, subject);
        System.out.println("Teacher added.");
    }

    public void updateTeacher() {
        System.out.print("Enter ID of teacher to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // consume newline
        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new subject: ");
        String subject = scanner.nextLine();
        teacherService.updateTeacher(id, name, subject);
        System.out.println("Teacher updated.");
    }

    public void listTeachers() {
        teacherView.displayTeachers(teacherService.getAllTeachers());
    }

    public void getTeacherById() {
        System.out.print("Enter ID of teacher to view: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // consume newline
        teacherView.displayTeacher(teacherService.getTeacherById(id));
    }

    public static void main(String[] args) {
        TeacherController controller = new TeacherController();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Teacher");
            System.out.println("2. Update Teacher");
            System.out.println("3. List Teachers");
            System.out.println("4. View Teacher by ID");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    controller.createTeacher();
                    break;
                case 2:
                    controller.updateTeacher();
                    break;
                case 3:
                    controller.listTeachers();
                    break;
                case 4:
                    controller.getTeacherById();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
