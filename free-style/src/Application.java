package pl.wiktor.application;

import pl.wiktor.child.ChildClass;

public class Application {
    
    public static void main(String... args){
        System.out.println("\n");
        System.out.println("Protected member: ");
        System.out.println("\n");
        
        ChildClass child = new ChildClass();
        child.execProtectedFromPublic();
        //child.execProtected(); // won't compile -> method declared as protected member in ParentClass

        System.out.println("\n");
        System.out.println("Numbers: ");
        System.out.println("\n");

        Numbers numbers = new Numbers();
        numbers.exec();

    }
}