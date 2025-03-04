import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students;
    private Scanner scanner;
    private SimpleDateFormat dateFormat;

    public StudentManager() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    }

    public void addStudent() {
        try {
            System.out.print("Enter PRN: ");
            String prn = scanner.nextLine();
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Date of Birth (yyyy-MM-dd): ");
            Date dob = dateFormat.parse(scanner.next());
            System.out.print("Enter Marks: ");
            double marks = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            students.add(new Student(prn, name, dob, marks));
            System.out.println("Student added successfully...");
        } catch(Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        System.out.println("\n List of Students:");
        for (Student student : students) {
            student.display();
        }
    }

    public void searchByPrn() {
        System.out.print("Enter PRN to search: ");
        String prn = scanner.nextLine();
        for (Student student : students) {
            if (student.getPrn().equals(prn)) {
                student.display();
                return;
            }
        }
        System.out.println("Student with PRN: " + prn + " not found.");
    }

    public void searchByName() {
        System.out.print("Enter Name to search: ");
        String name = scanner.nextLine();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                student.display();
                return;
            }
        }
        System.out.println("Student with Name: " + name + " not found.");
    }

    public void updateStudent() {
        System.out.print("Enter PRN to update: ");
        String prn = scanner.nextLine();
        for (Student student : students) {
            if (student.getPrn().equals(prn)) {
                System.out.print("Enter new Name: ");
                student.setName(scanner.nextLine());
                System.out.print("Enter new Date of Birth (yyyy-MM-dd): ");
                try {
                    student.setDob(dateFormat.parse(scanner.next()));
                } catch (Exception e) {
                    System.out.println("Invalid date format!");
                }
                System.out.print("Enter new Marks: ");
                student.setMarks(scanner.nextDouble());
                scanner.nextLine(); // Consume newline
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }

    public void deleteStudent() {
        System.out.print("Enter PRN to delete: ");
        String prn = scanner.nextLine();
        for (Student student : students) {
            if (student.getPrn().equals(prn)) {
                students.remove(student);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }
}
