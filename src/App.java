/**
 * OOPSBannerApp UC5 - Render OOPS as Banner using Inline Array Initialization
 *
 * This use case extends UC4 by defining and populating the String array in a more
 * concise way at the time of declaration using String.join() method to create each
 * line of the banner. This further enhances code readability and maintainability.
 *
 * @author Shourya Parashar
 * @version 5.0
 */
public class App {
    public static void main(String[] args) {

        // Define String Array variable to hold the OOPS banner lines
        // Each line represents a row in the banner for the letters O, O, P, S
        // Declared and initialized inline in a single statement using array literal syntax
        String[] lines = {
            String.join("", "      ***   ", "   ***    ", "  *****   ", "  *****  "),
            String.join("", "     ** **  ", "  ** **   ", " **   **  ", " **      "),
            String.join("", "    **   ** ", " **   **  ", " **   **  ", " **      "),
            String.join("", "    **   ** ", " **   **  ", " *****    ", "  *****  "),
            String.join("", "    **   ** ", " **   **  ", " **       ", "      ** "),
            String.join("", "     ** **  ", "  ** **   ", " **       ", " **   ** "),
            String.join("", "      ***   ", "   ***    ", " **       ", "  *****  ")
        };

        // Use a for-each loop to iterate through the array and print each line
        // visual effect for the message "OOPS"
        for (String line : lines) {
            System.out.println(line);
        }
    }
}