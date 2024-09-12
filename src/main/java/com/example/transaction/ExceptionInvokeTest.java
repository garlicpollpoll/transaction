package com.example.transaction;

import org.springframework.stereotype.Service;

@Service
public class ExceptionInvokeTest {

    public static void invoke() {
        throw new IllegalStateException("예상치 못한 예외!!!");
    }
}
