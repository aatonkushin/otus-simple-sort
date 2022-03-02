package org.tonkushin;

public interface Sort {
    /**
     * Сортирует массив
     */
    void sort();

    /**
     * Возвращает массив
     * @return массив
     */
    int[] getArray();

    /**
     * Меняет элементы местами
     * @param a первый элемент
     * @param b второй элемент
     */
    default void swap(int a, int b) {
        int x = getArray()[a];
        getArray()[a] = getArray()[b];
        getArray()[b] = x;
    }

    /**
     * Проверяет отсортированный массив
     * @return CHECK OK - если массив отсортирован по возрастанию, иначе - CHECK FAILED
     */
    default String checkSortedArray() {
        for (int i = 1; i < getArray().length; i++) {
            if (getArray()[i] < getArray()[i - 1]) {
                return "CHECK FAILED";
            }
        }

        return "CHECK OK";
    }
}
