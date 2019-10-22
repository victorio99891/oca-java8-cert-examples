package pl.wiktor.interfaces;

import pl.wiktor.interfaces.NewInterface;

public class Main {

    public static void main(String... args) {

        NewClass klass = new NewClass();

        klass.printText();

        System.out.println(klass.ITEM);

        klass.show();

        NewInterface.showStatic();

    }

}