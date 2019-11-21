package pl.wiktor;

import pl.wiktor.Logger;

public class Human {

    final public static Logger log = new Logger(Human.class);

    private int age = 999;
    private String name = "default name";

    // Don't implement the default constructor
    {
        log.info("Instantiated from param constructor!");
    }

    public Human(String name, int age){
        log.info(String.format("Params: name=%s, age=%s", name, age));
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }


}