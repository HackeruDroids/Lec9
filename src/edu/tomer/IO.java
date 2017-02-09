package edu.tomer;

import java.util.Scanner;

/**
 * Created by hackeru on 09/02/2017.
 */
public class IO {
    public static Scanner scanner = new Scanner(System.in);

    private IO(){}

    public static int getInt(String message){
        System.out.println(message);
        return scanner.nextInt();
    }

    public static String getString(String message) {
        System.out.println(message);
        return scanner.next();
    }
}
