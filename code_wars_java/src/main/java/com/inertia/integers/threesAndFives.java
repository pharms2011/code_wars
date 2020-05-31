package com.inertia.integers;

// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
// Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

public class threesAndFives {
    public int solution(int number) {
        //TODO: Code stuff here
        int sum = 0;
        for(int i =3; i<number; i+=3){
            System.out.println(i);
            sum+=i;
        }
        for(int i =5; i<number; i+=5){
            System.out.println(i);
            if(i%15!=0){
                sum+=i;
            }
        }
        return sum;
    }
}
