import java.util.Scanner;

public class Human extends Player{

    @Override
    void makeChoice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Type 'rock', 'paper', or 'scissors' to play.");
        System.out.println("2. Type 'quit' to go back to the main menu.");
        String move = scan.next().toLowerCase();
        if (move.equals("rock") || move.equals("scissors") || move.equals("paper")){
            setChoice(move);
        } else if (move.equals("quit")){
            Game.mainMenu();
        } else {
            System.out.println("Invalid input");
            makeChoice();
        }
    }
}
