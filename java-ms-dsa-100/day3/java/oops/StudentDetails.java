package day3.java.oops;

import java.util.List;
import java.util.Scanner;

public class StudentDetails {

    public static void main(String[] args){
         StudentManager studentManager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int op = 0;
                    boolean running = true;

        do{
            System.out.println("""
                                    1. Add Student
                                    2. List Students
                                    3. Find by ID
                                    4. Update Student
                                    5. Remove Student
                                    6. Exit

                            """);
            System.out.println("Enter the operation");
            op=sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                Student student = new Student();
                System.out.println("Enter the student Name");
                String sname =sc.nextLine();
                student.setName(sname);
                System.out.println("Enter the Student grade");
                char sgrade = sc.next().charAt(0);
                student.setGrade(sgrade);
                studentManager.addStudent(student);                    
                    break;
                case 2: List<Student> students = studentManager.listAllStudents(); 
                        for(Student s: students){
                            System.out.println(s);
                        } 
                    break;
                case 3 :System.out.println("Enter the id");
                System.out.println(studentManager.findById(sc.nextLong()));
                  break;
                case 4:System.out.println("Enter the id");
                long id = sc.nextLong();
                sc.nextLine();
                System.out.println("Enter the name");
                String name = sc.nextLine();
                System.out.println("Enter the grade");
                char grade = sc.next().charAt(0);
                boolean updated = studentManager.updateStudent(id, name, grade);
                System.out.println(updated? "Updated SuccessFully" : "Failed to Update");
                  break;      
                case 5: 
                System.out.println("Enter the id");
                boolean removed = studentManager.removeStudent(sc.nextLong());
                if (removed) {
                     System.out.println("Student Removed Successfully");
                }
                else
                { System.out.println("Failed to remove");
            }
                break;

                case 6 :{ running = false;}
            
                default:
                    break;
            }
        }while(running);

        sc.close();
    }
}
