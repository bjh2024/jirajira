package com.example.ssb.Answer;

import java.time.LocalDateTime;

import com.example.ssb.Question.Question;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Answer{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(columnDefinition = "Text")
	private String content;
	
	private LocalDateTime createDate;
	
	@ManyToOne
	private Question question;

	public Answer(String content, LocalDateTime createDate, Question question) {
		super();
		this.content = content;
		this.createDate = createDate;
		this.question = question;
	}
	
	
	
}
