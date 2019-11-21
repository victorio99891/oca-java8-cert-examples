package pl.wiktor;

import pl.wiktor.Human;
import pl.wiktor.Technology;
import pl.wiktor.Logger;
import pl.wiktor.Jokeable;

public class Developer extends Human implements Jokeable {

    final public static Logger log = new Logger(Developer.class);

    private Technology tech;

    static {
        log.info("First developer has been released!");
    }

    {
        log.info("Instantiated from param constructor!");
    }

    public Developer(String name, int age, Technology tech){
        super(name, age);
        log.info(String.format("Params: tech=%s", tech.name()));
        this.tech = tech;
    }

    public void tellJoke(){
        log.info("I'm a architect. Should be 'an' - grammar joke - buhaha!");
    }

}

