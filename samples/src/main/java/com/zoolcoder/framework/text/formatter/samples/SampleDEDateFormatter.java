package com.zoolcoder.framework.text.formatter.samples;

import com.zoolcoder.framework.text.formatter.BaseTextFormatter;
import com.zoolcoder.framework.text.formatter.ITextFormatter;
import com.zoolcoder.framework.text.formatter.ValidationResult;
import com.zoolcoder.framework.text.formatter.decorator.DateFormatter;
import com.zoolcoder.framework.text.formatter.exception.FormatterException;
import com.zoolcoder.framework.text.formatter.exception.ParserException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SampleDEDateFormatter implements ITextFormatter<Object> {

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.mm.yyyy");

    @Override
    public Object parse(String str) throws ParserException {
        try {
            return simpleDateFormat.parse(str);
        } catch (ParseException e) {
            throw new ParserException(e);
        }
    }

    @Override
    public String format(Object object) throws FormatterException {
        if (object == null) return null;
        return simpleDateFormat.format(object);
    }

    @Override
    public ValidationResult isValid(String str) {
        return null;
    }
}
