import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

    static List<String> history = new ArrayList<>();

    public static void mainMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("MAIN MENU");
        System.out.println("=====");
        System.out.println("1. Type 'play' to play.");
        System.out.println("2. Type 'history' to play against the computer.");
        System.out.println("3. Type 'quit' to stop playing.");
        String menuChoice = scanner.next().toLowerCase();
        if (menuChoice.equals("play")){
            play();
        } else if (menuChoice.equals("history")){
            history();
        } else if (menuChoice.equals("quit")){
            quit();
        } else {
            System.out.println("Invalid input");
            mainMenu();
        }
    }

    public static void play(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("SELECT OPPONENT");
        System.out.println("=====");
        System.out.println("1. Type 'human' to play against another human");
        System.out.println("2. Type 'computer' to play against another computer");
        System.out.println("3. Type 'quit' go back to the Main Menu");
        String opponent = scanner.next().toLowerCase();
        if (opponent.equals("human")){
            againstHuman();
        } else if (opponent.equals("computer")){
            againstComputer();
        } else if (opponent.equals("quit")) {
            mainMenu();
        } else {
            System.out.println("Invalid input");
            play();
        }

    }

    public static void againstHuman(){
        Human player1 = new Human();
        Human player2 = new Human();
        System.out.println("Player 1");
        System.out.println("=====");
        player1.makeChoice();
        System.out.println("Player 2");
        System.out.println("=====");
        player2.makeChoice();
        System.out.println("Player 1 picks: " + player1.getChoice());
        System.out.println("Player 2 picks: " + player2.getChoice());
        if (player1.getChoice().equals(player2.getChoice())){
            System.out.println("It's a Draw!");
            history.add("DRAW: Player 1 picked " + player1.getChoice() + ", Player 2 picked " + player2.getChoice());
        } else if (player1.getChoice().equals("rock") && player2.getChoice().equals("scissors")){
            System.out.println("Player 1 wins!");
            history.add("WIN: Player 1 picked " + player1.getChoice() + ", Player 2 picked " + player2.getChoice());
        } else if (player1.getChoice().equals("paper") && player2.getChoice().equals("rock")){
            System.out.println("Player 1 wins!");
            history.add("WIN: Player 1 picked " + player1.getChoice() + ", Player 2 picked " + player2.getChoice());
        } else if (player1.getChoice().equals("scissors") && player2.getChoice().equals("paper")){
            System.out.println("Player 1 wins!");
            history.add("WIN: Player 1 picked " + player1.getChoice() + ", Player 2 picked " + player2.getChoice());
        } else {
            System.out.println("Player 2 wins!");
            history.add("LOSS: Player 1 picked " + player1.getChoice() + ", Player 2 picked " + player2.getChoice());
        }
        System.out.println();
        mainMenu();
    }
    public static void againstComputer(){
        Human player1 = new Human();
        Computer computer = new Computer();
        player1.makeChoice();
        computer.makeChoice();
        System.out.println("User picks: " + player1.getChoice());
        System.out.println("Computer picks: " + computer.getChoice());
        if (player1.getChoice().equals(computer.getChoice())){
            System.out.println("It's a draw!");
            history.add("DRAW: Player 1 picked " + player1.getChoice() + ", Computer picked " + computer.getChoice());
        } else if (player1.getChoice().equals("rock") && computer.getChoice().equals("scissors")){
            System.out.println("Player 1 wins!");
            history.add("WIN: Player 1 picked " + player1.getChoice() + ", Computer picked " + computer.getChoice());
        } else if (player1.getChoice().equals("paper") && computer.getChoice().equals("rock")){
            System.out.println("Player 1 wins!");
            history.add("WIN: Player 1 picked " + player1.getChoice() + ", Computer picked " + computer.getChoice());
        } else if (player1.getChoice().equals("scissors") && computer.getChoice().equals("paper")){
            System.out.println("Player 1 wins!");
            history.add("WIN: Player 1 picked " + player1.getChoice() + ", Computer picked " + computer.getChoice());
        } else {
            System.out.println("Computer wins!");
            history.add("LOSS: Player 1 picked " + player1.getChoice() + ", Computer picked " + computer.getChoice());
        }
        System.out.println();
        mainMenu();
    }

    public static void history(){
        System.out.println("GAME HISTORY");
        System.out.println("=====");
        for (int i=0; i < history.size(); i++){
            System.out.println(history.get(i));
        }
        System.out.println();
        mainMenu();
    }

    public static void quit(){
        System.out.println("Goodbye!");
        System.out.println();
    }


}
