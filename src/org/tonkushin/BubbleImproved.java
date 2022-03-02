package org.tonkushin;

import java.util.Arrays;

public class BubbleImproved implements Sort {
    int[] array;

    public BubbleImproved(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public int[] getArray() {
        return array;
    }

    @Override
    public void sort() {
        int n = array.length;

        boolean swapped;
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                return;
            }
        }
    }
}
