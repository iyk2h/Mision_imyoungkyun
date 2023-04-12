package com.ll.gramgram.boundedContext.instaMember.repository;

import com.ll.gramgram.boundedContext.instaMember.entity.InstaMember;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstaMemberRepository extends JpaRepository<InstaMember, Long> {
    Optional<InstaMember> findByUsername(String username);
}
