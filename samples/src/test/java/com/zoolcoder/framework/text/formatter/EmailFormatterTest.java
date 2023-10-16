package com.zoolcoder.framework.text.formatter;

import com.zoolcoder.framework.text.formatter.samples.EmailFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmailFormatterTest {

    @Test
    void format() {
    }

    @Test
    void isValid() {
        EmailFormatter emailFormatter = new EmailFormatter();
        Assertions.assertFalse(emailFormatter.isValid("a").isSuccessful());
        Assertions.assertTrue(emailFormatter.isValid("jon@gmail.com").isSuccessful());
    }
}