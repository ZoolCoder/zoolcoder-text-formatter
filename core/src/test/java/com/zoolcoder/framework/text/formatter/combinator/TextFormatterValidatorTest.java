package com.zoolcoder.framework.text.formatter.combinator;

import com.zoolcoder.framework.text.formatter.BaseTextFormatter;
import com.zoolcoder.framework.text.formatter.ValidationResult;
import com.zoolcoder.framework.text.formatter.decorator.BooleanFormatter;
import com.zoolcoder.framework.text.formatter.decorator.EnumFormatter;
import org.junit.jupiter.api.Test;

class TextFormatterValidatorTest {

    @Test
    void isValid() {
        BaseTextFormatter baseTextFormatter = BaseTextFormatter.getInstance();
        BooleanFormatter booleanFormatter = new BooleanFormatter(baseTextFormatter, "TRUE", "FALSE");
        EnumFormatter enumFormatter = new EnumFormatter(BaseTextFormatter.getInstance(), TestBooleanResult.class);

        ValidationResult result = TextFormatterValidator.isValid(booleanFormatter)
                .and(TextFormatterValidator.isValid(enumFormatter))
                .apply("FALSE");

        System.out.println(result);
    }

    public enum TestBooleanResult{TRUE, FALSE}
}