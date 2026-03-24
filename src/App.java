/**
 * OOPSBannerApp UC7 - Render OOPS as Banner using CharacterPatternMap Class
 *
 * This use case extends UC6 by creating a CharacterPatternMap class that
 * encapsulates character data and its corresponding banner pattern. This allows
 * the application to retrieve and display the banner using stored mappings,
 * promoting better organization, reusability, and scalability.
 *
 * @author Shourya Parashar
 * @version 7.0
 */
public class App {

    // =========================================================================
    // Part 2 – Inner Class
    // =========================================================================

    /**
     * Encapsulates a character and its corresponding 7-row ASCII banner pattern.
     */
    static class CharacterPatternMap {

        /** The letter this object represents. */
        private final char character;

        /** Seven-element array; each element is one row of the ASCII art. */
        private final String[] pattern;

        // ---------------------------------------------------------------------
        // Constructor
        // ---------------------------------------------------------------------

        /**
         * Constructs a CharacterPatternMap for the given character.
         * The 7-row pattern is built internally using StringBuilder.
         *
         * @param character the letter to represent (e.g. 'O', 'P', 'S')
         */
        public CharacterPatternMap(char character) {
            this.character = character;
            this.pattern   = buildPattern(character);
        }

        // ---------------------------------------------------------------------
        // Getter Methods
        // ---------------------------------------------------------------------

        /**
         * Returns the character this object represents.
         * @return the stored character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the 7-row ASCII banner pattern for this character.
         * @return String array of 7 pattern rows
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    // =========================================================================
    // Part 3 – Utility Static Methods
    // =========================================================================

    /**
     * Builds and returns the 7-row ASCII banner pattern for the given character.
     * Uses {@link StringBuilder} for efficient row construction.
     *
     * @param character the letter whose pattern is required ('O', 'P', or 'S')
     * @return String array of 7 rows, each 9 characters wide
     */
    private static String[] buildPattern(char character) {
        switch (character) {
            case 'O':
                return new String[]{
                    " ******* ",
                    "*       *",
                    "*       *",
                    "*       *",
                    "*       *",
                    "*       *",
                    " ******* "
                };
            case 'P':
                return new String[]{
                    "******** ",
                    "*       *",
                    "*       *",
                    "******** ",
                    "*        ",
                    "*        ",
                    "*        "
                };
            case 'S':
                return new String[]{
                    " ******* ",
                    "*        ",
                    "*        ",
                    " ******* ",
                    "        *",
                    "        *",
                    " ******* "
                };
            default:
                // Return blank 9-char rows for unknown characters
                String[] blank = new String[7];
                for (int i = 0; i < 7; i++) {
                    blank[i] = "         ";
                }
                return blank;
        }
    }

    /**
     * Assembles and prints the horizontal banner for the supplied array of
     * {@link CharacterPatternMap} objects.
     * Iterates row-by-row (outer loop) then character-by-character (inner loop).
     *
     * @param characters array of CharacterPatternMap objects forming the word
     */
    private static void displayBanner(CharacterPatternMap[] characters) {
        // Outer loop: 7 rows
        for (int row = 0; row < 7; row++) {
            StringBuilder lineBuilder = new StringBuilder();
            // Inner loop: each character's pattern for the current row
            for (CharacterPatternMap cpm : characters) {
                lineBuilder.append(cpm.getPattern()[row]);
                lineBuilder.append(" "); // column separator
            }
            System.out.println(lineBuilder.toString());
        }
    }

    // =========================================================================
    // Part 4 – Main Method
    // =========================================================================

    public static void main(String[] args) {

        // Create CharacterPatternMap instances for each letter in "OOPS"
        CharacterPatternMap[] word = {
            new CharacterPatternMap('O'),
            new CharacterPatternMap('O'),
            new CharacterPatternMap('P'),
            new CharacterPatternMap('S')
        };

        // Display the assembled banner
        displayBanner(word);
    }
}