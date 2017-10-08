package SortingTask;

public abstract class Sort {
    int[] array;

    public Sort(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public abstract int[] sort();
}
