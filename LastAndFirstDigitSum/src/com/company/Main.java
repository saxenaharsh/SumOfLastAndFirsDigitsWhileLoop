package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        sumFirstAndLastDigit(-10);



    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        if (number < 10) {
            return number + number;
        }
        int sum = 0;
        sum = number % 10;
        while (true) {
            number = number / 10;
            if (number < 10) {
                sum = sum + number;
                break;
            }
        }
        return sum;

    }
}
