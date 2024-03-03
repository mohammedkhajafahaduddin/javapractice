package com.careerit.jfs.collections;

import java.util.ArrayList;
import java.util.List;

public class AssignmentQuestionWithList {

    List<Integer> list = getRandomNumbers(20, 10, 50);

    public List<Integer> getAllEvenNumbers(){
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : list) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }
    public List<Integer> getAllNumbersDivisibleBy(int num){
        List<Integer> divisibleNumbers = new ArrayList<>();
        for (int n : list) {
            if (n % num == 0) {
                divisibleNumbers.add(n);
            }
        }
        return divisibleNumbers;
    }
    public List<Integer> getAllNumbersDivisibleBy(int num1,int num2){
        List<Integer> divisibleNumbers = new ArrayList<>();
        for (int n : list) {
            if (n % num1 == 0 && n % num2 == 0) {
                divisibleNumbers.add(n);
            }
        }
        return divisibleNumbers;
    }
    public List<Integer> getEvenNumberByDoublingTheValue(){
        List<Integer> evenNumbersDoubled = new ArrayList<>();
        for (int num : list) {
            if (num % 2 == 0) {
                evenNumbersDoubled.add(num * 2);
            }
        }
        return evenNumbersDoubled;
    }
    public List<Integer> getEvenNumbersBetween(int lb,int ub){
        List<Integer> evenNumbersBetween = new ArrayList<>();
        for (int num : list) {
            if (num >= lb && num <= ub && num % 2 == 0) {
                evenNumbersBetween.add(num);
            }
        }
        return evenNumbersBetween;
    }
    public List<Integer> getRandomNumbers(int n, int lb, int ub) {
        List<Integer> list = new ArrayList<>();
        while (list.size() != n) {
            int num = (int) (Math.random() * (ub - lb + 1) + lb);
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        return list;
    }



    public static void main(String[] args) {
        var q = new AssignmentQuestionWithList();
        System.out.println("All Even Numbers: " + q.getAllEvenNumbers());
        System.out.println("All Numbers Divisible by 5: " + q.getAllNumbersDivisibleBy(5));
        System.out.println("All Numbers Divisible by 3 and 4: " + q.getAllNumbersDivisibleBy(3, 4));
        System.out.println("Even Numbers Doubled: " + q.getEvenNumberByDoublingTheValue());
        System.out.println("Even Numbers Between 20 and 40: " + q.getEvenNumbersBetween(20, 40));
        System.out.println("Random Numbers list of size 10 Between 1 and 100 " + q.getRandomNumbers(10,1,100));
    }
}
