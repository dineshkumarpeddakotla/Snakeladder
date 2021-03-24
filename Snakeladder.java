package snakeladder;
import java.util.Random;
     
class Snakeladder {
	 public static final int No_Play = 1;
        public static final int Ladder = 2;
        public static final int Snake =3;
	public static final int Max_Position=100;
	 public static final int Min_Position=0;

public static void main(String[] args){
System.out.println("Welcome to Snake and Ladder Game");
int Player1_Position = 0;
int Player1_Roll_Count = 0;
int Player2_Position = 0;
int Player2_Roll_Count = 0;

while(Player1_Position < Max_Position && Player2_Position<Max_Position){
int Player1_Play_option = ((int)(Math.random()*3)+1);
int Player1_Rolldice = ((int)(Math.random()*6)+1);
System.out.println("Player1 Rolldice="+Player1_Rolldice);
switch ( Player1_Play_option){
case No_Play:
Player1_Position = Player1_Position;
System.out.println("No_Play");
System.out.println("Player1 Current Position =" +Player1_Position);
break;
case Ladder:
Player1_Position +=Player1_Rolldice;
if(Player1_Position>Max_Position){
Player1_Position-=Player1_Rolldice;
}
System.out.println("Ladder");
System.out.println("Player1 Current Position =" +Player1_Position);
break;
case Snake:
Player1_Position -=Player1_Rolldice;
if(Player1_Position<Min_Position){
Player1_Position=0;
}

System.out.println("Snake");
System.out.println("Player1 Current Position =" +Player1_Position);
break;
default: System.out.println("Invalid");
}
Player1_Roll_Count++;
System.out.println("Player1 Roll Count = " +Player1_Roll_Count);
int Player2_Play_option = ((int)(Math.random()*3)+1);
int Player2_Rolldice = ((int)(Math.random()*6)+1);
System.out.println("Player2 Rolldice="+Player2_Rolldice);

switch ( Player2_Play_option){
case No_Play:
Player2_Position = Player2_Position;
System.out.println("No_Play");
System.out.println("Player2 Current Position =" +Player2_Position);
break;
case Ladder:
Player2_Position +=Player2_Rolldice;
if(Player2_Position>Max_Position){
Player2_Position-=Player2_Rolldice;
}
System.out.println("Ladder");
System.out.println("Player2 Current Position =" +Player2_Position);
break;
case Snake:
Player2_Position -=Player2_Rolldice;
if(Player2_Position<Min_Position){
Player2_Position=0;
}

System.out.println("Snake");
System.out.println("Player2 Current Position =" +Player2_Position);
break;
default: System.out.println("Invalid");
}
Player2_Roll_Count++;
System.out.println("Player1 Roll Count = " +Player2_Roll_Count);
 
}
if(Player1_Position == Max_Position){
System.out.println("Player1 Wins");
}
if(Player2_Position == Max_Position){
System.out.println("Player2 Wins");
}

}
}
