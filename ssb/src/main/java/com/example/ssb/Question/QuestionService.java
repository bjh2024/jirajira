package com.example.ssb.Question;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionService {
	
	private final QuestionRepository questionRepository;
	
	public List<Question> getList(){
		return questionRepository.findAll();
	}
	
	public Question getIdQuestion(Integer id) {
		Optional<Question> question = questionRepository.findById(id);
		return question.get();
	}
	
	public void create(String subject, String content) {
		Question question = new Question(subject, content, LocalDateTime.now());
		questionRepository.save(question);
	}
}
