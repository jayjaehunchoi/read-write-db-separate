package com.huni.readwritedb.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestConstructor;
import org.springframework.test.context.TestConstructor.AutowireMode;

@SpringBootTest
@TestConstructor(autowireMode = AutowireMode.ALL)
class MemberServiceTest {

    private final MemberService memberService;

    public MemberServiceTest(final MemberService memberService) {
        this.memberService = memberService;
    }

    @Test
    void writeDb() {
        System.out.println(memberService.findInWriteDb());
    }

    @Test
    void readDb() {
        System.out.println(memberService.findInReadDb());
    }

}
