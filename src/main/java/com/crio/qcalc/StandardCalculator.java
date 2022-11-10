package com.crio.qcalc;

public class StandardCalculator {
    protected double result;
    // private int result1;
    public static void getVersion() {
        System.out.println("Standard Calculator 1.0");
    }


    //Overloading
    public final void add(int num1, int num2) {
        // result = (num1 + num2);
        // setResult(result);
         add((double) num1, (double) num2);
    }

    public final void add(double num1, double num2) throws ArithmeticException{
        double value = (num1 + num2);
        if ((value == Double.MAX_VALUE) || (value == Double.POSITIVE_INFINITY)) {
            throw new ArithmeticException("Double overflow");
        }
        //this.value=value
        setResult(value);
    }

    public final void subtract(int num1, int num2) {
        // result = (num1 - num2);
        // setResult(result);
         subtract((double) num1, (double) num2);
    }
    
public final void subtract(double num1, double num2) throws ArithmeticException{
    double value = (num1 - num2);
    if ((value == -Double.MAX_VALUE) || (value == Double.NEGATIVE_INFINITY)) {
        throw new ArithmeticException("Double overflow");
    }
    setResult(value);
    }

    public final void divide(int num1, int num2) {
        // result = (num1 / num2);
        // setResult(result);
         divide((double) num1, (double) num2);
    }

    public final void divide(double num1, double num2) {
        double value = (num1 / num2);
        if (num2 == 0.0) {
            throw new ArithmeticException("Divide By Zero");
        }
        setResult(value);

    }
    
    public final void multiply(int num1, int num2) {
        // result = (num1 * num2);
        // setResult(result);
         multiply((double) num1, (double) num2);

    }

    public final void multiply(double num1, double num2) {
        double value = (num1 * num2);
        if ((value == Double.MAX_VALUE) || (value == Double.NEGATIVE_INFINITY) || (value == Double.POSITIVE_INFINITY)) {
            throw new ArithmeticException("Double overflow");
        }
        setResult(value);
    }
    

     public double getResult() {
         return result;
    }

    public void setResult(int value) {

        // if (value != 0)

        //     return;



        this.result = value;

    }

    public void setResult(double value) {

        // if (value != 0)

        //     return;



        this.result = value;

    }

    public void clearResult() {

        result = 0;

    }
    
    public void printResult() {

        System.out.println("Standard Calculator Result:" + result);

    }


}
