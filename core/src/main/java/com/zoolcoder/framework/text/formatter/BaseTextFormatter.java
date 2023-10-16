package com.zoolcoder.framework.text.formatter;
import com.zoolcoder.framework.text.formatter.exception.FormatterException;
import com.zoolcoder.framework.text.formatter.exception.ParserException;

public class BaseTextFormatter implements ITextFormatter<Object> {

    private static BaseTextFormatter instance = null;

    private BaseTextFormatter() {
    }

    public static BaseTextFormatter getInstance() {
        if(instance == null) {
            instance = new BaseTextFormatter();
        }
        return instance;
    }

    @Override
    public Object parse(String str) throws ParserException {
        return str;
    }

    @Override
    public String format(Object object) throws FormatterException {
        return object.toString();
    }

    @Override
    public ValidationResult isValid(String str) {
        return null;
    }
}
