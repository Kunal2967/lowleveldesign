package Model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public PlayingPiece[][] board;
    public int size;
    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int x, int y, PlayingPiece piece) {
        if(board[x][y]!=null){
            return false;
        }
        board[x][y] = piece;
        return true;
    }

    public List<Pair<Integer, Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    Pair<Integer, Integer> rowColumn = new Pair<>(i, j);
                    freeCells.add(rowColumn);
                }
            }
        }

        return freeCells;
    }

    public void printBoard() {
        System.out.println("Current Board State:");
        System.out.println("-----------------");

        for (int i = 0; i < size; i++) {
            System.out.print("| ");
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    System.out.print("  | ");
                } else {
                    System.out.print(board[i][j].pieceType + " | ");
                }
            }
            System.out.println();
            System.out.println("-----------------");
        }
    }


}
