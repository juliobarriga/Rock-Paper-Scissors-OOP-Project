import java.util.Random;

public class Computer extends Player{
    @Override
    void makeChoice() {
        Random rand = new Random();
        int n = rand.nextInt(3);
        if (n==0){
            setChoice("rock");
        } else if (n==1){
            setChoice("paper");
        } else if (n==2){
            setChoice("scissors");

        }
    }
}
