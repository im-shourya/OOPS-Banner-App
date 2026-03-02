/**
 * OOPSBannerApp UC4 - Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 * statements and improving modularity and reusability.
 *
 * @author Shourya Parashar
 * @version 4.0
 */
public class App {
    public static void main(String[] args) {

        // 1. Define a String array with a size equal to the number of lines in the banner
        String[] lines = new String[7];

        // 2. Populate each index of the array with the corresponding banner line using String.join()
        lines[0] = String.join("", "      ***   ", "   ***    ", "  *****   ", "  *****  ");
        lines[1] = String.join("", "     ** **  ", "  ** **   ", " **   **  ", " **      ");
        lines[2] = String.join("", "    **   ** ", " **   **  ", " **   **  ", " **      ");
        lines[3] = String.join("", "    **   ** ", " **   **  ", " *****    ", "  *****  ");
        lines[4] = String.join("", "    **   ** ", " **   **  ", " **       ", "      ** ");
        lines[5] = String.join("", "     ** **  ", "  ** **   ", " **       ", " **   ** ");
        lines[6] = String.join("", "      ***   ", "   ***    ", " **       ", "  *****  ");

        // 3. Use a for-each loop to iterate through the array and print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}