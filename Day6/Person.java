public class Person {
    public static void main(String[] args) {
        Person obj1 = new Person();
        obj1.print();
        Person obj2 = new Person("Arya" ,20);
        obj2.print();
    }
    String name;
    int age;

    public Person(){
        name = "Unknown";
        age = 0;
    }
    public Person(String name, int age ){
        this.name = name;
        this.age = age;

    }
    public void print(){
        System.out.println("name is "+ name + " age " + age );
    }
}
