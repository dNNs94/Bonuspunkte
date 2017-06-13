package tictactoe;

public class Player {
    //Attributes
    private String name;
    private char symbol;
    private int input, zug;

    //Constructor
    public Player() {
       this.setZug(1);
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public int getZug() {
        return zug;
    }

    public void setZug(int zug) {
        this.zug = zug;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

}
