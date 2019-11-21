public class InitBlocks{

    public static void main(String[] args){

        Player player1 = new Player();
        Player player2 = new Player("Sven");


        /* 
            CONSOLE OUTPUT:

            1st Static block from Player!
            2nd Static block from Player!
            1st Default block from Player!
            2nd Default block from Player!
            Player default no-args constructor!
            1st Default block from Player!
            2nd Default block from Player!
            Player one argument constructor!
            
         */

    }

}


class Player {
    // STATIC BLOCK IS CALLED ONLY ONCE WHEN THE CLASS IS FIRST LOADED !

    // Static block
    static {
        System.out.println("1st Static block from Player!");
    }

    // Default block
    {
        System.out.println("1st Default block from Player!");
    }

    public Player(){
        super();
        // THIS IS THE PLACE WHERE DEFAULT BLOCK IS CALLED !
        System.out.println("Player default no-args constructor!");
    }

    public Player(String name){
        super();
        // THIS IS THE PLACE WHERE DEFAULT BLOCK IS CALLED !
        System.out.println("Player one argument constructor!");
    }

    {
        System.out.println("2nd Default block from Player!");
    }

    static {
        System.out.println("2nd Static block from Player!");
    }


}
