package com.zoolcoder.framework.text.formatter.factory;

import com.zoolcoder.framework.text.formatter.ValidationResult;
import com.zoolcoder.framework.text.formatter.decorator.BooleanFormatter;
import com.zoolcoder.framework.text.formatter.ITextFormatter;
import com.zoolcoder.framework.text.formatter.decorator.DateFormatter;

public class TextFormatterFactory {
    public ITextFormatter getTextFormatter(String str) {

        if (str == null) {
            return null;
        }

        if (new BooleanFormatter().isValid(str) == ValidationResult.success()) {
            return new BooleanFormatter();

        } else if (new DateFormatter().isValid(str) == ValidationResult.success()) {
            return new DateFormatter();

        }

        return null;
    }
}
