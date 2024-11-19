package com.example.ssb.Answer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ssb.Question.Question;
import com.example.ssb.Question.QuestionService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/answer")
public class AnswerController {
	
	private final AnswerService answerService;
	
	private final QuestionService questionService;
	
	@PostMapping("/create/{id}")
	public String create(Model model,
						 @PathVariable("id") Integer id,
					     @Valid AnswerForm answerForm,
					     BindingResult bindingResult) {
		Question question = questionService.getIdQuestion(id);
		if(bindingResult.hasErrors()) {
			model.addAttribute("question", question);
			return "question_detail";
		}
		answerService.create(question, answerForm.getContent());
		return String.format("redirect:/question/detail/%s",id);
	}
	
}
