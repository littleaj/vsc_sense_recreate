package ajl.vscrecreate;

import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class TheTestClass {

    @Before
    public void setUp() {
        System.out.println("BEFORE");
    }

    @After
    public void tearDown() {
        System.out.println("AFTER");
    }

    @Test
    public void theTest() throws Exception {
        Assert.assertNotNull(new Object());
        System.out.println("TEST");
        System.err.println("test");
    }
}