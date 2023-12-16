package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        strings.add("mango");
        strings.add("watermelon");

        // Запрос 1: Фильтрация строк по длине больше 5
        List<String> filteredStrings = strings.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
        System.out.println("Filtered Strings: " + filteredStrings);

        // Запрос 2: Преобразование всех строк в верхний регистр
        List<String> upperCaseStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Upper Case Strings: " + upperCaseStrings);

        // Запрос 3: Сортировка строк по алфавиту
        List<String> sortedStrings = strings.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted Strings: " + sortedStrings);

        // Запрос 4: Поиск первой строки, начинающейся с "a"
        String firstStringStartingWithA = strings.stream()
                .filter(s -> s.startsWith("a"))
                .findFirst()
                .orElse("No string found");
        System.out.println("First String Starting With A: " + firstStringStartingWithA);

        // Запрос 5: Проверка, содержит ли коллекция хотя бы одну строку, равную "apple"
        boolean containsApple = strings.stream()
                .anyMatch(s -> s.equals("apple"));
        System.out.println("Contains Apple: " + containsApple);
    }
}