public class SnackDispenser {

    private BagInterface<Snack> snacks;

    /*
     * Constructor:
     * Creates an empty snack dispenser.
     */
    public SnackDispenser() {
        snacks = new ArrayBag<>();
    }

    /**
     * Adds a snack to the dispenser.
     * 
     * @param s The snack to be added.
     * @return True if the snack was added successfully, or false if not.
     */
    public boolean addSnack(Snack s) {
        return snacks.add(s); // Uses ArrayBag's add method to add the snack to the bag
    }

    /**
     * Removes a snack from the dispenser.
     * 
     * @return The removed snack if successful, or null if not.
     */

    public Snack removeSnack() {
        return snacks.remove(); // Uses ArrayBag's remove method to remove an unspecified snack from the bag
    }

    /**
     * Removes a specific snack from the dispenser.
     * @return True if the snack bag is empty, or false if not.
     */

    public boolean isEmpty()
    {
        return snacks.isEmpty();
    }

    /**
     * Counts the number of snacks in the dispenser that have a specific flavor.
     * 
     * @param flavor The flavor to be counted.
     * @return The number of snacks in the dispenser that have the specified flavor.
     */
    public int countFlavor(String flavor) {
        int flavorCount = 0;

        for (Object obj : snacks.toArray()) {
            Snack s = (Snack) obj; // Cast the object to a Snack
            if (s.getFlavor().equals(flavor)) { // Check if the snack's flavor matches the specified flavor
                flavorCount++; // Increment the count if it matches
            }
        }
        return flavorCount;
    }

    /**
     * Prints the name and flavor of all snacks currently in the dispenser.
     */
public void printAllSnacks() {
    System.out.println("========================================");
    System.out.println("            SNACK DISPENSER             ");
    System.out.println("========================================");

    Object[] array = snacks.toArray();

    if (array.length == 0) {
        System.out.println("No snacks in the dispenser.");
        System.out.println("========================================");
        return;
    }

    for (Object obj : array) {
        Snack s = (Snack) obj;
        System.out.printf(" %-20s  (%s)%n", s.getName(), s.getFlavor());
    }

    System.out.println("========================================");
}

}