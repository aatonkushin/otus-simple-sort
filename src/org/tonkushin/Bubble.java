package org.tonkushin;

import java.util.Arrays;

public class Bubble implements Sort {
    int[] array;

    public Bubble(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public int[] getArray() {
        return array;
    }

    @Override
    public void sort() {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }
}
