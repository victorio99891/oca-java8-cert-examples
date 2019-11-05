package main;

public class LocalAndInstance {

    static int number;

    static {
        number = 100;
    }

    public void run(){
        System.out.println(this.number);
    }

}



