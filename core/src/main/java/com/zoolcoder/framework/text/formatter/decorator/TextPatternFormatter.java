package com.zoolcoder.framework.text.formatter.decorator;

import com.zoolcoder.framework.text.formatter.ITextFormatter;
import com.zoolcoder.framework.text.formatter.TextFormatterDecorator;
import com.zoolcoder.framework.text.formatter.ValidationResult;
import com.zoolcoder.framework.text.formatter.exception.FormatterException;
import com.zoolcoder.framework.text.formatter.exception.ParserException;

import java.util.regex.Pattern;

public class TextPatternFormatter extends TextFormatterDecorator<String> {

    protected Pattern pattern;

    public TextPatternFormatter(ITextFormatter iTextFormatter, Pattern pattern) {
        super(iTextFormatter);
        this.pattern = pattern;
    }

    @Override
    public String parse(String str) throws ParserException {
        return str;
    }

    @Override
    public String format(String object) throws FormatterException {
        return object;
    }

    @Override
    public ValidationResult isValid(String str) {
        return pattern.matcher(str).matches() ? ValidationResult.success() : ValidationResult.error("Text is not valid");
    }

    public Pattern getPattern() {
        return pattern;
    }
}
