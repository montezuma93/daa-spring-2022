import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Application {

    /**
     * @see "https://stackoverflow.com/questions/4644415/java-how-to-get-input-from-system-console"
     * @param args
     * @deprecated warum, seit wann
     */
    public static void main(String args[]) throws IOException  //static method
    {

        // Does not work
        /*
        Console console = System.console();
        System.out.println("Bitte geben sie die erste Zahl an ");
        String line = console.readLine();
        int number1 = Integer.parseInt(line);
        System.out.println("Bitte geben sie die zweite Zahl an ");
        line = console.readLine();
        int number2 = Integer.parseInt(line);
        */

        //Works
        /*
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Bitte geben sie die erste Zahl an ");
        String line = reader.readLine();
        int number1 = Integer.parseInt(line);
        System.out.println("Bitte geben sie die zweite Zahl an ");
        line = reader.readLine();
        int number2 = Integer.parseInt(line);
        */

        /**
         * We use Scanner instead of console, because it seems to just work outside from the IDE
         * @See https://stackoverflow.com/questions/4644415/java-how-to-get-input-from-system-console
         **/
        Scanner in = new Scanner(System.in);
        System.out.println("Bitte geben sie die erste Zahl an ");
        int number1 = in.nextInt();
        System.out.println("Bitte geben sie die zweite Zahl an ");
        int number2 = in.nextInt();

        int result = calculateSum(number1, number2);

        System.out.println("Result of " + number1 + " and " + number2 + " is equal to" + result);
    }
    public static int  calculateSum(int number1, int number2) {
        // Verify just positive numbers
        if (number1 <0 || number2 < 0 ) {
            return -1;
        }
        return number1 + number2;
    }

}
