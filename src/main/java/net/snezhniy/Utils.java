package net.snezhniy;

import java.io.Reader;
import java.util.Scanner;

public class Utils {
    /* Scanner factory */
    public static Scanner makeScanner() {
        Reader reader = System.console().reader();
        return new Scanner(reader);
    }
}
