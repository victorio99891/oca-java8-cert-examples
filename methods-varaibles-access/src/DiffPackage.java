package diff;

import java.time.*;

public class DiffPackage {


public void sayName(){

    String currentTime = LocalDateTime.now().toString();

System.out.println(  currentTime + ": This class name: " + this.getClass().getSimpleName());

}

void diffMethod(){
    System.out.println("Call from default access method!");
}




}