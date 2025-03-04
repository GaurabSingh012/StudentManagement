
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while(true){
            System.out.println("\n Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Update Student");
            System.out.println("6. Delete Student");
            System.out.println("7. Exit");
            System.out.println(" Enter your choice");

            int choice = Scanner.nextInt();
            switch(choice){
                case 1:
                    manager.addStudent();
                    break;
                case 2:
                    manager.displayStudents();
                    break;
                case 3:
                    manager.SearchByPrn();
                    break;
                case 4:
                    manager.SearchByName();
                    break;
                case 5:
                    manager.updateStudent();
                    break;
                case 6:
                    manager.deleteStudent();
                    break;
                case 7:
                    System.out.println("Existing...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}