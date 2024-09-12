package com.example.transaction.service;

import com.example.transaction.entity.Member;
import com.example.transaction.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberServiceA {

    private final MemberRepository memberRepository;
    private final MemberServiceB memberServiceB;

    @Transactional
    public void update() {
        Member member = Member.builder()
                .name("MemberServiceA")
                .age(20).build();
        memberRepository.save(member);
        memberServiceB.update();
    }
}
