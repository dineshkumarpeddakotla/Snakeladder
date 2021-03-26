package snakeladder;
import java.util.Random;
import java.util.Scanner;     
class Snakeladder {
//declared and assigined the static variables
	 public static final int No_Play = 1;
        public static final int Ladder = 2;
        public static final int Snake =3;
	public static final int Max_Position=100;
	 public static final int Min_Position=0;
	public static int Position=0;
//creating constructor
    String name;
    Snakeladder(String name){
        this.name=name;
    }
//to return the object as a string
    public String toString(){
        return (name);
    }

//calling main method
public static void main(String[] args){
System.out.println("Welcome to Snake and Ladder Game");
Scanner sc = new Scanner(System.in);
//calling constructor
System.out.println("Enter the Player One Name");
        Snakeladder player1 = new Snakeladder(sc.nextLine());
System.out.println("Enter the Player Two Name");
        Snakeladder player2 = new Snakeladder(sc.nextLine());
//declared and  assigned values to varaibles
         int Player1_Roll_Count=0;
        int Player2_Roll_Count=0;
        int Roll_Count = 0;
        while (Position < Max_Position) {
//calling a method
            if ( player1.SnakeandLadder()<=Max_Position) {
                System.out.println(player1+" : Roll a die");
                player1.SnakeandLadder();
                Player1_Roll_Count++;
                System.out.println(player1+ " : Roll Count = " + Player1_Roll_Count);

                if (player2.SnakeandLadder()<=Max_Position) {
                    System.out.println(player2+" : Roll a die");
                    player2.SnakeandLadder();
                    Player2_Roll_Count++;
                    System.out.println(player2+" : Roll Count = " + Player2_Roll_Count);
                }
                Roll_Count++;
                System.out.println("Players Total Roll Count = " + Roll_Count);
            }
if(player1.SnakeandLadder()==Max_Position){
System.out.println(player1+" : wins");

}
if(player1.SnakeandLadder()==Max_Position){
System.out.println(player2+" : wins");

}


        }


    }
    public int SnakeandLadder(){
        int Play_option = ((int) (Math.random() * 3) + 1);
            int Rolldice = ((int) (Math.random() * 6) + 1);
            System.out.println("Rolldice=" + Rolldice);
//giving the play option
            switch (Play_option) {
                case No_Play:
                 int current_Position = Position;
                    System.out.println("No_Play");
                    System.out.println("Current Position =" +current_Position);
                    break;
                case Ladder:
                    Position += Rolldice;
                    if (Position > Max_Position) {
                        Position -= Rolldice;
                    }
                    System.out.println("Ladder");
                    System.out.println("Current Position =" + Position);
                    break;
                case Snake:
                    Position -= Rolldice;
                    if (Position < Min_Position) {
                        Position = 0;
                    }

                    System.out.println("Snake");
                    System.out.println("Current Position =" + Position);
                    break;
                default:
                    System.out.println("Invalid");
            }
//player get the ladder again get chances to play
        if(Play_option==Ladder){
            System.out.println("Player roll a die");
            SnakeandLadder();
        }
//return the value
        return Position;
    }
}
