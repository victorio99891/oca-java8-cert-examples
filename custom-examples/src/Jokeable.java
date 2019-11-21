package pl.wiktor;

import pl.wiktor.Logger;

public interface Jokeable {

    final public static Logger log = new Logger(Jokeable.class);

    public abstract void tellJoke();

    default void laugh(){
        log.info("Hahahahaha!");
    }


}