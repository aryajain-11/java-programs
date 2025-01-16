public class Person {
    String name;
    int age;
   public  Person(){
    this.name = "unknowm ";
    this.age = 0;
   }
   public  Person(String name , int age  ){
    this.name = name;
    this.age = age;
   }
}
class Student extends Person{
    int studentId;
    public Student(String name,int age,int studentId){
        super(name, age);
        this.studentId = studentId;
    }
}
class Main {
    public static void main(String[] args) {
        Student obj = new Student ("Arya",20,574);
        System.out.println("Name is : " + obj.name);
        System.out.println("Age  is : " + obj.age);
        System.out.println("StudentId is : " + obj.studentId);
        Person obj2 = new Person();
        System.out.println("name is " + obj2.name);
        

    }
}
