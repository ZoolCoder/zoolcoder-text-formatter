package com.zoolcoder.framework.text.formatter.samples.decorator;

import com.zoolcoder.framework.text.formatter.BaseTextFormatter;
import com.zoolcoder.framework.text.formatter.decorator.TextPatternFormatter;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class TextPatternFormatterTest {

    @Test
    void isValid() {
        final Pattern EMAIL_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        TextPatternFormatter emailFormatter = new TextPatternFormatter(BaseTextFormatter.getInstance(), EMAIL_REGEX);
        assertFalse(emailFormatter.isValid("a").isSuccessful());
        assertTrue(emailFormatter.isValid("jon@gmail.com").isSuccessful());
    }
}