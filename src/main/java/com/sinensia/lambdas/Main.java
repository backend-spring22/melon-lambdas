package com.sinensia.lambdas;

import javax.xml.stream.util.StreamReaderDelegate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Melon> melons = Arrays.asList(
                new Melon("Gac", 5500, "Europe"),
                new Melon("Bailan", 6000, "China"),
                new Melon("Watermelon", 1200, "Europe"),
                new Melon("Gac", 3400, "US"),
                new Melon("Bailan", 1300, "China")
        );

        for (int i = 0; i < melons.size(); ++i) {
            System.out.println(melons.get(i).toString());
        }

    }

    private static List<Melon> filterByType(List<Melon> melons, String type ) {
        List<Melon> resFiltered = new ArrayList<>();
        for (Melon m: melons) {
            if (m.getCategory().equals(type)) {
                resFiltered.add(m);
            }
        }
        return resFiltered;
    }

    private static List<Melon> filterByCategory(List<Melon> melons, String type ) {
        return melons.stream()
                .filter(melon -> melon.getCategory().equals(type))
                .collect(Collectors.toList());
    }
}


// coleccion.filter(m => m.catergory === type)