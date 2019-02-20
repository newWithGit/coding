package java8;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Predicate;

public class PredicateTest {

    @Test
    public void predcate_01() {
        Predicate<String> p1 = String::isEmpty;
        //Predicate<String> p1 = s -> { return s.isEmpty(); };
        Predicate<String> negate = p1.negate();

        Assert.assertFalse(negate.test(""));
        Assert.assertTrue(negate.test("Not empty"));
    }
}
