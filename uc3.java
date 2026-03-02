/**
 * OOPSBannerApp
 *
 * UC3: Refactor banner creation using String.join()
 *      instead of string concatenation for better memory efficiency.
 *
 * @author Snehal Das
 * @version 3.0
 */
public class uc3 {

    public static void main(String[] args) {

        System.out.println(String.join("",
                " *****  ", "  *****  ", "  *****  ", "  ***** "));

        System.out.println(String.join("",
                "*     * ", " *     * ", " *     * ", " *     *"));

        System.out.println(String.join("",
                "*     * ", " *     * ", " *     * ", " *      "));

        System.out.println(String.join("",
                "*     * ", " *     * ", "  *****  ", "  ***** "));

        System.out.println(String.join("",
                "*     * ", " *     * ", "       * ", "       *"));

        System.out.println(String.join("",
                "*     * ", " *     * ", " *     * ", " *     *"));

        System.out.println(String.join("",
                " *****  ", "  *****  ", "  *****  ", "  ***** "));
    }
}
