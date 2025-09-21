package com.zeal.firstZeal.exceptions;

import lombok.Data;
import lombok.Getter;

@Getter
public class ResourceNotFoundException
        extends RuntimeException{
//    String message1;
    int id;

    public ResourceNotFoundException(String message,int id) {
        super(message);
//        this.message1 = message1;
        this.id = id;
    }
}
