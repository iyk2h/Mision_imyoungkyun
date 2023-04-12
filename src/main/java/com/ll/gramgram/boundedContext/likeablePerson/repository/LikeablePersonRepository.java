package com.ll.gramgram.boundedContext.likeablePerson.repository;

import com.ll.gramgram.boundedContext.likeablePerson.entity.LikeablePerson;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LikeablePersonRepository extends JpaRepository<LikeablePerson, Long> {
    List<LikeablePerson> findByFromInstaMemberId(Long fromInstaMemberId);

    @Query(value = "select l from LikeablePerson as l where l.fromInstaMember.id = ?1 and l.toInstaMember.id = ?2")
    LikeablePerson findByFromToTo(Long id, Long id1);
}
