package com.zoolcoder.framework.text.formatter.decorator;

import com.zoolcoder.framework.text.formatter.BaseTextFormatter;
import com.zoolcoder.framework.text.formatter.ValidationResult;
import com.zoolcoder.framework.text.formatter.ITextFormatter;
import com.zoolcoder.framework.text.formatter.TextFormatterDecorator;
import com.zoolcoder.framework.text.formatter.exception.FormatterException;
import com.zoolcoder.framework.text.formatter.exception.ParserException;
import com.zoolcoder.framework.text.formatter.util.FloatPointUtil;

import java.text.SimpleDateFormat;

public class DoubleFormatter extends TextFormatterDecorator<Double> {

    private static final int DEFAULT_PRECISION = 2;
    private FloatPointUtil floatPointUtil;

    public DoubleFormatter() {
        this(BaseTextFormatter.getInstance(), DEFAULT_PRECISION);
    }

    public DoubleFormatter(ITextFormatter iTextFormatter, int precision) {
        super(iTextFormatter);
        floatPointUtil = new FloatPointUtil(precision);
    }

    public int getPrecision() {
        return floatPointUtil.getPrecision();
    }

    @Override
    public Double parse(String str) throws ParserException {
        return floatPointUtil.fromString(str).doubleValue();
    }

    @Override
    public String format(Double object) throws FormatterException {
        return floatPointUtil.toString(object);
    }

    @Override
    public ValidationResult isValid(String str) {
        return null;
    }
}
