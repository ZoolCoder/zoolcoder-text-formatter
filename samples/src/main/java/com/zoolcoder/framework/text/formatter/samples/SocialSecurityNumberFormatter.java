package com.zoolcoder.framework.text.formatter.samples;

import com.zoolcoder.framework.text.formatter.BaseTextFormatter;
import com.zoolcoder.framework.text.formatter.decorator.TextPatternFormatter;
import com.zoolcoder.framework.text.formatter.exception.ParserException;

import java.util.regex.Pattern;

public class SocialSecurityNumberFormatter extends TextPatternFormatter {
    public SocialSecurityNumberFormatter() {
        super(BaseTextFormatter.getInstance(), Pattern.compile("^(?!666|000|9\\d{2})\\d{3}-(?!00)\\d{2}-(?!0{4})\\d{4}$"));
    }

    @Override
    public String format(String str) throws ParserException {
        return formatSSN(str);
    }

    private String formatSSN(String str) {
        StringBuilder ssn = new StringBuilder(str);
        ssn = ssn.insert(3, '-').insert(7, '-');
        return ssn.toString();
    }
}
