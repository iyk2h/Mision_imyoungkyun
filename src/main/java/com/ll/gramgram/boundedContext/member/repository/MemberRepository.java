package com.ll.gramgram.boundedContext.member.repository;

import com.ll.gramgram.boundedContext.member.entity.Member;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

// MemberRepository => member 테이블을 다루는 클래스
// JpaRepository<Member, Long> => Member == member 테이블, Long == member 의 주키의 타입
public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUsername(String username);
}