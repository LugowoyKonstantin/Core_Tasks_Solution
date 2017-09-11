package com.lugowoy.tasks.core.determineWhatIsEnteredCharacter;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 11.09.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter symbol : ");
        char symbol = enterSymbol();

        if (Character.isDigit(symbol)) {
            System.out.println("Entered symbol is number.");
        } else if (Character.isLetter(symbol)) {
            System.out.println("Entered symbol is letter");
        } else if (",.:!\"'".indexOf(symbol) > -1){
            System.out.println("Entered symbol is punctuation mark.");
        }

    }

    private static char enterSymbol() {
        String enterValue;
        while (true) {
            enterValue = READER.readString();
            if (enterValue.length() == 1) {
                break;
            } else {
                System.out.println("Incorrect enter symbol. Re-enter : ");
            }
        }
        return enterValue.charAt(0);
    }

}
