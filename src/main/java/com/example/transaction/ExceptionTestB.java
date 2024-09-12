package com.example.transaction;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ExceptionTestB {

    @Autowired
    private static ExceptionInvokeTest exceptionInvokeTest;

    public static void middleWare() {
        try {
            exceptionInvokeTest.invoke();
        }
        catch (Exception e) {
            System.out.println("잡았다!!!");
        }
    }
}
