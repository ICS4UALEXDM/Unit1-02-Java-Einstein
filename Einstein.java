import java.util.Scanner;
/**
* This program calculates amount of Energy released when mass is converted to
* energy.
*
* @author  Alex De Meo
* @version 1.0
* @since   2023/02/08
*/

public final class Einstein {
    /**
    * This is a private constructor used to satisfy the
    * style checker.
    *
    * @exception IllegalStateException Utility Class
     */
    private Einstein() {
        throw new IllegalStateException("Utility Class");
    }
    /**
    * This is the main method.
    *
    * @param args Unused
    */

    public static void main(String[] args) {
        // Constants that represent predetermined weights and lengths.
        final double lightSpeed = 2.998 * Math.pow(10, 8);

        // Creating the scanner.
        final Scanner scanner = new Scanner(System.in);

        // Getting the radius.
        System.out.print("Enter the Mass: ");
        final String strMass = scanner.nextLine();
        // Checking to ensure no error occurs.
        try {
            final double mass = Double.parseDouble(strMass);
            // Check to make sure its a valid selection
            if (mass >= 0) {
                // Doing the math.
                final double energy = mass * Math.pow(lightSpeed, 2);

                // Outputting the answer to the user.
                System.out.format("The amount of energy released in this "
                    + "reaction is %.3eJ\n", energy);
            } else {
                System.out.println("For this experiment, the mass cannot be "
                    + "negative");
            }

        // What to do if an error was caught.
        } catch (NumberFormatException error) {
            System.out.println("The input must be a numerical value. "
                + error.getMessage());
        }
    }
}
