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
     * @param args arguments
     * @see "https://stackoverflow.com/questions/4644415/java-how-to-get-input-from-system-console"
     * @deprecated warum, seit wann
     */
    public static void main(String[] args) throws IOException  //static method
    {
        /*
        Console console = System.console();
        System.out.println("Bitte geben sie die erste Zahl an ");
        String line = console.readLine();
        int number1 = Integer.parseInt(line);
        System.out.println("Bitte geben sie die zweite Zahl an ");
        line = console.readLine();
        int number2 = Integer.parseInt(line);

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

        System.out.println("Bitte geben sie die Zahl an ");
        int zahl = in.nextInt();
        boolean ausgabe = istQuadratZahl(zahl);
        System.out.println(zahl + " ist Quadratzahl: " + ausgabe);

       /*
        System.out.println("Bitte geben sie die erste Zahl an ");
        double number1 = in.nextInt();
        System.out.println("Bitte geben sie die zweite Zahl an ");
        double number2 = in.nextInt();

        double summe = calculateSum(number1, number2);
        double quotient = calculateProduct(number1, number2);
        double subtract = calculateDivision(number1, number2);
        System.out.println("Geben Sie ein der folgenden Rechenzeichen (+ - * /) ");
        String zeichen = in.next();
        // while (!Objects.equals(zeichen, "+") || !Objects.equals(zeichen, "-") ||
        //        !Objects.equals(zeichen, "*") || !Objects.equals(zeichen, "/") );

        String result = switch (zeichen) {
            case "+" -> String.valueOf(calculateSum(number1, number2));
            case "-" -> String.valueOf(calculateDifference(number1, number2));
            case "*" -> String.valueOf(calculateProduct(number1, number2));
            case "/" -> String.valueOf(calculateDivision(number1, number2));
            default -> "";
        };
        System.out.println("Result: " + number1 + " " + zeichen + " " + number2 + " = " + result);

        System.out.println("Quotient of " + number1 + " and " + number2 + " is equal to " + quotient);
        System.out.println("Sum of " + number1 + " and " + number2 + " is equal to" + summe);
        System.out.println("Subtraction of " + number1 + " and " + number2 + " is equal to " + subtract);
*/
    }

    public static double calculateSum(double number1, double number2) {
        return number1 + number2;
    }

    public static double calculateDivision(double number1, double number2) {
        if (number2 == 0) {
            throw new RuntimeException("Kann nicht durch 0 teilen");
        }
        return number1 / number2;
    }

    public static double calculateDifference(double number1, double number2) {
        return number1 - number2;
    }

    public static double calculateProduct(double number1, double number2) {
        return number1 * number2;
    }

    public static boolean istQuadratZahl(int zahl){
        if (zahl < 1){
            throw new RuntimeException("100% keine Quadratzahl");
        }
        double result = Math.sqrt(zahl);
        return result == (int) result;
    }

}


