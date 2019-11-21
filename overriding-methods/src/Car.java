package main;

import main.exception.NoCarException;

public class Car extends Vehicle {

    public void showCar(){
        System.out.println("I am Car!");
    }

    public void carException(int number) throws NoCarException {

        if (number == 1){
            System.out.println("Call method from Car with checked NoCarException with argument: 1");
        } else if (number == 2){
            System.out.println("Thrown from Car!");
            throw new NoCarException();
        }

    }

    @Override
    protected void abstractMethod(){
        System.out.println("Implementation of abstractMethod() from Car.class");
    }

}