package snakeladder;
import java.util.Random;
     
class Snakeladder {
	 public static final int No_Play = 1;
        public static final int Ladder = 2;
        public static final int Snake =3;

public static void main(String[] args){
System.out.println("Welcome to Snake and Ladder Game");
int Position = 0;
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
System.out.println("Ladder");
System.out.println("Current Position =" +Position);
break;
case Snake:
Position -=Rolldice;
System.out.println("Snake");
System.out.println("Current Position =" +Position);
break;
default: System.out.println("Invalid");
}
 }
}
