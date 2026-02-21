/*
    We stated earlier we would not be working with the ArrayBag implementation yet 
    but we will just implement it for now to see if our code works. We will explain
    how ArrayBag works soon.
*/
public final class ArrayBag<T> implements BagInterface<T> {

    private final T[] bag;
    private int numberOfEntries;
    private boolean integrityOK = false;
    private static final int DEFAULT_CAPACITY = 25;
    private static final int MAX_CAPACITY = 10000;

    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayBag(int desiredCapacity) {
        if (desiredCapacity <= MAX_CAPACITY) {
            @SuppressWarnings("unchecked")
            T[] tempBag = (T[]) new Object[desiredCapacity];
            bag = tempBag;
            numberOfEntries = 0;
            integrityOK = true;
        } else {
            throw new IllegalStateException(
                    "Attempt to create a bag whose capacity exceeds allowed maximum of " + MAX_CAPACITY);
        }
    }

    public int getCurrentSize() {
        return numberOfEntries;
    }

    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    public boolean add(T newEntry) {
        checkIntegrity();
        boolean result = true;
        if (isFull()) {
            result = false;
        } else {
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
        }
        return result;
    }

    public T remove() {
        checkIntegrity();
        T result = removeEntry(numberOfEntries - 1);
        return result;
    }

    public boolean remove(T anEntry) {
        checkIntegrity();
        int index = getIndexOf(anEntry);
        T result = removeEntry(index);
        return anEntry.equals(result);
    }

    public void clear() {
        while (!isEmpty()) {
            remove();
        }
    }

    public int getFrequencyOf(T anEntry) {
        checkIntegrity();
        int frequency = 0;
        for (int index = 0; index < numberOfEntries; index++) {
            if (anEntry.equals(bag[index])) {
                frequency++;
            }
        }
        return frequency;
    }

    public boolean contains(T anEntry) {
        checkIntegrity();
        return getIndexOf(anEntry) > -1;
    }

    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[numberOfEntries];
        for (int i = 0; i < numberOfEntries; i++) {
            result[i] = bag[i];
        }
        return result;
    }

    private boolean isFull() {
        return numberOfEntries == bag.length;
    }

    private void checkIntegrity() {
        if (!integrityOK) {
            throw new SecurityException("ArrayBag object is corrupt.");
        }
    }

    private int getIndexOf(T anEntry) {
        int where = -1;
        boolean found = false;
        int index = 0;

        while (!found && (index < numberOfEntries)) {
            if (anEntry.equals(bag[index])) {
                found = true;
                where = index;
            }
            index++;
        }

        return where;
    }

    private T removeEntry(int givenIndex) {
        T result = null;

        if (!isEmpty() && (givenIndex >= 0)) {
            result = bag[givenIndex];
            bag[givenIndex] = bag[numberOfEntries - 1];
            bag[numberOfEntries - 1] = null;
            numberOfEntries--;
        }

        return result;
    }
}
