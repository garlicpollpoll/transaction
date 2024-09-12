package com.example.transaction.service;

import com.example.transaction.ExceptionInvoke;
import com.example.transaction.entity.Member;
import com.example.transaction.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberServiceB {

    private final ExceptionInvoke exceptionInvoke;
    private final MemberRepository memberRepository;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void update() {
        try {
            Member member = Member.builder()
                    .name("MemberServiceB")
                    .age(27)
                    .build();

            memberRepository.save(member);
            exceptionInvoke.invoke();
        } catch (Exception e) {
            log.error("잡았다!!!");
        }
    }
}
