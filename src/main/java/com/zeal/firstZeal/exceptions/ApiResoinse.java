package com.zeal.firstZeal.exceptions;

import lombok.Data;

@Data
public class ApiResoinse {
    String message;
    boolean success;
    int id;
    public ApiResoinse(String message, boolean success,int id) {
        this.message = message;
        this.success = success;
        this.id=id;
    }
}
