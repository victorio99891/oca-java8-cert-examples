package main;

import main.SampleVarArgs;
import main.LocalAndInstance;

public class Main {

    public static void main(String... args){
        SampleVarArgs sampleVarArgs = new SampleVarArgs();
        sampleVarArgs.run();


        LocalAndInstance localAndInstance = new LocalAndInstance();
        localAndInstance.run();
    }

}