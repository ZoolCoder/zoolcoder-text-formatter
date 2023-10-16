package com.zoolcoder.framework.text.formatter.decorator;

import com.zoolcoder.framework.text.formatter.BaseTextFormatter;
import com.zoolcoder.framework.text.formatter.ITextFormatter;
import com.zoolcoder.framework.text.formatter.TextFormatterDecorator;
import com.zoolcoder.framework.text.formatter.ValidationResult;
import com.zoolcoder.framework.text.formatter.exception.FormatterException;
import com.zoolcoder.framework.text.formatter.exception.ParserException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter extends TextFormatterDecorator<Date> {

    private static final String DEFAULT_FORMAT = "yyyy-MM-dd";
    private SimpleDateFormat simpleDateFormat;

    public DateFormatter(ITextFormatter iTextFormatter, String format) {
        super(iTextFormatter);
        simpleDateFormat = new SimpleDateFormat(format);
    }

    public DateFormatter() {
        super(BaseTextFormatter.getInstance());
        simpleDateFormat = new SimpleDateFormat(DEFAULT_FORMAT);
    }

    @Override
    public Date parse(String str) throws ParserException {
        try {
            return simpleDateFormat.parse(str);
        } catch (ParseException e) {
            throw new ParserException(e);
        }
    }

    @Override
    public String format(Date object) throws FormatterException {
        if (object == null) return null;
        return simpleDateFormat.format(object);
    }

    @Override
    public ValidationResult isValid(String str) {
        return null;
    }
}
