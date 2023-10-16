package com.zoolcoder.framework.text.formatter;

import com.zoolcoder.framework.text.formatter.exception.FormatterException;
import com.zoolcoder.framework.text.formatter.exception.ParserException;

public interface ITextFormatter<T> {

    public T parse(String str) throws ParserException;
    public String format(T object) throws FormatterException;
    public ValidationResult isValid(String str);
}
