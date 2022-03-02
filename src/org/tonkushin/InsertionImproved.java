package org.tonkushin;

import java.util.Arrays;

public class InsertionImproved implements Sort {
    int[] array;

    public InsertionImproved(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    @Override
    public void sort() {
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];
            int pos = i;

            while (pos > 0 && array[pos - 1] > currentValue) {
                array[pos] = array[pos - 1];
                pos--;
            }

            array[pos] = currentValue;
        }
    }

    @Override
    public int[] getArray() {
        return array;
    }
}
