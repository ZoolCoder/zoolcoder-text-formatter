package com.zoolcoder.framework.text.formatter.decorator;

import com.zoolcoder.framework.text.formatter.ITextFormatter;
import com.zoolcoder.framework.text.formatter.TextFormatterDecorator;
import com.zoolcoder.framework.text.formatter.ValidationResult;
import com.zoolcoder.framework.text.formatter.exception.FormatterException;
import com.zoolcoder.framework.text.formatter.exception.ParserException;

import java.time.LocalTime;
import java.util.regex.Pattern;

public class TimeFormatter extends TextFormatterDecorator<LocalTime> {

    protected Pattern timePattern = Pattern.compile("^\\d{1,2}([:.]?\\d{1,2})?([ ]?[a|p]m)?$", Pattern.CASE_INSENSITIVE);
    protected Pattern timeWithoutTimeSeparatorPattern = Pattern.compile("^\\d{1,2399}$");

    public TimeFormatter(ITextFormatter iTextFormatter) {
        super(iTextFormatter);
    }

    @Override
    public LocalTime parse(String str) throws ParserException {
        ValidationResult validationResult = isValid(str);
        if (validationResult.result == ValidationResult.Result.WARNING && validationResult.message.contains("time separator is missing")) {
            return LocalTime.parse(String.format("%:2f", str));
        } else {
            return LocalTime.parse(str);
        }
    }

    @Override
    public String format(LocalTime object) throws FormatterException {
        return null;
    }

    @Override
    public ValidationResult isValid(String str) {
        if (timeWithoutTimeSeparatorPattern.matcher(str).matches()) {
            return ValidationResult.warning("time separator is missing");
        } else if (timePattern.matcher(str).matches()) {
            return ValidationResult.success();
        } else {
            return ValidationResult.error("Time is not valid");
        }
    }
}
