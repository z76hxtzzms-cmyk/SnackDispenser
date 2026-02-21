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
        // Will implement this later
        return 0;
    }

    public void printAllSnacks() {
        // Will implement this later
    }

}