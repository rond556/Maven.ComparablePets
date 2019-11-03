package comparators;

import io.zipcoder.Pets;

import java.util.Comparator;

public class NameComparator implements Comparator<Pets> {

    public int compare(Pets o1, Pets o2) {
        if(o1.getName().compareTo(o2.getName()) > 0){
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) < 0){
            return -1;
        } else {
            return 0;
        }
    }
}
