package org.tonkushin;

import java.util.Arrays;

public class Insertion implements Sort {
    int[] array;

    public Insertion(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    @Override
    public void sort() {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                swap(j - 1, j);
                j--;
            }
        }
    }

    @Override
    public int[] getArray() {
        return array;
    }
}
