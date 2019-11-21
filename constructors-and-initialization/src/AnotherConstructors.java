package pl;
import static pl.Printer.print;

public class AnotherConstructors {

    public static void main(String... args){

        print("\n");

        Developer dev1 = new Developer("Andrew");
        print(dev1.toString());

        print("\n");

        Developer dev2 = new Developer(25);
        print(dev2.toString());
       
    }

}


class Human {

    public int age = 999;

    public Human(){
        print("Human()");
    }

    public Human(int age){
        print("Human(age)");
        this.age = age;
    }

}

class Developer extends Human {

    public String name;

    public Developer(String name){
        super();
        print("Developer(name)");
        this.name = name;
    }

    public Developer(int age){
        super(age);
        print("Developer(age)");
    }

    public String toString(){
        return String.format("Developer{name=%s,age=%s}",this.name,super.age);
    }

}


interface Printer {

    static void print(String str){
        System.out.println(str);
    }

}