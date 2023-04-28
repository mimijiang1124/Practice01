import java.util.Random;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

import java.util.*;

public class random {

    static String EMPTY = "";

    static int temp = 0;
    static int userInputLength = 0;
    static int IDlength = 0;
    static String specialChars;
    static String chars;
    static boolean withSpecialChars = false;
    static String prefix = EMPTY;
    static String suffix = EMPTY;
    static String newID = EMPTY;
    static String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static void main(String[] args) {

        // String output = "";
        // Try to understand the code

        uniqueID_generator(20, true, "", "");

    }

    public static String uniqueID_generator(int IDlength, boolean withSpecialChars, String prefix, String suffix) {
        Random randomInt = new Random();

        specialChars = "^&*!=0?$";

        // int charLength = characters.length();
        // int specialCharsLength = specialChars.length();

        if (withSpecialChars) {
            characters = characters + specialChars;
            // charLength = charLength + specialCharsLength;
        }

        for (int i = 0; i < IDlength; i++) {
            int randomIndex = (int) (randomInt.nextInt(characters.length()));
            newID = newID + (characters.charAt(randomIndex));
            // System.out.println("randomIndex " + randomIndex + " | newID " + newID);
        }
        System.out.println(newID);

        return newID;
    }

}
