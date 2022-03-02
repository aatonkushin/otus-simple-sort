package org.tonkushin;

import java.util.Arrays;

public class Shell implements Sort{
    int[] array;

    public Shell(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    @Override
    public void sort() {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
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

    @Override
    public int[] getArray() {
        return array;
    }
}
