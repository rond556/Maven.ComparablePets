package comparators;

import io.zipcoder.Pets;

import java.util.Comparator;

public class TypeComparator implements Comparator<Pets> {

    public int compare(Pets o1, Pets o2) {
        if(o1.getType().compareTo(o2.getType()) > 0){
            return 1;
        } else if (o1.getType().compareTo(o2.getType()) < 0){
            return -1;
        } else {
            return 0;
        }
    }
}
