package com.zoolcoder.framework.text.formatter;

public class ValidationResult {
    public final Result result;
    public final String message;

    public ValidationResult(Result result, String message) {
        this.result = result;
        this.message = message;
    }

    public static ValidationResult success() {
        return new ValidationResult(Result.OK, null);
    }

    public static ValidationResult error(String message) {
        return new ValidationResult(Result.ERROR, message);
    }

    public static ValidationResult warning(String message) {
        return new ValidationResult(Result.WARNING, message);
    }

    public boolean isSuccessful() {
        return result == Result.OK;
    }

    @Override
    public String toString() {
        return "ValidationResult{" +
                "result=" + result +
                ", message='" + message + '\'' +
                '}';
    }

    public enum Result {OK, ERROR, WARNING}
}
