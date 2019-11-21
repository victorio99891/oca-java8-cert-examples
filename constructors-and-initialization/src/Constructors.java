public class Constructors {

    public static void main(String args[]){
        
        Dog dog = new Dog();
        dog.showAnimalProperties();
        dog.showDogProperties();

        System.out.println("\n");

        Dog dog2 = new Dog("Ryan", 5, "RED");
        dog2.showAnimalProperties();
        dog2.showDogProperties();

        System.out.println("\n");

        Dog dog3 = new Dog(new Animal("Tommy", 1));
        dog3.showAnimalProperties();
        dog3.showDogProperties();

        System.out.println("\n");

        Dog dog4 = new Dog(3, "Moonlight", "YELLOW");
        dog4.showAnimalProperties();
        dog4.showDogProperties();

        System.out.println("\n");

        Animal animal = new Animal(10,"Tortua");
        animal.showAnimalProperties();

    }

}


class Simple {

    private String textField;

    /*
        - CONSTRUCTOR of Object class is called ALWAYS - because everyone class created by programmer inherit the Object class !
        - default CONSTRUCTORS have the same access modifier as class access modifier !
        - CONSTRUCTORS don't have return type !
        - CONSTRUCTORS names should be exactly the same as class name !
        - CONSTRUCTORS cannot be overridden - NEVER !!!
    */

    // Public no-args constructor
    public Simple(){

    }

    // Default-package parametrized constructor
    Simple(String textField){
        this.textField = textField;
    }

}


class Dog extends Animal {

    public String collarColor;

    public Dog(){
        System.out.println("Dog NO-ARGS constructor invoked!");
        collarColor = "DefaultColor";
    }

    // Next two CONSTRUCTORS are different because their PARAMETERS signature have different order !
    Dog(String name, int age, String collarColor){
        super(name, age);
        this.collarColor = collarColor;
        System.out.println(String.format("Dog PARAMETRIZED constructor invoked! Parameters: %s, %s, %s",name, age, collarColor));
    }

    Dog(int age, String name, String collarColor){
        System.out.println(String.format("Dog PARAMETRIZED constructor invoked! Parameters: %s, %s, %s",age, name, collarColor));
        this.name = name;
        this.age = age;
    }

    protected Dog(Animal animal){
        super(animal.name, animal.age);
        System.out.println(String.format("Dog PARAMETRIZED (with Animal arg) constructor invoked! Parameters: %s, %s, %s",name, age, collarColor));
    }

    // It is just a simple method ! Not a constructor ! (Has return type - CONSTRUCTORS don't)
    public String Dog(){
        return "Dog";
    }

    public void showDogProperties(){
        String params = String.format("Dog: name=%s, age=%s, collarColor=%s", this.name, super.age, collarColor);
        System.out.println(params);
    }

}

class Animal {

    // Public instance variables for easy-access
    public String name;
    public int age;

    public Animal(){
        System.out.println("Animal NO-ARGS constructor invoked!");
    }

    Animal(String name, int age){  
        System.out.println(String.format("Animal PARAMETRIZED constructor invoked! Parameters: %s, %s",name, age));
        this.name = name;
        this.age = age;
    }

    Animal(int age, String name){
        // this() method can be called only within a CONSTRUCTOR -> it calls appropriate CONSTRUCTOR based on list of parameters !!! (in this case an empty one)
        this();
        System.out.println(String.format("Animal PARAMETRIZED constructor invoked! Parameters: %s, %s",age, name));
        this.name = name;
        this.age = age;
    }

    public void showAnimalProperties(){
        String params = String.format("Animal: name=%s, age=%s", this.name, this.age);
        System.out.println(params);
    }

}

