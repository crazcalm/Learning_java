package com.github.crazcalm.Primes;

/**
 * Created by marcuswillock on 5/21/15.
 */
public class CountPrimes {

    public static void main(String[] args){

        System.out.println(CountPrimes.countPrimes(499979));
    }

    public static int countPrimes(int n) {
        int count = 0;

        if(n == 1){
            count = 0;
        }
        else if(n == 2){
            count = 0;
        }
        else{
            for(int x=2; x < n; x++){
                if(CountPrimes.isPrime(x)){
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean isPrime(int n){
        boolean answer = true;

        for(int i=2; i<n; i++){
            if(n%i == 0){
                answer = false;
            }
        }

        return answer;
    }
}
