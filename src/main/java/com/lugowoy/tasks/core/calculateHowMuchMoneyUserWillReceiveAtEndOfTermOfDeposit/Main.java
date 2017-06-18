package com.lugowoy.tasks.core.calculateHowMuchMoneyUserWillReceiveAtEndOfTermOfDeposit;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 17.06.2017. */

public class Main {

    private static final ReadingData<Double> READING_DATA = new ReadingData<>(new ReadingUserInputData()::readDouble);

    public static void main(String[] args) {

        BigDecimal depositSumInUAH = new BigDecimal(getSum());
        BigDecimal rate = new BigDecimal(getRate());
        int termOfDepositInMonth = getTermOfDepositInMonths();

        rate = new BigDecimal((rate.doubleValue() / 100.0) / 12 * termOfDepositInMonth);

        BigDecimal resultSum = new BigDecimal(depositSumInUAH.doubleValue() * rate.doubleValue() + depositSumInUAH.doubleValue());

        System.out.println("Result sum deposit after " + termOfDepositInMonth + " month is equal " + resultSum.setScale(2, BigDecimal.ROUND_DOWN));

    }

    private static double getSum() {
        System.out.println("Enter deposit sum in UAH : ");
        double sum;
        while (true) {
            sum = READING_DATA.read();
            if (sum > 0) {
                break;
            } else {
                System.out.println("Deposit sum must be a positive number.");
                System.out.println("Re-enter : ");
            }
        }
        return sum;

    }

    private static double getRate() {
        System.out.println("Enter interest rate : ");
        double rate;
        while (true) {
            rate = READING_DATA.read();
            if ((rate >= 0) && (rate <= 100)) {
                break;
            } else {
                System.out.println("Interest rate must be a positive number.");
                System.out.println("Re-enter : ");
            }
        }
        return rate;

    }

    private static int getTermOfDepositInMonths() {
        System.out.println("Enter term of deposit in month : ");
        int term;
        while (true) {
            term = READING_DATA.read().intValue();
            if (term > 0) {
                break;
            } else {
                System.out.println("Term of deposit in month must be a positive number.");
                System.out.println("Re-enter : ");
            }
        }
        return term;

    }

}