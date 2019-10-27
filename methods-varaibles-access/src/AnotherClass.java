package main;

import java.time.*;
import diff.Extendable;

public class AnotherClass extends Extendable {

public void sayName(){

    String currentTime = LocalDateTime.now().toString();

System.out.println(  currentTime + ": This class name: " + this.getClass().getSimpleName());

}


public void extension(){
    this.sayHello();
    this.sayName2();
}





}