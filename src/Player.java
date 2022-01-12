public abstract class Player {
    private String choice;

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getChoice() {
        return choice;
    }

    abstract void makeChoice();
}
