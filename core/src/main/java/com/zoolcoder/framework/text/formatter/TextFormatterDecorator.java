package com.zoolcoder.framework.text.formatter;

import com.zoolcoder.framework.text.formatter.exception.FormatterException;
import com.zoolcoder.framework.text.formatter.exception.ParserException;

public abstract class TextFormatterDecorator<T> implements ITextFormatter<T> {

    private ITextFormatter iTextFormatter;

    public TextFormatterDecorator(ITextFormatter iTextFormatter) {
        this.iTextFormatter = iTextFormatter;
    }

    public abstract T parse(String str) throws ParserException;
    public abstract String format(T object) throws FormatterException;
    public abstract ValidationResult isValid(String str);
}
