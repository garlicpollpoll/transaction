package com.example.transaction.exception;

public class BalanceUnderZero extends Exception{

    public BalanceUnderZero(String message) {
        super(message);
    }
}
