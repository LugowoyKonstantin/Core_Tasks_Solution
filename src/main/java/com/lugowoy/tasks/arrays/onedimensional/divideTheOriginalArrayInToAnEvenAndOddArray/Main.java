package com.lugowoy.tasks.arrays.onedimensional.divideTheOriginalArrayInToAnEvenAndOddArray;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

/** Created by Konstantin Lugowoy on 16.03.2017. */

public class Main {

    private static FillingArray<Integer> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);
    private static CreatorArray<Integer> creator = new CreatorArrayOfIntegerPrimitives();

    public static void main(String[] args) {

        int sizeArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray();

        Array<Integer> originalArray = creator.create(fillArray.fillArray(new int[sizeArray], 200));

        System.out.println("Original array : " + originalArray);
        System.out.println();

        Selectable<Array<Integer>> selectable = Selectable::selectableArray;

        Array<Integer> evenNumbersArray = selectable.select(originalArray, Selectable.STATUS_EVEN_NUMBERS);
        Array<Integer> oddNumbersArray = selectable.select(originalArray, Selectable.STATUS_ODD_NUMBERS);

        System.out.println("Even number array created based on the original array : ");
        System.out.println(evenNumbersArray);
        System.out.println();

        System.out.println("Odd number array created based on the original array : ");
        System.out.println(oddNumbersArray);
        System.out.println();

    }

}