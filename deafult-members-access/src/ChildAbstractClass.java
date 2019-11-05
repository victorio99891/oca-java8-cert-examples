package main;

import main.AbstractClass;

// ONLY SECOND DECLARATION IS CORRECT
public class ChildAbstractClass extends AbstractClass {

    // public abstract void sayName(); <-- won't compile

    public void sayName(){
        System.out.println("It's my name!");
    };

}

// ALL CORRECT DECLARATIONS
public abstract class ChildAbstractClass extends AbstractClass {

    //public abstract void sayName();

    // OR

    public void sayName(){
        System.out.println("It's my name!");
    };

}


