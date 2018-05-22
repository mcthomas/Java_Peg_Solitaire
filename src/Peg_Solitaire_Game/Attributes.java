package Peg_Solitaire_Game;

import java.util.Scanner;

public class Attributes {

    private String boardType;
    private int pegs;
    private int spaces;
    private int blanks;
    private Scanner scanner;
    private String introPrompt;
    private int minimum;
    private int maximum;
    private int direction;

    public Attributes(String boardType, int pegs, int spaces, int blanks, Scanner scanner,
                    String introPrompt, int minimum, int maximum, int direction) {
        this.boardType = boardType;
        this.pegs = pegs;
        this.spaces = spaces;
        this.blanks = blanks;
        this.scanner = scanner;
        this.introPrompt = introPrompt;
        this.minimum = minimum;
        this.maximum = maximum;
        this.direction = direction;
    }

    public char[][] createBoard(String type) {
        setboardType(type);
        if (boardType.equals("Cross")) {
            setPegs(38);
            setSpaces(1);
            setBlanks(24);
            String a = "###&&&###";
            String b = "&&&&&&&&&";
            String c = "&&&&-&&&&";
            char[][] cross = new char[7][9];
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 9; j++) {
                    if (i < 2 || i > 4) {
                        cross[i][j] = a.charAt(j);
                    }
                    if (i == 2 || i == 4) {
                        cross[i][j] = b.charAt(j);
                    }
                    if (i == 3) {
                        cross[i][j] = c.charAt(j);
                    }
                }
            }
            return cross;
        }
        if (boardType.equals("Circle")) {
            setPegs(24);
            setSpaces(8);
            setBlanks(4);
            String a = "#-&&-#";
            String b = "-&&&&-";
            String c = "&&&&&&";
            char[][] circle = new char[6][6];
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (i == 0 || i == 5) {
                        circle[i][j] = a.charAt(j);
                    }
                    if (i == 1 || i == 4) {
                        circle[i][j] = b.charAt(j);
                    }
                    if (i == 2 || i == 3) {
                        circle[i][j] = c.charAt(j);
                    }
                }
            }
            return circle;
        }
        if (boardType.equals("Triangle")) {
            setPegs(15);
            setSpaces(9);
            setBlanks(12);
            String a = "###-&-###";
            String b = "##-&&&-##";
            String c = "#-&&-&&-#";
            String d = "-&&&&&&&-";
            char[][] triangle = new char[4][9];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 9; j++) {
                    if (i == 0) {
                        triangle[i][j] = a.charAt(j);
                    }
                    if (i == 1) {
                        triangle[i][j] = b.charAt(j);
                    }
                    if (i == 2) {
                        triangle[i][j] = c.charAt(j);
                    }
                    if (i == 3) {
                        triangle[i][j] = d.charAt(j);
                    }
                }
            }
            return triangle;
        }
        if (boardType.equals("Simple T")) {
            setPegs(5);
            setSpaces(20);
            setBlanks(0);
            String a = "-----";
            String b = "-&&&-";
            String c = "--&--";
            char[][] simpleT = new char[5][5];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (i == 0 || i == 4) {
                        simpleT[i][j] = a.charAt(j);
                    }
                    if (i == 1) {
                        simpleT[i][j] = b.charAt(j);
                    }
                    if (i == 2 || i == 3) {
                        simpleT[i][j] = c.charAt(j);
                    }
                }
            }
            return simpleT;
        } else
            return null;
    }

    public void setboardType(String a) {
        boardType = a;
    }

    public String getboardType() {
        return boardType;
    }

    public void setPegs(int pegs) {
        this.pegs = pegs;
    }

    public void setSpaces(int spaces) {
        this.spaces = spaces;
    }

    public void setBlanks(int blanks) {
        this.blanks = blanks;
    }

    public int getPegs() {
        return pegs;
    }

    public int getSpaces() {
        return spaces;
    }

    public int getBlanks() {
        return blanks;
    }

    public void setscanner(Scanner s) {
        scanner = s;
    }

    public Scanner getscanner() {
        return scanner;
    }

    public void setintroPrompt(String t) {
        introPrompt = t;
    }

    public String getintroPrompt() {
        return introPrompt;
    }

    public void setMinimum(int o) {
        minimum = o;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMaximum(int p) {
        maximum = p;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setDirection(int v) {
        direction = v;
    }

    public int getDirection() {
        return direction;
    }

    public void displayBoard(char[][] board) {
        if (getboardType().equals("Cross") || getboardType().equals("Triangle")) {
            System.out.println("\n  123456789" + "\n");
        }
        if (getboardType().equals("Circle")) {
            System.out.println("\n  123456" + "\n");
        }
        if (getboardType().equals("Simple T")) {
            System.out.println("\n  12345" + "\n");
        }
        int a = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i == 0) {
                    if (j == board[i].length - 1) {
                        System.out.println(board[i][j]);
                        a = 0;
                    } else {
                        if (a == 0) {
                            System.out.print(i + 1 + " " + board[i][j]);
                            a = 1;
                        } else {
                            System.out.print(board[i][j]);
                        }
                    }
                }
                if (i == 1) {
                    if (j == board[i].length - 1) {
                        System.out.println(board[i][j]);
                        a = 0;
                    } else {
                        if (a == 0) {
                            System.out.print(i + 1 + " " + board[i][j]);
                            a = 1;
                        } else {
                            System.out.print(board[i][j]);
                        }
                    }
                }
                if (i == 2) {
                    if (j == board[i].length - 1) {
                        System.out.println(board[i][j]);
                        a = 0;
                    } else {
                        if (a == 0) {
                            System.out.print(i + 1 + " " + board[i][j]);
                            a = 1;
                        } else {
                            System.out.print(board[i][j]);
                        }
                    }
                }
                if (i == 3) {
                    if (j == board[i].length - 1) {
                        System.out.println(board[i][j]);
                        a = 0;
                    } else {
                        if (a == 0) {
                            System.out.print(i + 1 + " " + board[i][j]);
                            a = 1;
                        } else {
                            System.out.print(board[i][j]);
                        }
                    }
                }
                if (i == 4) {
                    if (j == board[i].length - 1) {
                        System.out.println(board[i][j]);
                        a = 0;
                    } else {
                        if (a == 0) {
                            System.out.print(i + 1 + " " + board[i][j]);
                            a = 1;
                        } else {
                            System.out.print(board[i][j]);
                        }
                    }
                }
                if (i == 5) {
                    if (j == board[i].length - 1) {
                        System.out.println(board[i][j]);
                        a = 0;
                    } else {
                        if (a == 0) {
                            System.out.print(i + 1 + " " + board[i][j]);
                            a = 1;
                        } else {
                            System.out.print(board[i][j]);
                        }
                    }
                }
                if (i == 6) {
                    if (j == board[i].length - 1) {
                        System.out.println(board[i][j]);
                        a = 0;
                    } else {
                        if (a == 0) {
                            System.out.print(i + 1 + " " + board[i][j]);
                            a = 1;
                        } else {
                            System.out.print(board[i][j]);
                        }
                    }
                }
            }
        }
    }

    public void displayData(char[][] board) {
        System.out.print("\nPossible remaining moves - " + countMovesAvailable(board)
                        + "		Remaining Pegs - " + countPegsRemaining(board) + "\n");
    }

    public int readValidint(Scanner in, String prompt, int min, int max) {
        System.out.print(prompt);
        min = getMinimum();
        max = getMaximum();
        String option = in.nextLine();
        while (isNumeric(option) == false || Integer.parseInt(option) < min
                        || Integer.parseInt(option) > max) {
            System.out.print("Please enter an integer between 1 and 4.");
            option = in.nextLine();

        }


        return Integer.parseInt(option);
    }

    @SuppressWarnings("unused")
    public boolean isNumeric(String input) {
        try {
            double test = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public int[] readValidMove(Scanner in, char[][] board) {
        System.out.print("\nChoose the COLUMN of a peg you'd like to move: ");
        String column = in.nextLine();
        while (isNumeric(column) == false || Integer.parseInt(column) < 1
                        || Integer.parseInt(column) > board[0].length) {
            System.out.print("\nPlease enter a valid column's number between 1 and "
                            + board[0].length + ".");
            column = in.nextLine();
            System.out.print("\n");
        }
        System.out.print("Choose the ROW of a peg you'd like to move: ");
        String row = in.nextLine();
        while (isNumeric(row) == false || Integer.parseInt(row) < 1
                        || Integer.parseInt(row) > board.length) {
            System.out.print("Please enter a valid row's number between 1 and " + board.length
                            + ".");
            row = in.nextLine();
        }
        System.out.print(
                        "Choose a DIRECTION to move that peg 1) UP, 2) DOWN, 3) LEFT, or 4) RIGHT: ");
        String test = in.nextLine();
        while (isNumeric(test) == false || Integer.parseInt(test) < 1
                        || Integer.parseInt(test) > 5) {
            System.out.print("\nPlease enter a valid direction's integer between 1 and 4. ");
            test = in.nextLine();
        }
        setDirection(Integer.parseInt(test));
        int[] move = {Integer.parseInt(column), Integer.parseInt(row), getDirection()};
        return move;
    }

    public boolean isValidMove(char[][] board, int row, int column, int direction) {
        char peg = '&';
        char space = '-';
        if (!(board[row - 1][column - 1] == peg)) {
            return false;
        }

        if (getboardType().equals("Cross")) {
            if (row < 3 && getDirection() == 1) {
                return false;
            }
            if (row > 5 && getDirection() == 2 || (!(board[row - 1][column - 1] == peg))) {
                return false;
            }
            if (column < 3 && getDirection() == 3 || (!(board[row - 1][column - 1] == peg))) {
                return false;
            }
            if (column > 7 && getDirection() == 4 || (!(board[row - 1][column - 1] == peg))) {
                return false;
            }
        }
        if (getboardType().equals("Circle")) {
            if (row < 3 && getDirection() == 1 || (!(board[row - 1][column - 1] == peg))) {
                return false;
            }
            if (row > 4 && getDirection() == 2 || (!(board[row - 1][column - 1] == peg))) {
                return false;
            }
            if (column < 3 && getDirection() == 3 || (!(board[row - 1][column - 1] == peg))) {
                return false;
            }
            if (column > 4 && getDirection() == 4 || (!(board[row - 1][column - 1] == peg))) {
                return false;
            }
        }
        if (getboardType().equals("Triangle")) {
            if (row < 3 && getDirection() == 1 || (!(board[row - 1][column - 1] == peg))) {
                return false;
            }
            if (row > 2 && getDirection() == 2 || (!(board[row - 1][column - 1] == peg))) {
                return false;
            }
            if (column < 3 && getDirection() == 3 || (!(board[row - 1][column - 1] == peg))) {
                return false;
            }
            if (column > 7 && getDirection() == 4 || (!(board[row - 1][column - 1] == peg))) {
                return false;
            }
        }
        if (getboardType().equals("Simple T")) {
            if (row < 3 && getDirection() == 1 || (!(board[row - 1][column - 1] == peg))) {
                return false;
            }
            if (row > 3 && getDirection() == 2 || (!(board[row - 1][column - 1] == peg))) {
                return false;
            }
            if (column < 3 && getDirection() == 3 || (!(board[row - 1][column - 1] == peg))) {
                return false;
            }
            if (column > 3 && getDirection() == 4 || (!(board[row - 1][column - 1] == peg))) {
                return false;
            }
        }


        if (direction == 1) {
            if (board[row - 1][column - 1] == peg) {
                if (board[row - 3][column - 1] == space) {
                    return true;
                }
            }
        }
        if (direction == 2) {
            if (board[row - 1][column - 1] == peg) {
                if (board[row + 1][column - 1] == space) {
                    return true;
                }
            }
        }
        if (direction == 3) {
            if (board[row - 1][column - 1] == peg) {
                if (board[row - 1][column - 3] == space) {
                    return true;
                }
            }
        }
        if (direction == 4) {
            if (board[row - 1][column - 1] == peg) {
                if (board[row - 1][column + 1] == space) {
                    return true;
                }
            }
        }
        return false;

    }

    public char[][] performMove(char[][] board, int row, int column, int direction) {
        char space = '-';
        char peg = '&';
        if (direction == 1) {
            board[row - 1][column - 1] = space;
            board[row - 2][column - 1] = space;
            board[row - 3][column - 1] = peg;
        }
        if (direction == 2) {
            board[row - 1][column - 1] = space;
            board[row][column - 1] = space;
            board[row + 1][column - 1] = peg;
        }
        if (direction == 3) {
            board[row - 1][column - 1] = space;
            board[row - 1][column - 2] = space;
            board[row - 1][column - 3] = peg;
        }
        if (direction == 4) {
            board[row - 1][column - 1] = space;
            board[row - 1][column] = space;
            board[row - 1][column + 1] = peg;
        }
        return board;
    }

    public int countPegsRemaining(char[][] board) {
        int initialPegs = getPegs();
        int dif = 0;
        char peg = '&';
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == peg) {
                    dif++;
                }
            }
        }
        return initialPegs - (initialPegs - dif);
    }

    public int countMovesAvailable(char[][] board) {
        int count = 0;
        char peg = '&';
        char space = '-';
        for (int i = 2; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == peg || board[i][j] == space) {
                    if ((board[i][j] == peg && board[i - 2][j] == space && board[i - 1][j] == peg)
                                    || (board[i][j] == space && board[i - 2][j] == peg
                                                    && board[i - 1][j] == peg)) {
                        count++;
                    }
                }
            }
        }
        for (int i = 0; i < board.length - 2; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == peg || board[i][j] == space) {
                    if ((board[i][j] == peg && board[i + 2][j] == space && board[i + 1][j] == peg)
                                    || (board[i][j] == space && board[i + 2][j] == peg
                                                    && board[i + 1][j] == peg)) {
                        count++;
                    }
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 2; j < board[0].length; j++) {
                if (board[i][j] == peg || board[i][j] == space) {
                    if ((board[i][j] == peg && board[i][j - 2] == space && board[i][j - 1] == peg)
                                    || (board[i][j] == space && board[i][j - 2] == peg
                                                    && board[i][j - 1] == peg)) {
                        count++;
                    }
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length - 2; j++) {
                if (board[i][j] == peg || board[i][j] == space) {
                    if ((board[i][j] == peg && board[i][j + 2] == space && board[i][j + 1] == peg)
                                    || (board[i][j] == space && board[i][j + 2] == peg
                                                    && board[i][j + 1] == peg)) {
                        count++;
                    }
                }
            }
        }
        return count / 2;
    }

}
