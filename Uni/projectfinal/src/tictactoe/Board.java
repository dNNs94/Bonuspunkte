package tictactoe;

public class Board {
    //Attributes
    private Field[] fields;
    private Player[] players;
    private Bot bot;
    private String Winner;
    private boolean win, tie;
    private int zug;

    //Constructor
    public Board(){
        this.setFields();
        this.setPlayers();
        this.setBot();
        this.setZug(1);
        this.setWin(false);
        this.setTie(false);
    }

    //Setter and Getter
    public Field getField(int i) {
        return fields[i];
    }

    public void setFields() {
        this.fields = new Field[9];
        for(int i = 0; i < 9; i++){
            this.fields[i] = new Field((char) 'i', i + 1, false);
        }
    }

    public Player getPlayers(int i) {
        return players[i];
    }

    public void setPlayers() {
        this.players = new Player[2];
        for(int i = 0; i < 2; i++){
            this.players[i] = new Player();
        }
    }

    public Bot getBot() {
        return bot;
    }

    public void setBot() {
        this.bot = new Bot();
    }

    public void setFieldEntry(int posnr, char entry) {
        getField(posnr).setEntry(entry);
    }

    public char getFieldEntry(int posnr) {
        return getField(posnr).getEntry();
    }

    public int getZug() {
        return zug;
    }

    public void setZug(int zug) {
        this.zug = zug;
    }

    public void setFieldLocked(int posnr) {
        getField(posnr).setLocked(true);
    }

    public boolean isFieldLocked(int posnr) {
        return getField(posnr).getLocked();
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public boolean isTie() {
        return tie;
    }

    public void setTie(boolean tie) {
        this.tie = tie;
    }

    public String getWinner() {
        return Winner;
    }

    public void setWinner(String winner) {
        Winner = winner;
    }

    public void showBoard(){
        System.out.println("| " + getFieldEntry(0) + " | " + getFieldEntry(1) + " | " + getFieldEntry(2) + " |");
        System.out.println("| " + getFieldEntry(3) + " | " + getFieldEntry(4) + " | " + getFieldEntry(5) + " |");
        System.out.println("| " + getFieldEntry(6) + " | " + getFieldEntry(7) + " | " + getFieldEntry(8) + " |");
    }
}
