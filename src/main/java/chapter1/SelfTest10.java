/**
 * Prints a conversion table of inches to meters.
 */
class SelfTest10 {
    public static void main(String[] args) {
        double inches, meters;
        int counter = 0;

        for (inches = 1; inches <= 100; inches++) {
            meters = inches * 39.37;

            System.out.println(inches + " inches is " + meters + " meters.");

            counter++;

            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}