package com.zoolcoder.framework.text.formatter.samples.decorator;

import com.zoolcoder.framework.text.formatter.BaseTextFormatter;
import com.zoolcoder.framework.text.formatter.decorator.BooleanFormatter;
import com.zoolcoder.framework.text.formatter.exception.ParserException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BooleanFormatterTest {
    private BooleanFormatter booleanFormatter;

    @Test
    public void testIgnoreCase() throws ParserException {
        booleanFormatter = new BooleanFormatter(BaseTextFormatter.getInstance(), "true", "false");
        Assertions.assertTrue(booleanFormatter.parse("TRUE"));
        Assertions.assertFalse(booleanFormatter.parse("false"));
    }

    @Test
    public void testSpaceCase() throws ParserException {
        booleanFormatter = new BooleanFormatter(BaseTextFormatter.getInstance(), "A", "B");
        Assertions.assertTrue(booleanFormatter.parse("a "));
        Assertions.assertFalse(booleanFormatter.parse("b "));
    }
}
