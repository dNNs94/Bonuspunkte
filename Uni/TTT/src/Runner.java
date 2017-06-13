package tictactoe;

public class Runner {
    public static void main(String[] args){
        Gameinstance g1 = new Gameinstance(); //create new game instance
        g1.askForMode();    // determine if singleplayer or multiplayer game
        g1.gameSettings();  // determine how many boards of which kind want the players want to play
        g1.turn();
        g1.turn();
        g1.turn();
        g1.turn();
        g1.turn();
        g1.showWinner();
    }
}
