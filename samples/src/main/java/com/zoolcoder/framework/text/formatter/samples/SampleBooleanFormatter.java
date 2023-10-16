package com.zoolcoder.framework.text.formatter.samples;

import com.zoolcoder.framework.text.formatter.BaseTextFormatter;
import com.zoolcoder.framework.text.formatter.ValidationResult;
import com.zoolcoder.framework.text.formatter.decorator.BooleanFormatter;

public class SampleBooleanFormatter extends BooleanFormatter {

    public SampleBooleanFormatter() {
        super(BaseTextFormatter.getInstance(), "1", "0");
    }

    @Override
    public ValidationResult isValid(String str) {
        return ValidationResult.success();
    }
}
