package tictactoe;

public class Gameinstance {

    //Attributes
    private Board board;                // Array of object Board
    boolean multiplayer;

    //Constructor
    public Gameinstance() {
        this.setBoard();
    }

    //Setter and Getter
    public Board getBoard() {
        return board;
    }

    public void setBoard() {
        this.board = new Board();
    }

    public boolean isMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(boolean multiplayer) {
        this.multiplayer = multiplayer;
    }

    //Behavior
    private void doTurn(int playerinput, char playersymbol) {
        getBoard().setFieldEntry(playerinput - 1, playersymbol);
        getBoard().setFieldLocked(playerinput - 1);
    }

    private void checkWin(int si) {
        if (getBoard().getFieldEntry(0) == getBoard().getPlayers(si).getSymbol()            //horizontal
                && getBoard().getFieldEntry(1) == getBoard().getPlayers(si).getSymbol()
                && getBoard().getFieldEntry(2) == getBoard().getPlayers(si).getSymbol()
                || getBoard().getFieldEntry(3) == getBoard().getPlayers(si).getSymbol()
                && getBoard().getFieldEntry(4) == getBoard().getPlayers(si).getSymbol()
                && getBoard().getFieldEntry(5) == getBoard().getPlayers(si).getSymbol()
                || getBoard().getFieldEntry(6) == getBoard().getPlayers(si).getSymbol()
                && getBoard().getFieldEntry(7) == getBoard().getPlayers(si).getSymbol()
                && getBoard().getFieldEntry(8) == getBoard().getPlayers(si).getSymbol()) {
            getBoard().setWin(true);
        } else if (getBoard().getFieldEntry(0) == getBoard().getPlayers(si).getSymbol()     //vertical
                && getBoard().getFieldEntry(3) == getBoard().getPlayers(si).getSymbol()
                && getBoard().getFieldEntry(6) == getBoard().getPlayers(si).getSymbol()
                || getBoard().getFieldEntry(1) == getBoard().getPlayers(si).getSymbol()
                && getBoard().getFieldEntry(4) == getBoard().getPlayers(si).getSymbol()
                && getBoard().getFieldEntry(7) == getBoard().getPlayers(si).getSymbol()
                || getBoard().getFieldEntry(2) == getBoard().getPlayers(si).getSymbol()
                && getBoard().getFieldEntry(5) == getBoard().getPlayers(si).getSymbol()
                && getBoard().getFieldEntry(8) == getBoard().getPlayers(si).getSymbol()) {
            getBoard().setWin(true);
        } else if (getBoard().getFieldEntry(0) == getBoard().getPlayers(si).getSymbol()     //diagonal
                && getBoard().getFieldEntry(4) == getBoard().getPlayers(si).getSymbol()
                && getBoard().getFieldEntry(8) == getBoard().getPlayers(si).getSymbol()
                || getBoard().getFieldEntry(2) == getBoard().getPlayers(si).getSymbol()
                && getBoard().getFieldEntry(4) == getBoard().getPlayers(si).getSymbol()
                && getBoard().getFieldEntry(6) == getBoard().getPlayers(si).getSymbol()) {
            getBoard().setWin(true);
        }
        if (getBoard().isWin()) {
            getBoard().setWinner(getBoard().getPlayers(si).getName());
        }
    }

    private void checkBotWin() {
        if (getBoard().getFieldEntry(0) == getBoard().getBot().getSymbol()            //horizontal
                && getBoard().getFieldEntry(1) == getBoard().getBot().getSymbol()
                && getBoard().getFieldEntry(2) == getBoard().getBot().getSymbol()
                || getBoard().getFieldEntry(3) == getBoard().getBot().getSymbol()
                && getBoard().getFieldEntry(4) == getBoard().getBot().getSymbol()
                && getBoard().getFieldEntry(5) == getBoard().getBot().getSymbol()
                || getBoard().getFieldEntry(6) == getBoard().getBot().getSymbol()
                && getBoard().getFieldEntry(7) == getBoard().getBot().getSymbol()
                && getBoard().getFieldEntry(8) == getBoard().getBot().getSymbol()) {
            getBoard().setWin(true);
        } else if (getBoard().getFieldEntry(0) == getBoard().getBot().getSymbol()     //vertical
                && getBoard().getFieldEntry(3) == getBoard().getBot().getSymbol()
                && getBoard().getFieldEntry(6) == getBoard().getBot().getSymbol()
                || getBoard().getFieldEntry(1) == getBoard().getBot().getSymbol()
                && getBoard().getFieldEntry(4) == getBoard().getBot().getSymbol()
                && getBoard().getFieldEntry(7) == getBoard().getBot().getSymbol()
                || getBoard().getFieldEntry(2) == getBoard().getBot().getSymbol()
                && getBoard().getFieldEntry(5) == getBoard().getBot().getSymbol()
                && getBoard().getFieldEntry(8) == getBoard().getBot().getSymbol()) {
            getBoard().setWin(true);
        } else if (getBoard().getFieldEntry(0) == getBoard().getBot().getSymbol()     //diagonal
                && getBoard().getFieldEntry(4) == getBoard().getBot().getSymbol()
                && getBoard().getFieldEntry(8) == getBoard().getBot().getSymbol()
                || getBoard().getFieldEntry(2) == getBoard().getBot().getSymbol()
                && getBoard().getFieldEntry(4) == getBoard().getBot().getSymbol()
                && getBoard().getFieldEntry(6) == getBoard().getBot().getSymbol()) {
            getBoard().setWin(true);
        }
        if (getBoard().isWin()) {
            getBoard().setWinner(getBoard().getBot().getName());
        }
    }

    private boolean checkTurn(int playerinput) {
        if (getBoard().isFieldLocked(playerinput - 1)) {
            return false;
        } else return true;
    }

    public void askForMode() {
        System.out.println("Multispieler-Modus? true/false");
        boolean a;
        a = new java.util.Scanner(System.in).nextBoolean();
        if (a) {                         //if multi-players is wanted set playercount = 2, create two
            setMultiplayer(true);        //new players instances
            getBoard().setPlayers();
        } else {
            setMultiplayer(false);
            getBoard().setPlayers();
        }
    }

    public void gameSettings() {
        System.out.println("Einstellungen:");
        settingsmultiplayer:
        settingssingleplayer:
        if (isMultiplayer()) {
            System.out.println("#######################################################################"); //visual
            System.out.println("Spieler 1:"); //visual
            System.out.println("Bitte geben Sie einen Namen ein!"); //ask for name of players one
            String name1 = new java.util.Scanner(System.in).next();
            getBoard().getPlayers(0).setName(name1); //determine name of players one
            System.out.println(getBoard().getPlayers(0).getName() + ", welches Spielsymbol wollen sie verwenden?"); //ask for symbol of players one
            char symbol1 = new java.util.Scanner(System.in).next().charAt(0);
            getBoard().getPlayers(0).setSymbol(symbol1); //determine symbol of players 1
            System.out.println("#######################################################################"); //visual
            System.out.println("Spieler 2:"); //visual
            System.out.println("Bitte geben Sie einen Namen ein!"); //ask for the name of the second players
            String name2 = new java.util.Scanner(System.in).next();
            getBoard().getPlayers(1).setName(name2); //determine name of players one
            System.out.println(getBoard().getPlayers(1).getName() + ", welches Spielsymbol wollen sie verwenden?"); //ask for symbol of players one
            char symbol2 = new java.util.Scanner(System.in).next().charAt(0);
            getBoard().getPlayers(1).setSymbol(symbol2); //determine symbol of players 1
            System.out.println("#######################################################################"); //visual
            System.out.println("Gesetzte Einstellungen:");
            System.out.println("Name des ersten Spielers:");
            System.out.println(getBoard().getPlayers(0).getName());
            System.out.println("Name des zweiten Spielers:");
            System.out.println(getBoard().getPlayers(1).getName());
            System.out.println("Symbol von " + getBoard().getPlayers(0).getName() + ":");
            System.out.println(getBoard().getPlayers(0).getSymbol());
            System.out.println("Symbol von " + getBoard().getPlayers(1).getName() + ":");
            System.out.println(getBoard().getPlayers(1).getSymbol());
            System.out.println("Sind diese Einstellungen richtig? true/false");
            boolean a = new java.util.Scanner(System.in).nextBoolean();
            if(!a){
                break settingsmultiplayer;
            }
            System.out.println("#######################################################################"); //visual
            System.out.println("Alle Einstellungen wurden gesetzt");
        }else if(!isMultiplayer()) {
            System.out.println("#######################################################################"); //visual
            System.out.println("Spieler:"); //visual
            System.out.println("Bitte geben Sie einen Namen ein!"); //ask for name of players one
            String name1 = new java.util.Scanner(System.in).next();
            getBoard().getPlayers(0).setName(name1); //determine name of players one
            System.out.println(getBoard().getPlayers(0).getName() + ", welches Spielsymbol wollen sie verwenden?"); //ask for symbol of players one
            char symbol2 = new java.util.Scanner(System.in).next().charAt(0);
            getBoard().getPlayers(0).setSymbol(symbol2); //determine symbol of players 1
            System.out.println("Wähle einen Schwierigkeitsgrad! 1/2/3");
            int difficulty1 = new java.util.Scanner(System.in).nextInt();
            getBoard().getBot().setDifficulty(difficulty1);
            System.out.println("#######################################################################"); //visual
            System.out.println("Gesetzte Einstellungen:");
            System.out.println("Name des ersten Spielers:");
            System.out.println(getBoard().getPlayers(0).getName());
            System.out.println("Symbol von " + getBoard().getPlayers(0).getName() + ":");
            System.out.println(getBoard().getPlayers(0).getSymbol());
            System.out.println("Schwierigkeitsgrad des Bots:");
            System.out.println(getBoard().getBot().getDifficulty());
            System.out.println("Sind diese Einstellungen richtig? true/false");
            boolean b;
            b = new java.util.Scanner(System.in).nextBoolean();
            if (!b) {
                break settingssingleplayer;
            }
            System.out.println("#######################################################################"); //visual
            System.out.println("Alle Einstellungen wurden gesetzt");
        }
    }

    public void turn() {
        if (getBoard().isWin()) {
            return;
        }
        if (isMultiplayer()) {
            for (int si = 0; si < 2; si++) {
                if (getBoard().isWin()) {
                    return;
                }
                System.out.println(getBoard().getPlayers(si).getName() + " mache deinen " + getBoard().getZug() + ". Zug");
                getBoard().showBoard();
                getBoard().getPlayers(si).setInput(new java.util.Scanner(System.in).nextInt());
                checkturn:
                if (checkTurn(getBoard().getPlayers(si).getInput())) {
                    doTurn(getBoard().getPlayers(si).getInput(), getBoard().getPlayers(si).getSymbol());
                    getBoard().getPlayers(si).setZug(getBoard().getPlayers(si).getZug() + 1);
                } else if (!checkTurn(getBoard().getPlayers(si).getInput())) {
                    System.out.println("Das von dir ausgesuchte Feld ist bereits gesetzt, bitte wähle ein anderes");
                    getBoard().getPlayers(si).setInput(new java.util.Scanner(System.in).nextInt());
                    break checkturn;
                }
                checkWin(si);
                if (si == 1) {
                    getBoard().setZug(getBoard().getZug() + 1);
                }
                System.out.println("#######################################################################"); //visual
                System.out.println("NEXT PLAYER!");
                System.out.println("#######################################################################");
            }
            if (!getBoard().isWin() && getBoard().getZug() == 6) {
                getBoard().setTie(true);
                return;
            }
        System.out.println("#######################################################################"); //visual
        System.out.println("NEXT ROUND!");
        System.out.println("#######################################################################");
        }else if(!isMultiplayer()) {
            System.out.println(getBoard().getPlayers(0).getName() + " mache deinen " + getBoard().getZug() + ". Zug");
            getBoard().showBoard();
            getBoard().getPlayers(0).setInput(new java.util.Scanner(System.in).nextInt());
            checkturn:
            if (checkTurn(getBoard().getPlayers(0).getInput())) {
                doTurn(getBoard().getPlayers(0).getInput(), getBoard().getPlayers(0).getSymbol());
                getBoard().getPlayers(0).setZug(getBoard().getPlayers(0).getZug() + 1);
            } else if (!checkTurn(getBoard().getPlayers(0).getInput())) {
                System.out.println("Das von dir ausgesuchte Feld ist bereits gesetzt, bitte wähle ein anderes");
                getBoard().getPlayers(0).setInput(new java.util.Scanner(System.in).nextInt());
                break checkturn;
            }
            checkWin(0);
            if (getBoard().isWin()) {
                return;
            }
            System.out.println("#######################################################################"); //visual
            System.out.println("TURN BOT");
            System.out.println("#######################################################################");
            if(getBoard().getBot().getDifficulty() == 1) {
                getBoard().getBot().setRandomnumber(9);
                getBoard().getBot().setInput(getBoard().getBot().getRandomnumber());
                checkbotturn:
                if(checkTurn(getBoard().getBot().getInput())) {
                    doTurn(getBoard().getBot().getInput(), getBoard().getBot().getSymbol());
                    getBoard().getBot().setZug(getBoard().getBot().getZug() + 1);
                }else if(!checkTurn(getBoard().getBot().getInput())) {
                    getBoard().getBot().setRandomnumber(9);
                    getBoard().getBot().setInput(getBoard().getBot().getRandomnumber());
                    break checkbotturn;
                }
                getBoard().showBoard();
                checkBotWin();
                if (getBoard().isWin()) {
                    return;
                }
                getBoard().setZug(getBoard().getZug() + 1);
                System.out.println("#######################################################################"); //visual
                System.out.println("NEXT ROUND!");
                System.out.println("#######################################################################");
            }
        }
    }

    public void showWinner() {
        if (getBoard().isWin()) {
            System.out.println("GRATZ " + getBoard().getWinner() + " du hast das Spiel gewonnen");
        }else if(getBoard().isTie()) {
            System.out.println("Ihr habt unentschieden gespielt");
        }
    }

}
