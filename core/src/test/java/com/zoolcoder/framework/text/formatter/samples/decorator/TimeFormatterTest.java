package com.zoolcoder.framework.text.formatter.samples.decorator;

import com.zoolcoder.framework.text.formatter.BaseTextFormatter;
import com.zoolcoder.framework.text.formatter.ValidationResult;
import com.zoolcoder.framework.text.formatter.decorator.TimeFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeFormatterTest {

    final TimeFormatter timeFormatter = new TimeFormatter(BaseTextFormatter.getInstance());

    @Test
    void parse() {
        //System.out.println(String.format("%.2f", "900"));
        //System.out.println(timeFormatter.parse("900"));
        Assertions.assertTrue(timeFormatter.isValid("0:00").isSuccessful());

    }

    @Test
    void format() {
    }

    @Test
    void isValid() {
        Assertions.assertFalse(timeFormatter.isValid("a").isSuccessful());
        Assertions.assertTrue(timeFormatter.isValid("0:00").isSuccessful());
        Assertions.assertTrue(timeFormatter.isValid("900").result == ValidationResult.Result.WARNING );
        Assertions.assertTrue(timeFormatter.isValid("3900pm").isSuccessful());
    }
}