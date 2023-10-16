package com.zoolcoder.framework.text.formatter.exception;

public class TextFormatterException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public TextFormatterException(String message) {
        super(message);
    }

    public TextFormatterException(Throwable cause) {
        super(cause);
    }

    public TextFormatterException(String message, Throwable cause) {
        super(message, cause);
    }

}
