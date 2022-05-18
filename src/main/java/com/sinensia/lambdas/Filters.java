package com.sinensia.lambdas;

import java.util.ArrayList;
import java.util.List;

public final class  Filters {
    public Filters() {
        throw new AssertionError("Utility class can not be instantiated");
    }

    public static List<Melon> filterByType(List<Melon> melons, String type) {
        if(melons == null || type ==null) {
            throw new IllegalArgumentException("Melons/type cannot be null");
        }
        if(melons.isEmpty()) {
            return melons;
        }
        List<Melon> result = new ArrayList<>();
        for(Melon melon : melons) {
            if(melon!=null && type.equalsIgnoreCase(melon.getType())) {
                result.add(melon);
            }
        }
        return result;
    }

    public static List<Melon> filterByWeight(List<Melon> melons, int weight) {
        if (melons == null) {
            throw new IllegalArgumentException("Melons cannot be null");
        }

        if (melons.isEmpty() || weight <= 0) {
            return melons;
        }

        List<Melon> result = new ArrayList<>();
        for (Melon melon : melons) {
            if (melon != null && melon.getWeight() == weight) {
                result.add(melon);
            }
        }

        return result;
    }
}
