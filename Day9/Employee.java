public class Employee {
    String name ;
    double salary;
    public Employee (String name , double salary){
        this.name = name;
        this.salary= salary;
    }
}
class Manager extends Employee {
    String department;
    // yha par manager constructor m waps se name salry kyu kara
    public Manager(String name , double salary, String department) {
        super(name, salary);
        this.department = department;;
    }
}
class Main {
    public static void main(String[] args) {
    Manager obj = new Manager("xyz" , 400.23, "IT");
    System.out.println("Name: " + obj.name);
    System.out.println("Salary: " + obj.salary);
    System.out.println("Department: " + obj.department);
    }
    
}
