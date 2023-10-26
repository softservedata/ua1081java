package com.softserve.Homework03.Task02;

public class Numbers {
    private int number1;
    private int number2;
    private int number3;

    public Numbers() {
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }

    public int getTheSmallestNumber() {
        int smaller;
        smaller = number1 < number2 ? number1 : number2;
        smaller = smaller < number3 ? smaller : number3;
        return smaller;
    }
}
