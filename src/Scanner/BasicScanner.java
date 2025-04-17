package Scanner;

// first import the scanner from java.util
import java.util.Scanner;

public class BasicScanner {
    public static void main(String[] args) {
        // then create a new instance of scanner passing "system.in" to it, and store it on a variable of type Scanner.
        Scanner reader = new Scanner(System.in);

        System.out.println("type a value below");

        // finally you can use it to grab the user input by calling the variable where scanner is stored and using.
        // the method corresponding to the type you're expecting the user to enter.
        // in this case I'm expecting a number of type int, so I use "nextInt".
        int firstValueInput = reader.nextInt();

        System.out.println("type another value below");

        // then of course you can use it multiple times.
        int secondValueInput = reader.nextInt();

        System.out.println("first value typed: " + firstValueInput);
        System.out.println("second value typed: " + secondValueInput);

    }
}
