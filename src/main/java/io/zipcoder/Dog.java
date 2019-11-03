package io.zipcoder;

import java.util.Comparator;

public class Dog extends Pets implements Comparable<Pets> {
    public Dog(String name, String type) {
        super(name, type);
    }

    public String speak(){return "woof.";}

    public int compareTo(Pets o) {
        return 0;
    }
}
