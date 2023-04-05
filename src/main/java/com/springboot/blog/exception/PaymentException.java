package com.springboot.blog.exception;

import com.springboot.blog.repository.PaymentRepository;

public class PaymentException extends RuntimeException{
    public PaymentException(String message){
        super(message);
    }
}
