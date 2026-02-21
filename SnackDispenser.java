public class SnackDispenser {

    private BagInterface<Snack> snacks;

    public SnackDispenser() {
        snacks = new ArrayBag<>();
    }

    public boolean addSnack(Snack s) {
        return snacks.add();
    }

    public Snack removeSnack() {
        return snacks.remove();

    }

    public int countFlavor(String flavor) {
        // Will implement this later
    }

    public void printAllSnacks()
    {
        // Will implement this later
    }

}