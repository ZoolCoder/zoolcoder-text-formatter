package com.zoolcoder.framework.text.formatter.combinator;


import com.zoolcoder.framework.text.formatter.ITextFormatter;
import com.zoolcoder.framework.text.formatter.ValidationResult;

import java.util.function.Function;

public interface TextFormatterValidator
        extends Function<String, ValidationResult> {

    static TextFormatterValidator isValid(ITextFormatter iTextFormatter) {
        return str -> iTextFormatter.isValid(str);
    }

    default TextFormatterValidator and(TextFormatterValidator other) {
        return str -> {
            ValidationResult result = this.apply(str);
            return result.result == ValidationResult.Result.OK ? other.apply(str) : result;
        };
    }
}