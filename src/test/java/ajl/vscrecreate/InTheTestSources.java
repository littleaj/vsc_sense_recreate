package ajl.vscrecreate;

import org.apache.commons.lang3.RandomUtils;

public class InTheTestSources {

    public static void main(String[] args) {
        if (ThisWorks.getSimplePowerSet() == null) {
            throw new RuntimeException("If this didn't work, it wouldn't compile");
        }
        System.out.println(RandomUtils.nextDouble());
    }

}