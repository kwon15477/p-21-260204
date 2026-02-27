package com.back;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
//    Optional<Question> findByid(int id);

    Optional<Question> findBySubject(String subject);
}
