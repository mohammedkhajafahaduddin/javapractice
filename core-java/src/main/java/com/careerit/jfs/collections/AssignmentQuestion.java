package com.careerit.jfs.collections;

import java.util.*;
import java.util.stream.Stream;

public class AssignmentQuestion {

    public static void main(String[] args) {
        List<Integer> list = getRandomNumbers(10, 10, 50);
        System.out.println(list);
        List<String> list1 = List.of("Krish", "Manoj", "John", "Smith", "Krish");
        List<String> list2 = List.of("Krish", "Charan", "Haadya", "Suma");
        List<String> duplicateNames = getDuplicateNames(list1, list2);
        System.out.println(duplicateNames);
        List<String> uniqueNames = getUniqueNames(list1, list2);
        System.out.println(uniqueNames);
    }


    // Generate the n random numbers in the range of lb and ub and store random number into list
    // Note: ensure that values in the list should not be repeated
    public static List<Integer> getRandomNumbers(int n,int lb,int ub){

        Set<Integer> uniqueNumbers = new HashSet<>();
        new Random().ints(n, lb, ub=ub+1).distinct().forEach((int e) -> {uniqueNumbers.add(e);});
        return new ArrayList<>(uniqueNumbers);

    }

    public static List<String> getDuplicateNames(List<String> list1, List<String> list2){
        Set<String> set1 = new HashSet<>(list1);
        Set<String> set2 = new HashSet<>(list2);
        Set<String> duplicateSet = new HashSet<>(set1);
        duplicateSet.retainAll(set2);
        return new ArrayList<>(duplicateSet);
    }

    public static List<String> getUniqueNames(List<String> list1, List<String> list2){
        List<String> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        Set<String> uniquenames = new HashSet<>(mergedList);
        return new ArrayList<>(uniquenames);
    }
}
