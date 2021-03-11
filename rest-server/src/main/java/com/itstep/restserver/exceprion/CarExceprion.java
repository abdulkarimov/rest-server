package com.itstep.restserver.exceprion;

public class CarExceprion extends RuntimeException{
    public CarExceprion(String message, Throwable cause) {
        super(message, cause);
    }
}
