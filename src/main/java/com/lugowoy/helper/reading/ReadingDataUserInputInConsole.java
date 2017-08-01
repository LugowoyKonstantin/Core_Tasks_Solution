package com.lugowoy.helper.reading;

import com.lugowoy.helper.reading.readable.ReadableCorrect;

import java.util.Scanner;

/**
 * Created by Konstantin Lugowoy on 25.07.2017.
 *
 * */

public class ReadingDataUserInputInConsole extends ReadingDataUserInput {

    private static final Scanner SCANNER = new Scanner(System.in);


    @Override
    public byte readByte() {
        return this.getCorrectByteNumberValue(ReadableCorrect::isByteNumber);
    }

    private byte getCorrectByteNumberValue(ReadableCorrect readableCorrect) {
        byte resultByteInputValue;

        System.out.println("Enter the number : ");
        String inputValue = SCANNER.nextLine();

        if (readableCorrect.isCorrect(inputValue)) {
            resultByteInputValue = Byte.parseByte(inputValue);
        } else {
            System.out.println("Incorrect data entered.");
            resultByteInputValue = this.getCorrectByteNumberValue(readableCorrect);
        }
        return resultByteInputValue;

    }

    @Override
    public short readShort() {
        return this.getCorrectShortNumberValue(ReadableCorrect::isShortNumber);
    }

    private short getCorrectShortNumberValue(ReadableCorrect readableCorrect) {
        short resultShortInputValue;

        System.out.println("Enter the number : ");
        String inputValue = SCANNER.nextLine();

        if (readableCorrect.isCorrect(inputValue)) {
            resultShortInputValue = Short.parseShort(inputValue);
        } else {
            System.out.println("Incorrect data entered.");
            resultShortInputValue = this.getCorrectByteNumberValue(readableCorrect);
        }
        return resultShortInputValue;

    }

    @Override
    public int readInt() {
        return this.getCorrectIntNumberValue(ReadableCorrect::isIntegerNumber);
    }

    /*
    * The method that performs the necessary checks on the correctness of the entered data and returns the correct result.
    * */
    private int getCorrectIntNumberValue(ReadableCorrect readableCorrect) {
        int resultIntInputValue; //Variable for save and return correct inputValue.

        System.out.println("Enter the integer number : ");
        String inputValue = SCANNER.nextLine();//The variable takes on a inputValue that the user entered into the console.

        //Checking with regular expressions that the entered string is indeed a number with or without a sign.
        if (readableCorrect.isCorrect(inputValue)) {
            //If the checks were successful, then allocating the string representation of the integer number is assigned
            // to the variable that returns this inputValue from the method.
            resultIntInputValue = Integer.parseInt(inputValue);
        } else {
            //If during the scan of the entered line it is determined that this is not an integer number,
            // then a corresponding message is displayed about incorrect data entry and by recursion please repeat the input.
            System.out.println("Incorrect data entered.");
            resultIntInputValue = this.getCorrectIntNumberValue(readableCorrect);
        }
        return resultIntInputValue;

    }

    @Override
    public long readLong() {
        return this.getCorrectLongNumberValue(ReadableCorrect::isLongNumber);
    }

    private long getCorrectLongNumberValue(ReadableCorrect readableCorrect) {
        long resultLongInputValue;

        System.out.println("Enter the number : ");
        String inputValue = SCANNER.nextLine();

        if (readableCorrect.isCorrect(inputValue)) {
            resultLongInputValue = Long.parseLong(inputValue);
        } else {
            System.out.println("Incorrect data entered.");
            resultLongInputValue = this.getCorrectLongNumberValue(readableCorrect);
        }
        return resultLongInputValue;

    }

    @Override
    public float readFloat() {
        return this.getCorrectFloatNumberValue(ReadableCorrect::isFloatNumber);
    }

    private float getCorrectFloatNumberValue(ReadableCorrect readableCorrect) {
        float resultFloatInputValue;

        System.out.println("Enter the number : ");
        String inputValue = SCANNER.nextLine();

        if (readableCorrect.isCorrect(inputValue)) {
            resultFloatInputValue = Float.parseFloat(inputValue);
        } else {
            System.out.println("Incorrect data entered.");
            resultFloatInputValue = this.getCorrectFloatNumberValue(readableCorrect);
        }
        return resultFloatInputValue;

    }

    @Override
    public double readDouble() {
        return this.getCorrectDoubleNumberValue(ReadableCorrect::isDoubleNumber);
    }

    /*
    * The method that performs the necessary checks on the correctness of the entered data and returns the correct result.
    * */
    private double getCorrectDoubleNumberValue(ReadableCorrect readableCorrect) {
        double resultDoubleInputValue;//Variable for save and return correct resultDoubleInputValue.

        System.out.println("Enter the real number : ");
        String inputValue = SCANNER.nextLine();//The variable takes on a resultDoubleInputValue that the user entered into the console.

        //Checking with regular expressions that the entered string is indeed a number with or without a sign.
        if (readableCorrect.isCorrect(inputValue)) {
            //If the checks were successful, then allocating the string representation of the real double number is assigned
            // to the variable that returns this resultDoubleInputValue from the method.
            resultDoubleInputValue = Double.parseDouble(inputValue);
        } else {
            //If during the scan of the entered line it is determined that this is not an real double number,
            // then a corresponding message is displayed about incorrect data entry and by recursion please repeat the input.
            System.out.println("Incorrect data entered.");
            resultDoubleInputValue = this.getCorrectDoubleNumberValue(readableCorrect);
        }
        return resultDoubleInputValue;

    }

    @Override
    public String readString() {
        String value = "";
        System.out.println("Enter string value : ");
        if (SCANNER.hasNextLine()) {
            value = SCANNER.nextLine();
        }
        return value;
    }

}
