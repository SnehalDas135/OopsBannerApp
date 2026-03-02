/**
 * OOPSBannerApp
 *
 * UC4: Store banner lines in a String array and
 *      print using a loop for better modularity.
 *
 * @author Snehal Das
 * @version 4.0
 */
public class uc4 {

    public static void main(String[] args) {

        String[] banner = {

            String.join("",
                    " *****  ", "  *****  ", "  *****  ", "  ***** "),

            String.join("",
                    "*     * ", " *     * ", " *     * ", " *     *"),

            String.join("",
                    "*     * ", " *     * ", " *     * ", " *      "),

            String.join("",
                    "*     * ", " *     * ", "  *****  ", "  ***** "),

            String.join("",
                    "*     * ", " *     * ", "       * ", "       *"),

            String.join("",
                    "*     * ", " *     * ", " *     * ", " *     *"),

            String.join("",
                    " *****  ", "  *****  ", "  *****  ", "  ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}