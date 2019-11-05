package main;

public class SampleVarArgs {


    //public void printAll(String... args, String... anotherArgs){
        // Implementation here
    //}

    // Correct declaration of method with var-args as argument
    public void printAll(int howMany, String... args){
        // Implementation here
    }

    //public void printAll(String... args, int howMany){
        // Implementation here
    //}

    public void run(){
        printAll(1, "A","B", "C");
    }
}