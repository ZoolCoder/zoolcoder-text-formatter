package com.zoolcoder.framework.text.formatter;

import com.zoolcoder.framework.text.formatter.samples.SocialSecurityNumberFormatter;
import com.zoolcoder.framework.text.formatter.exception.ParserException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SocialSecurityNumberFormatterTest {

    private SocialSecurityNumberFormatter socialSecurityNumberFormatter = new SocialSecurityNumberFormatter();

    @Test
    public void testFormat() throws ParserException {
        Assertions.assertTrue(socialSecurityNumberFormatter.format("123456789").equals("123-456-789"));
    }

    @Test
    public void testParse() throws ParserException {
        Assertions.assertTrue(socialSecurityNumberFormatter.parse("123456789").equals("123456789"));
    }

    @Test
    public void testIsValid() throws ParserException {
        Assertions.assertFalse(socialSecurityNumberFormatter.isValid("a").isSuccessful());
        Assertions.assertTrue(socialSecurityNumberFormatter.isValid("123-45-6789").isSuccessful());
    }
}