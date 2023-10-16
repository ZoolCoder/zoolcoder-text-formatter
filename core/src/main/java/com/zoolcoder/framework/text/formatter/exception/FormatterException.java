package com.zoolcoder.framework.text.formatter.exception;

public class FormatterException extends TextFormatterException {
    private static final long serialVersionUID = 1L;

    public FormatterException(String message) {
        super(message);
    }

    public FormatterException(Throwable cause) {
        super(cause);
    }

    public FormatterException(String message, Throwable cause) {
        super(message, cause);
    }
}