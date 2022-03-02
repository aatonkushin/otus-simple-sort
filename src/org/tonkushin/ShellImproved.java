package org.tonkushin;

import java.util.Arrays;

public class ShellImproved implements Sort {
    int[] array;

    public ShellImproved(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    @Override
    public void sort() {
        int k = 1;
        for (int gap = array.length / 2; gap > 0; gap = calcGap(++k)) {
            for (int i = 0; i + gap < array.length; i++) {
                int j = i + gap;
                int tmp = array[j];

                while (j - gap > 0 && array[j - gap] > tmp) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = tmp;
            }
        }

        // Последний раз проходим сортировкой вставками
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                swap(j - 1, j);
                j--;
            }
        }
    }

    private int calcGap(int k) {
        return (int) (2 * (this.array.length / Math.pow(2, k + 1)) + 1) - 1;
    }

    @Override
    public int[] getArray() {
        return array;
    }
}
