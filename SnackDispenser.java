public class SnackDispenser {

    private BagInterface<Snack> snacks;

    public SnackDispenser() {
        snacks = new ArrayBag<>();
    }

    public boolean addSnack(Snack s) {
        return snacks.add(s);
    }

    public Snack removeSnack() {
        return snacks.remove();

    }

    public int countFlavor(String flavor) {
        // Will implement this later
        return 0;
    }

    public void printAllSnacks()
    {
        // Will implement this later
    }

}