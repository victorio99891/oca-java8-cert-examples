package pl.wiktor;

import pl.wiktor.classes.A;

public class AExecutor {



public static void main(String... args){

A klasa = new A();
klasa.execute();

// Won't compile because "executeProt()" has protected access in A class -> different packages pl.wiktor and pl.wiktor.classes
// klasa.executeProt();

}


}