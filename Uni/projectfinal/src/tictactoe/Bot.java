package tictactoe;

public class Bot extends Player {
    //Attributes
    private int difficulty;
    private int randomnumber;

    //Constructor
    public Bot() {
        this.setName("Computer");
        this.setSymbol('x');
    }

    //Setter and Getter
    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getRandomnumber() {
        return randomnumber;
    }

    public void setRandomnumber(int max) {
        this.randomnumber = (int) (Math.round(Math.random() * max + 1));
    }
}
