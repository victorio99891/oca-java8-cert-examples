package main;

import diff.*;

public class Main {


public static void main(String... args){

AnotherClass anotherClass = new AnotherClass();

anotherClass.sayName();

anotherClass.extension();

DiffPackage diff = new DiffPackage();

diff.sayName();

// diffMethod() cannot be accessible from this class because method is declared as "default access"
// diff.diffMethod();



    
}



}