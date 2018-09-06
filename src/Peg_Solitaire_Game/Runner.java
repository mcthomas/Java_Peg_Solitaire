package Peg_Solitaire_Game;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        char[][] board;
        int[] moves;
        Scanner z = new Scanner(System.in);
        Scanner x = new Scanner(System.in);
        Attributes game = new Attributes("", 0, 0, 0, null, "", 0, 0, 0);
        game.setscanner(z);
        game.setintroPrompt(
                        "\nWELCOME TO PEG SOLITAIRE!			  - Developed by Matt Thomas\n"
                                        + "=========================\n" + "\nBoard Style Menu\n"
                                        + "\n  1) Cross\n" + "  2) Circle\n" + "  3) Triangle\n"
                                        + "  4) Simple T\n" + "\nChoose a board style: ");
        game.setMinimum(1);
        game.setMaximum(4);
        int choice = game.readValidint(game.getscanner(), game.getintroPrompt(), game.getMinimum(),
                        game.getMaximum());
        if (choice == 1) {
            board = game.createBoard("Cross");
        } else if (choice == 2) {
            board = game.createBoard("Circle");
        } else if (choice == 3) {
            board = game.createBoard("Triangle");
        } else {
            board = game.createBoard("Simple T");
        }
        game.displayBoard(board);
        game.displayData(board);

        while (!(game.countPegsRemaining(board) == 1 || game.countMovesAvailable(board) == 0)) {
            moves = game.readValidMove(x, board);
            while (!(game.isValidMove(board, moves[1], moves[0], moves[2]))) {
                System.out.print("That is not a valid move, try again.\n ");
                moves = game.readValidMove(x, board);
            }

            game.performMove(board, moves[1], moves[0], moves[2]);
            game.displayBoard(board);
            game.displayData(board);
        }
        if (game.countPegsRemaining(board) == 1) {
            System.out.print("\nCongrats, you won!" + "\n=========================================="
                            + "\nTHANK YOU FOR PLAYING PEG SOLITAIRE!");
        } else {
            System.out.print(
                            "" + "It looks like there are no more legal moves.  Please try again.");
        }
    }
}
