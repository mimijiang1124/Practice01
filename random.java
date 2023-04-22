import java.util.Random;
import java.util.*;

public class random {

    static int temp = 0;
    static int userInputLength = 0;

    public static void main(String[] args) {

        userInputLength = input();
        // String output = "";

        for (int i = userInputLength; i > 0; i--) {
            Random randomString = new Random();
            System.out.printf("\n\nrandomString ", randomString);

            char randomCharacter = (char) (randomString.nextInt(26) + 'a');

            // System.out.print(randomCharacter);

            Random randomInt = new Random();
            System.out.printf("\nrandomInt ", randomInt);

            int randomNumber = (int) (randomInt.nextInt(9) + '0');
            temp = randomNumber;
            if ((temp % 2) == 0) {
                System.out.print(temp);
            } else {
                System.out.print(randomCharacter);
            }
        }
    }

    public static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the token id: ");
        int length = 0;
        length = sc.nextInt();
        sc.close();
        return length;
    }

}
