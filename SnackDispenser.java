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

    public int countFlavor(String flavor) {
        int flavorCount = 0;

        for (Object obj : snacks.toArray()) {
            Snack snack = (Snack) obj; // Cast the object to a Snack
            if (snack.getFlavor().equals(flavor)) { // Check if the snack's flavor matches the specified flavor
                flavorCount++; // Increment the count if it matches
            }
        }
        return flavorCount;
    }

    public void printAllSnacks() {
        // Will implement this later
    }

}