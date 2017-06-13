package tictactoe;

public class Field {
    //Attributes
    private char entry;
    private int pos, posnr;
    private boolean locked;

    //Constructor
    public Field(char entry, int posnr, boolean locked) {
        this.setEntry(entry);
        this.setPosnr(posnr);
        this.setLocked(locked);
    }

    //Getter and Setter
    public char getEntry() {
        return entry;
    }

    public void setEntry(char entry) {
        this.entry = entry;
    }

    public int getPos() {
        return this.pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getPosnr() {
        return posnr;
    }

    public void setPosnr(int posnr) {
        this.posnr = posnr;
    }

    public boolean getLocked() {
        return this.locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
