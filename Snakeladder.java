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
int Position = 0;
int Roll_Count = 0;
while(Position < Max_Position){
int Play_option = ((int)(Math.random()*3)+1);
int Rolldice = ((int)(Math.random()*6)+1);
System.out.println("Rolldice="+Rolldice);
switch ( Play_option){
case No_Play:
Position = Position;
System.out.println("No_Play");
System.out.println("Current Position =" +Position);
break;
case Ladder:
Position +=Rolldice;
if(Position>Max_Position){
Position-=Rolldice;
}
System.out.println("Ladder");
System.out.println("Current Position =" +Position);
break;
case Snake:
Position -=Rolldice;
if(Position<Min_Position){
Position=0;
}

System.out.println("Snake");
System.out.println("Current Position =" +Position);
break;
default: System.out.println("Invalid");
}
Roll_Count++;
System.out.println("Roll Count = " +Roll_Count);
 }
}
}
