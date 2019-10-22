package pl.wiktor.hello;

import pl.wiktor.sample.SampleKlass;
import static pl.wiktor.sample.SampleKlass.NAME;

public class Application {


public static void main(String[] args){


System.out.print("Hello world!\n\n");


SampleKlass klass = new SampleKlass("Name of class is: Perfecto!");

klass.showName();


System.out.println(NAME);

}



}
