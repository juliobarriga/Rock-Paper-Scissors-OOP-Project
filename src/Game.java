import java.util.Random;
import java.util.Scanner;

public class Game {
    static void mainMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("MAIN MENU");
        System.out.println("=====");
        System.out.println("1. Type '2 players' to play against another human.");
        System.out.println("2. Type 'computer' to play against the computer.");
        System.out.println("3. Type 'quit' to stop playing.");
        String menuChoice = scanner.nextLine().toLowerCase();
        if (menuChoice.equals("2 players")){
            againstHuman();
        } else if (menuChoice.equals("computer")){
            againstComputer();
        } else if (menuChoice.equals("quit")){
            quit();
        } else {
            System.out.println("Invalid input");
            mainMenu();
        }
    }
    static void againstHuman(){
        Player1 player1 = new Player1();
        Player2 player2 = new Player2();
        player1.makeChoice();
        player2.makeChoice();
        System.out.println("Player 1 picks: " + player1.getChoice());
        System.out.println("Player 2 picks: " + player2.getChoice());
        if (player1.getChoice().equals(player2.getChoice())){
            System.out.println("It's a Draw!");
        } else if (player1.getChoice().equals("rock") && player2.getChoice().equals("scissors")){
            System.out.println("Player 1 wins!");
        } else if (player1.getChoice().equals("paper") && player2.getChoice().equals("rock")){
            System.out.println("Player 1 wins!");
        } else if (player1.getChoice().equals("scissors") && player2.getChoice().equals("paper")){
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
        System.out.println();
        mainMenu();
    }
    static void againstComputer(){
        Player1 player1 = new Player1();
        Computer computer = new Computer();
        player1.makeChoice();
        computer.makeChoice();
        System.out.println("User picks: " + player1.getChoice());
        System.out.println("Computer picks: " + computer.getChoice());
        if (player1.getChoice().equals(computer.getChoice())){
            System.out.println("It's a draw!");
        } else if (player1.getChoice().equals("rock") && computer.getChoice().equals("scissors")){
            System.out.println("Player 1 wins!");
        } else if (player1.getChoice().equals("paper") && computer.getChoice().equals("rock")){
            System.out.println("Player 1 wins!");
        } else if (player1.getChoice().equals("scissors") && computer.getChoice().equals("paper")){
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Computer wins!");
        }
        System.out.println();
        mainMenu();
    }
    static void quit(){
        System.out.println("Goodbye!");
        System.out.println();
    }


}
