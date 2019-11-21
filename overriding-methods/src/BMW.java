package main.impl;

import main.Car;
import main.inter.InterChild;
import main.exception.NoCarException;
import main.exception.ChildNoCarException;

public class BMW extends Car implements InterChild{

    public void showBMW(){
        System.out.println("I am BMW!");
    }

    public void abstractMethod(String arg){
        System.out.println("Fake overriding implementation - different method signture!");
    }

    public void abstractMethod(){
        System.out.println("Implementation of abstractMethod() from BMW");
    }

    public void carException(int number) throws ChildNoCarException {

    try {
        super.carException(number);
    } catch (NoCarException e){
        e.printStackTrace();
    }

        if (number == 1){
            System.out.println("Call method from BMW with checked NoCarException with argument: 1");
        } else if (number == 2){
            System.out.println("Thrown from BMW!");
            throw new ChildNoCarException();
        }

    }


}