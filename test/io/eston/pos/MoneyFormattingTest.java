package io.eston.pos;

import org.junit.Assert;
import org.junit.Test;

public class MoneyFormattingTest {
    @Test
    public void formats0CentsCorrectly() {
        assertFormatting("$0.00", 0);
    }

    @Test
    public void formats1CentCorrectly() {
        assertFormatting("$0.01", 1);
    }

    @Test
    public void formats10CentsCorrectly() {
        assertFormatting("$0.10", 10);
    }

    @Test
    public void formats1DollarCorrectly() {
        assertFormatting("$1.00", 100);
    }

    @Test
    public void formatsArbitraryAmountOfCentsCorrectly() {
        assertFormatting("$47.39", 4739);
    }

    private static void assertFormatting(String expected, int cents) {
        Assert.assertEquals(expected, new Money(cents).asDisplayText());
    }

}
