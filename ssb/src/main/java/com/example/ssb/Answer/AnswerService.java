package com.example.ssb.Answer;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ssb.Question.Question;
import com.example.ssb.Question.QuestionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnswerService {
	
	private final AnswerRepository answerRepository;
	
	public void create(Question question, String content ) {
		Answer answer = new Answer(content, LocalDateTime.now(), question);
		answerRepository.save(answer);
	}
}
