package com.example.transaction;

import com.example.transaction.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class ExceptionInvoke {

    private final MemberRepository memberRepository;

    @Transactional
    public void invoke() {
        memberRepository.findByName("우헤헤").orElseThrow(() -> new IllegalStateException("존재하는 사용자가 없습니다."));
    }
}
