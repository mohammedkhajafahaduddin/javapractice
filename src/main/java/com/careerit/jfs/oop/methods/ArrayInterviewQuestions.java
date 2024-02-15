package com.careerit.jfs.oop.methods;

public class ArrayInterviewQuestions {


    public static int[] getPrimeNumbers(int[] arr) {
        int count = 0;
        count = getPrimeCount(arr, count);
        int[] primeArr = new int[count];
        int index = 0;
        for (int ele : arr) {
            if (isPrime(ele)) {
                primeArr[index++] = ele;
            }
        }
        return primeArr;
    }

    public static int getPrimeCount(int[] arr, int count) {
        for (int ele : arr) {
            if (isPrime(ele)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getSumOfArray(int[] arr) {
        int sum = 0;
        for (int ele : arr) {
            sum += ele;
        }
        return sum;
    }
    public static int gcdOfTwoNumbers(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdOfTwoNumbers(b, a % b);
    }

    // create method to find biggest of three numbers
    public static int biggestOfThree(int a, int b, int c) {
        return a > b && a > c ? a : Math.max(b, c);
    }

    // Create method to find the smallest of three numbers
    public static int smallestOfThree(int a, int b, int c) {
        return a < b && a < c ? a : Math.min(b, c);
    }



}
