import java.util.Random;
import java.util.Scanner;
 
public class Game {
 public static void main(String[] args){
 int answer,guess;
final int MAX = 100;
System.out.println("Welcome to Number Guessing Game");
for(int i=1;i<=3;i++){
Scanner keyboard = new Scanner(System.in);
Random ran= new Random();

answer = ran.nextInt(MAX) + 1;
System.out.println("Guess a no. between 1 and 100: ");
guess = keyboard.nextInt();

if(guess== answer){
System.out.println("Good job , number was" +answer);
}
else if(guess>answer){
System.out.println("your guess is too high");
System.out.println("Sorry, incorrect guess");
} 
 else{
System.out.println("your guess is too low");
System.out.println("Sorry, incorrect guess");
} 
}
}
}