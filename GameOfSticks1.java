import java.util.*;

public class GameOfSticks1 {

public static void main(String[] args) {


Scanner in = new Scanner(System.in);

System.out.println("Welcome to the Game of Sticks.\n The object of the game is to avoid drawing the last stick.");
System.out.println("How many players are there?");

int numPlayers = in.nextInt();

int stickCount = 20;

int whichPlayer = 1;

int lastPlayer = 0;

while (stickCount > 0) {

System.out.println("Player " + whichPlayer + ", it's your turn.");
System.out.println("How many sticks do you want to draw?");

int sticksDrawn = in.nextInt();



while (sticksDrawn > 3 || sticksDrawn < 0){



System.out.println("You can only choose between 1 and 3 sticks. Try again.");

sticksDrawn = in.nextInt();

}

while (sticksDrawn > stickCount && stickCount <=3) {

System.out.println("You took too many sticks. Try again.");

sticksDrawn = in.nextInt();

}

lastPlayer =  whichPlayer;

stickCount -= sticksDrawn;

if (whichPlayer == numPlayers) {
   
   whichPlayer = 1;
   
   }  else {
   
   whichPlayer++;
   
   }
   
   if (stickCount <= 3 && stickCount > 0) {
   
   System.out.println("Only " + stickCount + " left.");
   
   }
   }
   
   if (whichPlayer == numPlayers || whichPlayer == 1) {
   
   whichPlayer = 2;
   
   }
   
System.out.println("Game over. Player " + (lastPlayer) + " drew the last stick and lost.");

}

}// end public class