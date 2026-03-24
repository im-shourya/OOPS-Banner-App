/**
 * OOPSBannerApp UC6 - Render OOPS as Banner using getOPattern(), getPPattern(), and getSPattern() helper methods
 *
 * This use case extends UC5 by moving each letter's pattern construction into its own dedicated static helper method. The array is still initialized inline, but now calls getOPattern(), getPPattern(),and getSPattern() instead of embedding raw strings.
 *
 * @author Shourya Parashar
 * @version 6.0
 */
public class App {
    public static String[] getOPattern() {
        return new String[]{
            " ******* ",
            "*       *",
            "*       *",
            "*       *",
            "*       *",
            "*       *",
            " ******* "
        };
    }

    /**
     * Returns the 7-row ASCII pattern for the letter 'P'.
     * Each element is a 9-character-wide string.
     * @return String array of 7 rows representing 'P'
     */
    public static String[] getPPattern() {
        return new String[]{
            "******** ",
            "*       *",
            "*       *",
            "******** ",
            "*        ",
            "*        ",
            "*        "
        };
    }

    /**
     * Returns the 7-row ASCII pattern for the letter 'S'.
     * Each element is a 9-character-wide string.
     * @return String array of 7 rows representing 'S'
     */
    public static String[] getSPattern() {
        return new String[]{
            " ******* ",
            "*        ",
            "*        ",
            " ******* ",
            "        *",
            "        *",
            " ******* "
        };
    }

    // -------------------------------------------------------------------------
    // Main Method
    // -------------------------------------------------------------------------

    public static void main(String[] args) {

        // Retrieve letter patterns via helper methods (DRY: 'O' reused)
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Assemble 7-row banner by joining corresponding rows of O O P S
        String[] bannerLines = {
            String.join(" ", oPattern[0], oPattern[0], pPattern[0], sPattern[0]),
            String.join(" ", oPattern[1], oPattern[1], pPattern[1], sPattern[1]),
            String.join(" ", oPattern[2], oPattern[2], pPattern[2], sPattern[2]),
            String.join(" ", oPattern[3], oPattern[3], pPattern[3], sPattern[3]),
            String.join(" ", oPattern[4], oPattern[4], pPattern[4], sPattern[4]),
            String.join(" ", oPattern[5], oPattern[5], pPattern[5], sPattern[5]),
            String.join(" ", oPattern[6], oPattern[6], pPattern[6], sPattern[6])
        };

        // Enhanced for-loop: print each assembled banner row
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}