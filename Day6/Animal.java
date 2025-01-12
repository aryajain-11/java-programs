package Day6;

public class Animal {
    String name;
    String species;
    public Animal(String name,String species){
        this.name = name;
        this.species = species;
        System.out.println("name is "+ name + "species is " + species);

    }
}
class Dog extends Animal{
    String breed;
    public Dog (String breed){
       super();
       this.breed= breed;
       System.out.println("Breed is " + breed);
    }

}
class Demo{
    public static void main(String[] args) {
        Dog obj = new Dog(Pug);

        
    }
}
