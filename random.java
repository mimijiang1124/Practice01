import java.util.Random;
import java.util.*;

public class random {

    static int temp = 0;
    static int userInputLength = 0;
    static int IDlength = 0;
    static String specialChars;
    static String chars;
    static boolean withSpecialChars = false;
    static String prefix = "";
    static String suffix = "";
    static String newID;

    public static void main(String[] args) {

        userInputLength = input();
        // String output = "";
        // Try to understand the code

    }

    public static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the token id: ");
        int length = 0;
        length = sc.nextInt();
        sc.close();
        return length;
    }

    public String uniqueID_generator(int a, boolean b, String c, String d, Random randomInt){
        specialChars = "@#%@#$@#$^";

        if (b){
            
        }else{
            
        }

        for (int i=0; i<a; i++){
            int randomNumber = (int) (randomInt.nextInt(9) + '0');
            String newID = newID + 
        }

        return "";
    }

}
