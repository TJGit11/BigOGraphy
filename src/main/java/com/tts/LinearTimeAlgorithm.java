package com.tts;

import java.math.BigInteger;

/**
 * Calculate the sum from 1 to N
 */

public class LinearTimeAlgorithm {
    /**
     * 0(n) Calculate tehs um from 1 to N via sum all the numbers
     */
    public BigInteger sumOfArithmeticSerie_via_add_all(Long n){
        BigInteger sum = BigInteger.valueOf(0);
        for (long i = 1; i <= n; i++) {
            sum = sum.add(BigInteger.valueOf(i));
        }
        return sum;
    }
}
