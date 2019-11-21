

public class Runner {

    public static void main(String[] args){

        Child1 child1 = new Child1();
        // child1.show();

        Child2 child2 = new Child2();
        // child2.show();

        Parent parent1 = child1;
        // parent1.show();

        Parent parent2 = child2;
        // parent2.show();

        child2.getHello();

        System.gc();


        child2.getInfo(Color.RED);
        child2.getInfo(Color.YELLOW);
        child2.getInfo(Color.BLUE);
        child2.getInfo(Color.GREEN);

    }

}


class Parent {

    void show(){
        System.out.println("Hello from Parent");
    }

}


class Child1 extends Parent {

    void show(){
        System.out.println("Hello from Child 1");
    }

}


class Child2 extends Parent implements Callable, NotCallable {

    public void getHello(){
        System.out.println("Hello world! From Child2!");
    }


}


interface Callable {

    default String getClassName(){
        return this.getClass().getSimpleName();
    }
    default void getHello(){
        System.out.println("Hello world! From Callable!");
    }

    default void getInfo(Color color){
        System.out.println(color.getInfo());
    }

}

interface NotCallable {

    default void getHello(){
         System.out.println("Hello world! From NotCallable!");
    }

}

enum Color {
    YELLOW("Warning"), 
    RED("Exception"),
    BLUE("Fine"),
    GREEN("Success");

    private String info;

    Color(String info){
        this.info = info;
    }

    public String getInfo(){
        return this.info;
    }

}