public class ConstructorFailures{

    public static void main(String... args){

    }

}


// ------------ EXAMPLE 1 -------------

// Won't compile!
class BMW extends Car {

    public BMW(){
        // Class Car doesn't has a default constructor -> because it has overridden "default" constructor by parametrized one
        super();
    }


}


class Car {

    public String modelName;

    // Default no-args constructor won't be created!

    public Car(String modelName){
        this.modelName = modelName;
    }
}




// ------------ EXAMPLE 2 -------------

// Won't compile!
// The same situation as before but different description
class Clothing {
    // Default constructor won't be created because of declared parametrized one
    Clothing(String size){}
}

class TShirt extends Clothing{
    // By default compiler tries to build default constructor for TShirt class:

    // class TShirt(){
    //   super();
    // }

    // But parent class doesn't has default no-args constructor
}




//------------ EXAMPLE 3 -------------

class Programmer {

    public String favLanguage;

    Programmer(String favLanguage){
        this.favLanguage = favLanguage;
    }

}

class JavaDeveloper extends Programmer {
    
    // Won't compile !
    JavaDeveloper(){
        this.favLanguage = getFavLanguage(); // <-- won't compile! Because super() should be the first statement in constructor!
        this.favLanguage = getFavLanguageStatic(); // <-- won't compile! The reason the same as above! - in this case doesn't matter this is static !
        super(); // <-- won't compile because parent class doesn't has a default no-args constructor !
    }

    // To make this compile
    JavaDeveloper(){
        super(getFavLanguageStatic()); //  <-- call parametrized constructor of parent class with method that returns String
    }

    // Or

    JavaDeveloper(){
        super("default"); // <-- call parametrized constructor of parent class with explicitly declared String "default"
        this.favLanguage = getFavLanguage(); // <-- change the value of favLanguage by calling instance method 
    }



    private String getFavLanguage(){
        return "Java";
    }

    private static String getFavLanguageStatic(){
        return "Static Java";
    }
}


// ------------ EXAMPLE 4 -------------

class SoccerPlayer {

    // Recursive CONSTRUCTOR invocation! Won't compile!
    public SoccerPlayer(){
        this();
    }

    // Or


    // super() and this() must be always first statement in constructor !
    public SoccerPlayer(){
        this();
        super();
    }

    // Or

    // The same as above - order doesn't matter!
    public SoccerPlayer(String name){
       super();
      this();
    }


    // The correct one!
    public SoccerPlayer(String name){
        this(); // <-- now this() calls default constructor from SoccerPlayer class and then SoccerPlayer() calls at first super() -> constructor of class Object
    }

}