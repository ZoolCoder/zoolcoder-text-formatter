package com.zoolcoder.framework.text.formatter.exception;

public class ParserException extends TextFormatterException {
    private static final long serialVersionUID = 1L;

    public ParserException(String message) {
        super(message);
    }

    public ParserException(Throwable cause) {
        super(cause);
    }

    public ParserException(String message, Throwable cause) {
        super(message, cause);
    }
}
