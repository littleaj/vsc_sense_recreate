package ajl.vscrecreate;

import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.Sets;

public class ThisWorks {
    public static Set<Set<Integer>> getSimplePowerSet() {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        
        return Sets.powerSet(set);
    }
}