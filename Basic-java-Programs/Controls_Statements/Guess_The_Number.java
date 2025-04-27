package Controls_Statements;

import java.util.Random;
import java.util.Scanner;

class Game{

    public int number;
    public int inputNumber;
    public int noOfGuess;

    public int getNoOfGuess() {
        return noOfGuess;
    }

    public void setNoOfGuess(int noOfGuess) {
        this.noOfGuess = noOfGuess;
    }

    public Game(){
        Random newNumber = new Random();
        this.number = newNumber.nextInt(100);
    }

    int takeUserInput(){
        System.out.print("Guess the number : ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        return inputNumber;
    }

    boolean isCorrectNumber(int guessNumber){
        noOfGuess++;
        if(guessNumber == number){
            System.out.format("Hurray you guess the correct number %d in %d attempts",number,noOfGuess);
            return true;
        } else if (guessNumber > number) {
            System.out.println("Too big... Enter a smaller number.");
        } else if (guessNumber < number) {
            System.out.println("Too small... Enter a bigger number.");
        }
        return false;
    }
}
public class Guess_The_Number {
    public static void main(String[] args) {
        Game g = new Game();

        boolean result = false;
        while (!result){
            int userInput = g.takeUserInput();
            result = g.isCorrectNumber(userInput);
        }
    }

}
