package Model;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class TicTacToe {
    Deque<Player> players;
    Board gameBoard;

    public void initializeGame() {
    players=new LinkedList<>();
    PlayingPieceX crossPiece=new PlayingPieceX();
    Player player1=new Player("Player1",crossPiece);

    PlayingPieceO noughtsPiece=new PlayingPieceO();
    Player player2=new Player("Player2",noughtsPiece);

    players.add(player1);
    players.add(player2);
        //initializeBoard
    gameBoard=new Board(3);

    }

    public String startGame() {
        boolean noWinner = true;
        while (noWinner) {
            Player playerTurn = players.removeFirst();


            gameBoard.printBoard();

            List<Pair<Integer, Integer>> freeCells = gameBoard.getFreeCells();
            if (freeCells.isEmpty()) {
                noWinner = false;
                continue;
            }
            System.out.print("Player:" + playerTurn.name + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow,inputColumn, playerTurn.playingPiece);
            if(!pieceAddedSuccessfully) {
                //player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorredt possition chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.playingPiece.pieceType);
            if(winner) {
                return playerTurn.name;
            }
        }

        return "tie";


        }
    public boolean isThereWinner(int row, int column, PieceType pieceType) {
        int size = gameBoard.size;

        // Check row
        boolean rowMatch = true;
        for (int i = 0; i < size; i++) {
            if (gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
                break;
            }
        }

        // Check column
        boolean columnMatch = true;
        for (int i = 0; i < size; i++) {
            if (gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) {
                columnMatch = false;
                break;
            }
        }

        // Check main diagonal (only if the move is on it)
        boolean diagonalMatch = true;
        if (row == column) {
            for (int i = 0; i < size; i++) {
                if (gameBoard.board[i][i] == null || gameBoard.board[i][i].pieceType != pieceType) {
                    diagonalMatch = false;
                    break;
                }
            }
        } else {
            diagonalMatch = false;
        }

        // Check anti-diagonal (only if the move is on it)
        boolean antiDiagonalMatch = true;
        if (row + column == size - 1) {
            for (int i = 0; i < size; i++) {
                if (gameBoard.board[i][size - 1 - i] == null || gameBoard.board[i][size - 1 - i].pieceType != pieceType) {
                    antiDiagonalMatch = false;
                    break;
                }
            }
        } else {
            antiDiagonalMatch = false;
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

}