package pl.wiktor.interfaces;

import pl.wiktor.interfaces.NewInterface;

public class NewClass implements NewInterface {

    @Override
    public void printText() {
        System.out.println("Printed implemented method!");
    }

}