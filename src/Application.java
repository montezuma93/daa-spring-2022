import java.io.IOException;
import java.util.Scanner;

/*
* Eine neue Methode, welche Zwei Zahlen mit einander dividiert (geteilt)
*  Eine neue Methode, welche zwei Zahlen mit einander differenziert (minus)
*  Eine neue Methode, welche zwei Zahlen mit einander multipliziert (mal)
* Den User nicht nur nach zwei zahlen fragen, sondern davor fragen was er rechnen will
 */

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
        double number1 = in.nextInt();
        System.out.println("Bitte geben sie die zweite Zahl an ");
        double number2 = in.nextInt();

        double result = calculateSum(number1, number2);
        double quotient = calculateQuotient(number1, number2);

        System.out.println("Quotient of " + number1 + " and " + number2 + " is equal to " + quotient);
    }
    public static double  calculateSum(double number1, double number2) {
        return number1 + number2;
    }

    public static double calculateQuotient(double number1, double number2) {
        if (number2 == 0){
            throw new RuntimeException("Teilen durch 0 nicht möglich!") ;
        }
        return number1 / number2;
    }
}


