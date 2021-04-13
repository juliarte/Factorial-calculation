package com.javarush.factorialCalculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/*
Factorial
1. The program must read data from the keyboard.
2. The program should display the factorial of the entered number.
3. The factorial method must return a string representation of the factorial of the number passed to it as a parameter.
4. The factorial method must take one parameter of type int.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        if (n < 0) {
            return Integer.toString(0);
        } else {
            BigInteger result = BigInteger.ONE;
            for (int i = 1; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result.toString();
        }
    }
}
