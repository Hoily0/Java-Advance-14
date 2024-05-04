package com.work.globalException;

/**
 * @author 30391
 */
public class ScoreException extends RuntimeException {
    public ScoreException() {
    }

    public ScoreException(String message) {
        super(message);
    }
}
