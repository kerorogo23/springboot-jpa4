package com.jack.springbootjpa4.repository;


import com.jack.springbootjpa4.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    //JPQL
//    @Query("SELECT NEW com.jack.springbootjpa4.dto.TestDto(t.name) FROM Test t")
//    List<TestDto> findAllTest(TestDto testDto);
}
