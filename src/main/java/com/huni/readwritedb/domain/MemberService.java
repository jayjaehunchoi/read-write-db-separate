package com.huni.readwritedb.domain;

import java.util.List;
import javax.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public List<Member> findInWriteDb() {
        return memberRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<Member> findInReadDb() {
        return memberRepository.findAll();
    }
}
