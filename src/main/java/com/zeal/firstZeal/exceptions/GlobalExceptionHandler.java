package com.zeal.firstZeal.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResoinse> resourceNotFoundExceptionHandler
            (ResourceNotFoundException ex){

        String message=ex.getMessage()+":"+ex.getId();
        boolean success=false;
        ApiResoinse ApiResoinse=new ApiResoinse(message,success,ex.getId());

        return new ResponseEntity<>(ApiResoinse, HttpStatus.NOT_FOUND);
    }


}
