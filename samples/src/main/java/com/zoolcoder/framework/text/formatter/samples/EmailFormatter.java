package com.zoolcoder.framework.text.formatter.samples;

import com.zoolcoder.framework.text.formatter.BaseTextFormatter;
import com.zoolcoder.framework.text.formatter.decorator.TextPatternFormatter;

import java.util.regex.Pattern;

public class EmailFormatter extends TextPatternFormatter {

    public static final Pattern EMAIL_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public EmailFormatter() {
        super(BaseTextFormatter.getInstance(), EMAIL_REGEX);
    }
}
