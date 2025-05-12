package Coding.StreamsPractice;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        var cleanedUpLife = Stream.of("laundry",
                        "debugging",
                        "existential crisis",
                        "exercise",
                        "doomscrolling",
                        "refactor spaghetti code",
                        "cry a little",
                        "eat cookies"
                ).filter(task -> !task.contains("doomscrolling") && !task.contains("cry"))
                .map(task -> task.equals("existential crisis") ? "deep philosophical pondering" : task)
                .map(String::toUpperCase)
                .map(task -> "✅ " + task)
                .collect(Collectors.joining("\n"));

        System.out.println("LIFE.OPTIMIZE():\n" + cleanedUpLife);
    }
}
