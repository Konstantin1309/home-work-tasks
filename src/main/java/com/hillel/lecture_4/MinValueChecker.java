package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class MinValueChecker {

    @Step
    public int getValue(int[] values) {

//        TODO implements result
        int min = values[5];

        for (int number : values) {
            if ( number <  min) {
                min = number;

            }
        }
        return min;

    }


}
