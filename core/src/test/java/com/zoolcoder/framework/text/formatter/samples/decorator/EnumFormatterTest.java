package com.zoolcoder.framework.text.formatter.samples.decorator;

import com.zoolcoder.framework.text.formatter.BaseTextFormatter;
import com.zoolcoder.framework.text.formatter.decorator.EnumFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EnumFormatterTest {

    EnumFormatter enumFormatter = new EnumFormatter(BaseTextFormatter.getInstance(), TestResult.class);

    @Test
    void parse() {
       // Assertions.assertTrue(enumFormatter.parse("OK").equals(TestResult.OK));
        //Assertions.assertTrue(enumFormatter.parse("OK") == TestResult.OK);
    }

    @Test
    void format() {
        Assertions.assertTrue(enumFormatter.format(TestResult.OK).equals(TestResult.OK.name()));
        Assertions.assertTrue(enumFormatter.format(TestResult.OK).equalsIgnoreCase("ok"));
    }

    public enum TestResult{ERROR, WARNING, OK}
}