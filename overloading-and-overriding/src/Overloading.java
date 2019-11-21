public class Overloading {

    public static void main(String... args){
        System.out.println("Hello world!");
    }


}

/*
    Method signature consist of:
    - access modifier and non-access modifier
    - return type
    - method's name
    - parameter list
*/

class Methods implements InterfaceA, InterfaceB {

    // Overloaded methods MUST has different argument list (parameters) everytime
    public String show(){
        System.out.println("Return: String, Args: empty.");
        return "empty";
    }

    // Overloaded methods CAN has different access modifier
    protected String show(String text){
        System.out.println("Return: String, Args: String.");
        return "String";
    }

    // Overloaded methods CAN has different return type
    final public void show(String text, int number){
        System.out.println("Return: void, Args: String, int.");
    }

    // Abstract interface method always should be overridden in classes which implements interface with abstract method declaration
    public String getSomeString(){
        return "Some String.";
    }
    
    // Overridden method to make program compile - because of multiple interface implementation which the same method "print" with same method signature 
    public void print(){
        System.out.println("Hello!");
    }
}


// Multiple inheritance based on Java 8 features.
interface InterfaceA {

    String getSomeString();

    default void print(){
        System.out.println("Hello InterfaceA!");
    }

}


interface InterfaceB {

    String getSomeString();

    default void print(){
        System.out.println("Hello InterfaceB!");
    }

}