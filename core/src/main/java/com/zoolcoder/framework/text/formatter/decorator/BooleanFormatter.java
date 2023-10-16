package com.zoolcoder.framework.text.formatter.decorator;

import com.zoolcoder.framework.text.formatter.BaseTextFormatter;
import com.zoolcoder.framework.text.formatter.ValidationResult;
import com.zoolcoder.framework.text.formatter.ITextFormatter;
import com.zoolcoder.framework.text.formatter.TextFormatterDecorator;
import com.zoolcoder.framework.text.formatter.exception.FormatterException;
import com.zoolcoder.framework.text.formatter.exception.ParserException;

public class BooleanFormatter extends TextFormatterDecorator<Boolean> {

    private String trueIdentifier = "true";
    private String falseIdentifier = "false";

    public BooleanFormatter(ITextFormatter iTextFormatter, String trueIdentifier, String falseIdentifier) {
        super(iTextFormatter);
        this.trueIdentifier = trueIdentifier;
        this.falseIdentifier = falseIdentifier;
    }

    public BooleanFormatter() {
        super(BaseTextFormatter.getInstance());
    }

    @Override
    public Boolean parse(String str) throws ParserException {
        return (str.trim().equalsIgnoreCase(trueIdentifier));
    }

    @Override
    public String format(Boolean object) throws FormatterException {
        if (object.booleanValue()) {
            return trueIdentifier;
        }
        return falseIdentifier;
    }

    @Override
    public ValidationResult isValid(String str) {
        if (str.equalsIgnoreCase(trueIdentifier) || str.equalsIgnoreCase(falseIdentifier))
            return ValidationResult.success();
        else
            return ValidationResult.error("Boolean text is Not Valid");
    }
}
