/*
    Demo program to simply test out the SnackDispesner class in java.
*/

public class SnackDispenserDemo {
    public static void main(String[] args) {

        /*
         * Create a variable that references SnackDispenser
         * this variable can now use SnackDispenser methods.
         */

        SnackDispenser dispenser = new SnackDispenser();

        /*
         * Add snacks to the dispenser using the addSnack method.
         * Each call creates a new Snack object and adds it to the SnackDispenser.
         * The addSnack method accepts Snack objects, which the dispenser stores.
         */

        dispenser.addSnack(new Snack("Chips", "Salty"));
        dispenser.addSnack(new Snack("Chocolate Bar", "Sweet"));
        dispenser.addSnack(new Snack("Gummy Bears", "Fruity"));
        dispenser.addSnack(new Snack("Pretzels", "Salty"));
        dispenser.addSnack(new Snack("Lollipop", "Sweet"));
        dispenser.addSnack(new Snack("Fruit Snacks", "Fruity"));

        /*
         * Print out all Snacks in our dispesner
         */

        dispenser.printAllSnacks();

        /*
         * We will pass in a flavor and then count how many Snacks with that
         * flavor exist in our Snack Dispenser
         */

        int count = dispenser.countFlavor("Sweet");
        System.out.println("Number of Sweet snacks: " + count);
        count = dispenser.countFlavor("Salty");
        System.out.println("Number of Salty snacks: " + count);

        /*
         * We will now test our delete method, we will remove a snack until there are
         * none left
         */

        while (!dispenser.isEmpty()) {
            Snack snack = dispenser.removeSnack();
            System.out.println(snack.getName() + " has been removed!");
        }

        /*
         * Now lets check if our bag is truly empty.
         */

        boolean isEmpty = dispenser.isEmpty();

        if (isEmpty)
            System.out.println("Your bag is cleared");
        else
            System.out.println("Issue! Your bag is not cleared!");
    }
}
