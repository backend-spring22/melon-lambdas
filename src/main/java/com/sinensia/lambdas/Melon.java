package com.sinensia.lambdas;

import java.util.Objects;

public class Melon {
    private final String category;
    private final int weight;
    private final String origin;


    public Melon(String category, int weight, String origin) {
        this.category = category;
        this.weight = weight;
        this.origin = origin;
    }

    public String getCategory() {
        return category;
    }

    public int getWeight() {
        return weight;
    }

    public String getOrigin() {
        return origin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Melon)) return false;
        Melon melon = (Melon) o;
        return getWeight() == melon.getWeight() && getCategory().equals(melon.getCategory()) && getOrigin().equals(melon.getOrigin());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCategory(), getWeight(), getOrigin());
    }

    @Override
    public String toString() {
        return "Melon{" +
                "category='" + category + '\'' +
                ", weight=" + weight +
                ", origin='" + origin + '\'' +
                '}';
    }
}
