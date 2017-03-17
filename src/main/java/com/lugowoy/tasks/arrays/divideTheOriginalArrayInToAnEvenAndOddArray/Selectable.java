package com.lugowoy.tasks.arrays.divideTheOriginalArrayInToAnEvenAndOddArray;

import java.util.ArrayList;
import java.util.List;

/** Created by Konstantin Lugowoy on 16.03.2017. */

public interface Selectable<T> {

    int STATUS_EVEN_NUMBERS = 1;
    int STATUS_ODD_NUMBERS = 0;

    T[] select(T[] t, int statusNumbers);

    static Integer[] selectableArray(Integer[] integers, int statusNumbers) {
        ArrayList<Integer> integerList = new ArrayList<>(0);
        if (integers != null) {
            if (statusNumbers == STATUS_EVEN_NUMBERS) {
                for (Integer integer : integers) {
                    if (integer != null) {
                        if (integer % 2 == 0) {
                            integerList.add(integer);
                        }
                    }
                }
            } else if (statusNumbers == STATUS_ODD_NUMBERS) {
                for (Integer integer : integers) {
                    if (integer != null) {
                        if (integer % 2 != 0) {
                            integerList.add(integer);
                        }
                    }
                }
            }
        }
        return integerList.toArray(new Integer[integerList.size()]);
    }
}