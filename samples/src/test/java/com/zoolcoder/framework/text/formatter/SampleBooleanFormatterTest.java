package com.zoolcoder.framework.text.formatter;

import com.zoolcoder.framework.text.formatter.samples.SampleBooleanFormatter;
import com.zoolcoder.framework.text.formatter.exception.ParserException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleBooleanFormatterTest {

    private SampleBooleanFormatter booleanDecorator = new SampleBooleanFormatter();

    @Test
    public void testIgnoreCase() throws ParserException {
        Assertions.assertTrue(booleanDecorator.parse("1"));
        Assertions.assertFalse(booleanDecorator.parse("0"));
    }

    @Test
    public void testSpaceCase() throws ParserException {
        Assertions.assertTrue(booleanDecorator.parse("1 "));
        Assertions.assertFalse(booleanDecorator.parse("0 "));
    }
}
