package HomeWork11;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Собака", "Корова", "Слон", "Ежик", "Лиса", "Лиса", "Жук", "Лось", "Жук", "Собака"};

        // Task 1
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        // task 1
        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        // task 2
        Phonebook pb = new Phonebook();

        pb.add("Ivanov", "123");
        pb.add("Petrov", "456");
        pb.add("Petrov", "789");

        System.out.println(pb.get("Petrov"));
    }
}