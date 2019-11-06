package main;

import main.ComboEnum;

public class Main {

    public static void main(String... args){

        printEnum(ComboEnum.PICO);
        printEnum(ComboEnum.MEDIA);
        printEnum(ComboEnum.GRANDE);

    }


    public static void printEnum(ComboEnum sample){
        System.out.println("\n"+sample.toString());
        System.out.println("code="+sample.getSizeCode());
        System.out.println("text="+sample.getText());
    }
    
}