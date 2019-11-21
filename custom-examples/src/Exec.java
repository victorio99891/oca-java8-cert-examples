
import pl.wiktor.Human;
import pl.wiktor.Developer;
import pl.wiktor.Technology;

public class Exec {

    public static void main (String... args){

        Human human = new Human("Wiktor", 25);
        Developer dev = new Developer(human.getName(), human.getAge(), Technology.JAVA);
        dev.tellJoke();
        dev.laugh();
    }


}