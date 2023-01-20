package nus.iss;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        String[] tttBoard = new String[9]; 
        //player X and 0
        String player = "X"; 

        //populating the tic tac toe board with 1 to 9 
        for(int i = 0; i<9; i++){
            tttBoard[i] = String.valueOf(i+1); 
        }

        //print out the initial tic tac toe board
        tictactoe ttt = new tictactoe(); 

        ttt.printBoard(tttBoard);

        System.out.println("Tic tac toe game");
        

    }
}
