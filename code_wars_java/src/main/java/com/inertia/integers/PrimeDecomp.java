package com.inertia.integers;

public class PrimeDecomp {

    public static String factors(int n) {
        // your code
        StringBuilder primes = new StringBuilder();
        int remaining = n;
        for (int i = 2; !isPrime(remaining); i++) {
            if (isPrime(i) && remaining % i == 0) {
                int count = 0;
                while (remaining != 1 && remaining % i == 0) {
                    count++;
                    remaining = remaining / i;
                }
                if (count > 1) {
                    primes.append("(" + i + "**" + count + ")");
                } else {
                    primes.append("(" + i + ")");
                }
            }
        }
        primes.append("(" + remaining + ")");
        return primes.toString();
    }

    private static boolean isPrime(int p) {
        if (p == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(p); i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }
}
