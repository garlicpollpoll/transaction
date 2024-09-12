package com.example.transaction.controller;

import com.example.transaction.service.MemberServiceA;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberServiceA memberService;

    @GetMapping("/test/rollback/transaction")
    public String testRollback() {
        memberService.update();
        return "ok";
    }
}
