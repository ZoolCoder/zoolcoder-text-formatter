package com.zoolcoder.framework.text.formatter.decorator;

import com.zoolcoder.framework.text.formatter.ITextFormatter;
import com.zoolcoder.framework.text.formatter.TextFormatterDecorator;
import com.zoolcoder.framework.text.formatter.ValidationResult;
import com.zoolcoder.framework.text.formatter.exception.FormatterException;
import com.zoolcoder.framework.text.formatter.exception.ParserException;

import java.util.Locale;

public class EnumFormatter extends TextFormatterDecorator<Enum<?>> {

    private Class<? extends Enum> clazzEnum;

    public EnumFormatter(ITextFormatter iTextFormatter, Class<? extends Enum> enumeration) {
        super(iTextFormatter);
        this.clazzEnum = enumeration;
    }

    @Override
    public Enum<?> parse(String str) throws ParserException {
        if (isValid(str).equals(ValidationResult.success())) {
            return Enum.valueOf(clazzEnum, str.toUpperCase());
        }
        return null;
    }

    @Override
    public String format(Enum<?> object) throws FormatterException {
        return object.name();
    }

    @Override
    public ValidationResult isValid(String str) {
        try {
            Enum.valueOf(clazzEnum, str.toUpperCase());
        } catch (IllegalArgumentException e) {
            return ValidationResult.error(e.getMessage());
        }
        return ValidationResult.success();
    }
}
