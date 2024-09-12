package com.example.transaction;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExceptionTestA {

    @Autowired
    private static ExceptionTestB exceptionTestB;

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        exceptionTestB.middleWare();
    }
}
