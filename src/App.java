/**
 * OOPSBannerApp UC3 - OOPS Banner Application (Use Case 3)
 *
 * This class extends the functionality of Use Case 2 by improving the way the "OOPS" banner
 * is constructed and displayed. It focuses on enhancing code readability and efficiency
 * by utilizing the String.join() method to create each line of the banner. This approach
 * overcomes the drawbacks of using the + operator for string concatenation, which can lead
 * to code inefficiency due to the creation of multiple intermediate String objects in memory.
 *
 * @author Shourya Parashar
 * @version 3.0
 */
public class App {
    public static void main(String[] args) {
        // Use System.out.println() to print each line of the OOPS banner.
        // Construct each line using String.join() method for better readability and efficiency.

        System.out.println(String.join("", "      ***   ", "   ***    ", "  *****   ", "  *****  "));
        System.out.println(String.join("", "     ** **  ", "  ** **   ", " **   **  ", " **      "));
        System.out.println(String.join("", "    **   ** ", " **   **  ", " **   **  ", " **      "));
        System.out.println(String.join("", "    **   ** ", " **   **  ", " *****    ", "  *****  "));
        System.out.println(String.join("", "    **   ** ", " **   **  ", " **       ", "      ** "));
        System.out.println(String.join("", "     ** **  ", "  ** **   ", " **       ", " **   ** "));
        System.out.println(String.join("", "      ***   ", "   ***    ", " **       ", "  *****  "));
    }
}