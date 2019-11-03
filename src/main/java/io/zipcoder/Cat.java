package io.zipcoder;

public class Cat extends Pets implements Comparable {

    public Cat(String name, String type) {
        super(name, type);
    }

    public String speak(){return "meow.";}

    public int compareTo(Object o) {
        return 0;
    }
}
