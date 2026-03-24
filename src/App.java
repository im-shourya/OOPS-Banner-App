import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp UC8 - Render OOPS as Banner using Map for Character Patterns
 *
 * This use case extends UC7 by replacing CharacterPatternMap class with
 * a HashMap data structure for efficient character pattern storage and retrieval.
 *
 * @author Shourya Parashar
 * @version 8.0
 */
public class App {

    // =========================================================================
    // Part 2 – Utility Static Methods for Map Initialization
    // =========================================================================

    /**
     * Builds and returns a HashMap linking characters to their 7-row ASCII patterns.
     * @return Map of Character to String array
     */
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        // Pattern for letter 'O'
        patternMap.put('O', new String[]{
            " ******* ",
            "*       *",
            "*       *",
            "*       *",
            "*       *",
            "*       *",
            " ******* "
        });

        // Pattern for letter 'P'
        patternMap.put('P', new String[]{
            "******** ",
            "*       *",
            "*       *",
            "******** ",
            "*        ",
            "*        ",
            "*        "
        });

        // Pattern for letter 'S'
        patternMap.put('S', new String[]{
            " ******* ",
            "*        ",
            "*        ",
            " ******* ",
            "        *",
            "        *",
            " ******* "
        });

        return patternMap;
    }

    /**
     * Renders a multi-character horizontal banner to the console.
     * Uses nested loops: outer iterates the 7 rows; inner retrieves each
     * character's pattern from the map and appends it to a StringBuilder.
     *
     * @param word       the word to display (e.g. "OOPS")
     * @param patternMap map of Character → 7-row pattern array
     */
    public static void displayBanner(String word, Map<Character, String[]> patternMap) {

        // Outer loop: iterate through each of the 7 banner rows
        for (int row = 0; row < 7; row++) {
            StringBuilder lineBuilder = new StringBuilder();

            // Inner loop: for every character in the word, look up its row
            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(c);
                if (pattern != null) {
                    lineBuilder.append(pattern[row]);
                    lineBuilder.append(" "); // column separator
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }

    // =========================================================================
    // Part 3 – Main Method
    // =========================================================================

    public static void main(String[] args) {

        // Build the character-to-pattern HashMap
        Map<Character, String[]> patternMap = buildPatternMap();

        // Render the banner for the word "OOPS"
        displayBanner("OOPS", patternMap);
    }
}