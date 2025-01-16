public class Animal {
    String name;
    String species;
    public Animal(String name,String species){
        this.name = name;
        this.species = species;
    }
}
class Dog extends Animal{
    String breed;
    public Dog (String name,String species,String breed){
       super(name,species);
       this.breed= breed;
    }
}
class Demo{
    public static void main(String[] args) {
        Animal obj = new Animal("cat", "Xyz");
        System.out.println("name " + obj.name + ",species : " +obj.species);
        Dog obj2 = new Dog("Dog ", "Pug", "BullDog");
        System.out.println("Name " + obj2.name + ", Species " + obj2.species + " ,breed " + obj2.breed);
        

        
    }
}
