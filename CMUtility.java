package wangzhe.teamproject;

import java.util.*;

public class CMUtility {
    private static Scanner scanner = new Scanner(System.in);
    /**
	Used for interface menu selection. This method reads the keyboard.
	If the user types any character in '1' - '3', the method returns. 
	Return value to type characters for the user. 
	*/
	public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false);
            c = str.charAt(0);
            if (c != '1' && c != '2' ) {
                System.out.print("Selection error, please re-enter: ");
            } 
            else break;
        }
        return c;
    }

	/**
	Reads a character from the keyboard as the return value of the method. 
	*/
    public static char readChar() {
        String str = readKeyBoard(1, false);
        return str.charAt(0);
    }

	/**
Reads an integer no longer than 1 bit from the keyboard as the return value of the method.           
If the user enters a carriage return directly without entering characters.
	*/
    public static int readInt() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(1, true);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Digital input error, please re-enter: ");
            }
        }
        return n;
    }
    
	/**
Used to confirm the selected input. 
The method reads' y 'or' n 'from the keyboard as the return value of the method. 
	*/
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("Selection error, please re-enter: ");
            }
        }
        return c;
    }

    private static String readKeyBoard(int limit, boolean blankReturn) {
        String line = "";

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.length() == 0) {
                if (blankReturn) return line;
                else continue;
            }

            if (line.length() < 1 || line.length() > limit) {
                System.out.print("Input length (not greater than " + limit + "）Error, please re-enter: ");
                continue;
            }
            break;
        }

        return line;
    }
}


