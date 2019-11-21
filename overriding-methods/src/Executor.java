package executor;

import main.impl.BMW;
import main.exception.NoCarException;
import main.inter.InterChild;

public class Executor {


    public static void main(String... args) {

        BMW bmw = new BMW();

        bmw.showBMW();
        bmw.showCar();
        bmw.abstractMethod();
        bmw.abstractMethod("A");
        bmw.carException(1);

        try {
        bmw.carException(2);
        } catch (NoCarException e){
            e.printStackTrace();
        }

        System.out.println("\n\n");


        bmw.print();



        System.out.println("Finished!");
    }


}