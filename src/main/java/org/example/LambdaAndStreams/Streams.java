package org.example.LambdaAndStreams;

import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        // normal for each loop
        for (int num: numbers) {
            System.out.print(num + " ");
        }

        // Streams way - forEach() is a terminal operation
        numbers.stream().forEach(num -> System.out.print(num + " "));

        // Method reference :-
        numbers.stream().forEach(System.out::print);    // same as above except the spacing (" ")


        // Intermediate operations - map, filter, etc. return "Stream" and are not a terminal operations
        numbers.stream().map(num -> num * num).forEach(squared -> System.out.println(squared + " "));
        numbers.stream().filter(num -> num % 2 == 0).forEach(evenNum -> System.out.println(evenNum + " "));

        // instead of printing filtered list store it
        List<Integer> filteredList = numbers
                .stream()
                .filter(num -> num % 2 == 0)
                .toList();

        System.out.println("filteredList: " + filteredList);


        // Reducer :-
        int totalSum = numbers.stream().reduce(0, (num, currSum) -> num + currSum);
        System.out.println("totalSum of numbers: " + totalSum);

    }
}
