package Logistik;

import java.util.Collection;
import java.util.stream.Collectors;

public class StringFilter {
    public static Collection<String> filterTripleAWithStream(Collection<String> strings) {
        if (strings == null) {
            throw new IllegalArgumentException("Collection cannot be null");
        }

        return strings.stream()
                .filter(str -> !str.startsWith("aaa")) // Оставляем строки, которые НЕ начинаются на "aaa"
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Collection<String> strings = new java.util.ArrayList<>();
        strings.add("aaaStart");
        strings.add("bbbMiddle");
        strings.add("aaaEnd");
        strings.add("cccFinal");

        //System.out.println("Before filtering: " + strings);

        Collection<String> filteredStrings = filterTripleAWithStream(strings);

        System.out.println("After filtering (immutable): " + filteredStrings);
    }
}

