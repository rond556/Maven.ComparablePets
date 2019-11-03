package io.zipcoder;

public class Goldfish extends Pets implements Comparable<Pets> {

    public Goldfish(String name, String type) {
        super(name, type);
    }

    public String speak(){return "glub.";}

    public int compareTo(Pets o) {
        return 0;
    }
}
