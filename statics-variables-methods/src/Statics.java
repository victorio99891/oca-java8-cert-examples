public class Statics {

    public static void main(String... ARGS){
        
        Player player1 = new Player();
        Player player2 = new Player();
        Player.getInstancesCount();
        Player player3 = new Player();
        Player player4 = new Player();

        // The most weird thing! Which will compile without any errors!
        /* 
            Java allows you to call static method on object reference! 
            It is possible because compiler knows the TYPE of declared reference! 
            Compiler also know to which "class context" it should refer! 

        */

        player4.getInstancesCount();


        // Created a Player instance as Human reference what output will be? Is REDEFINITION on PLAYER class works? Remember that static methods cannot be OVERRIDDEN!
        Human human1 = new Player();
        human1.getInstancesCount();


        Player player5 = new Player();
        HumanBeing.beHappy();

        // static method from interface couldn't by object reference !
        //player5.beHappy();

    }

}


class Player extends Human implements HumanBeing {

    // REDEFINITION of static method is allowed ! Don't think it is OVERRIDE !!!!
    static void getInstancesCount(){
        System.out.println("- Player - Current instances: " + playerInstances);
    }

    public Player(){
        
    }

}


class Human {

    static {
        playerInstances = 0;
    }

    static int playerInstances;

    static void incrementHumanInstances(){
        ++playerInstances;
    }

    static void getInstancesCount(){
        System.out.println("- Human - Current instances: " + Player.playerInstances);
    }

    public Human(){
        incrementHumanInstances();
    }

}


interface HumanBeing {

    static void beHappy(){
        System.out.println("Happy scream!");
    }

}