package day3.java.oops;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();
    private long idCounter = 0;

    public Student addStudent(Student s){
        s.setId(++idCounter);
        this.students.add(s);
        return s;
    }

    // public boolean removeStudent(long id){
    //     boolean isRemoved = false;
    //     for(Student s : students){
    //         if(s.getId()==id)
    //         {
    //             isRemoved = students.remove(s); // will causes concurrent modification exception beacuse
    //                                             // we cant remove or modify the list while iteration with for-each loop

    //         }
    //     }

    //     return isRemoved;
    // }


    public boolean removeStudent(long id){

        boolean isRemoved = false;

        for(int i =0;i<students.size();i++){
            if(students.get(i).getId()==id)
            {
                students.remove(i);
                isRemoved = true;
                break;
            }
        }

        return isRemoved;
    }

    public Student findById(long id){
        Student student = null;
        for(Student s : students){
            if(s.getId()==id){
                student = s;
                break;
            }

            
        }
        return student;
    }


    public List<Student> listAllStudents(){
        return Collections.unmodifiableList(students);
    }

    public boolean updateStudent(long id, String name, char grade){
        boolean isUpdated = false;
        for(Student s : students){
            if(s.getId()==id){
                s.setId(id);
                s.setName(name);
                s.setGrade(grade);
                isUpdated = true;
                break;
            }
        }
        return isUpdated;
    }

    
}
