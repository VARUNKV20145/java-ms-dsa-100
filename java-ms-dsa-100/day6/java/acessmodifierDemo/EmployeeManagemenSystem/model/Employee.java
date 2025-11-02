package day6.java.acessmodifierDemo.EmployeeManagemenSystem.model;

public class Employee {
    private String name;
    private long id;
    private double salary;

    protected String department;

    String place;

    //getters and setters
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setId(long id){
        this.id=id;
    }
    public long getId(){
        return this.id;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public void displayInfo(){
        System.out.println("Id :"+this.id);
        System.out.println("Name :"+this.name);
        System.out.println("Salary :"+this.salary);
        System.out.println("Department :"+this.department);
    }

}
