package com.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JsbExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsbExamApplication.class, args);

        // 답글로 부터 질문을 찾아가는 방법
        // Answer a = new Answer();

        // questionRepository.findById(a.question.getId()) // db 방법

        // 자바 방식
        //  Question question = a.getQuestion();
        //  question.getContent();

        // a.getQuestion().getContent();


        // 특정 질문에 달린 모든 답글들

        // db 방법
        // Question q1 = questionRepository.findById(1); // 특정 질문
        // answerRepository.findByQuestionId(q1.getId()); // 특정 질문에 달린 답변들


        // java 방식
        // Question q1 = questionRepository.findById(1); // 특정 질문
        // q1.getAnswerList(); // 특정 질문에 달린 답변들
    }

}