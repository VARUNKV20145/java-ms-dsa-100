package day3.java.oops;

import java.util.Objects;

//Entity Class
public class Student {
    
    private long id;
    private String name;
    private char grade;

    //default constructor

    public Student(){
       this(0L,"",'\0');
    }

    // parameterized Constructor

    public Student(long id,String name, char grade){
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    //getters and setters

    public long getId(){
        return this.id;
    }
    public void setId(long id){
        this.id=id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public char getGrade(){
        return this.grade;
    }
    public void setGrade(char grade){
        this.grade=grade;
    }

    @Override
    public String toString(){
        return "Id : " + this.id + "\n"+
        "Name : " + this.name + " \n" +
        " Grade : "+this.grade;
    }

    @Override                                         
    public boolean equals(Object o){
        boolean isEqual = false;
        if (this==o) {
            isEqual = true; //reference chek checking wheather both the referenc pointng to the same memory location in heap
        }else if (Objects.nonNull(o) && o instanceof Student) {
            Student s = (Student) o;
            isEqual = Objects.equals(this.getId(),s.getId());
        }
        return isEqual;
    }
    
    @Override
    public int hashCode(){
       return Objects.hash(this.getId());
    }
}
