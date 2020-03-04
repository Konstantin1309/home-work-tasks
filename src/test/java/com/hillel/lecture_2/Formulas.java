package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/16/19
 */
public class Formulas {

    @Step
    public double calculate9Formula(double x) {
        double a = 1.1 * Math.pow(Math.E, -x);
        double b = Math.abs(Math.cos (Math.sqrt(Math.PI * x)));
        double result = (a + b) - (3 / 8);
//        TODO implement formula 9
        return result;

    }

    @Step
    public double calculate10Formula(double x) {
        // double result = 0.0;
        double a = Math.sqrt(Math.abs(Math.sin(x)));
        //double b = Math.pow()
//        TODO implement formula 10
        //return result;
        return a;
    }

    @Step
    public double calculate11Formula(double x) {
        double result = 0.0;
//        TODO implement formula 11
        return result;
    }

    @Step
    public double calculate12Formula(double x) {
        double result = 0.0;
//        TODO implement formula 12
        return result;
    }

    @Step
    public double calculate13Formula(double x) {
        double result = 0.0;
//        TODO implement formula 13
        return result;
    }
}
