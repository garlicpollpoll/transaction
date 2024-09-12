package com.example.transaction;

import com.example.transaction.entity.Member;
import com.example.transaction.repository.MemberRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DBInit {

    private final MemberRepository memberRepository;

    @PostConstruct
    public void init() {
        Member member = Member.builder()
                .name("kyoungsuk")
                .age(27)
                .build();

        memberRepository.save(member);
    }
}
