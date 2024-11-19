package com.example.ssb;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.ssb.Question.Question;
import com.example.ssb.Question.QuestionRepository;
import com.example.ssb.Question.QuestionService;

// com.example.ssb.SsbApplication => main메서드가 있는 java파일 이름+Tests해야 junit test작동
@SpringBootTest
class SsbApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private QuestionService questionService;

	@Test
	void testJpa() {
		
		for(int i = 0; i < 300; i++) {
			questionService.create("제목["+(i+1)+"]", "내용 없음");
//			Optional<Question> oq = questionRepository.findById(i);
//			questionRepository.delete(oq.get());
		}
		
		// db 데이터 set
//		Question q1 = new Question();
//		q1.setSubject("sbb가 무엇인가요?");
//		q1.setContent("sbb에 대해서 알고 싶습니다");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);
//		
//		Question q2 = new Question();
//		q2.setSubject("스프링 부트 모델 질문입니다.");
//		q2.setContent("id는 자동으로 생성되나요?");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2);
		
		// repository => findAll()
//		List<Question> QList = this.questionRepository.findAll();
//		assertEquals(4, QList.size());
//		
//		Question q1 = QList.get(0);
//		assertEquals("sbb가 무엇인가요?", q1.getSubject());
		
		// Optional
//		Optional<Question> oq = this.questionRepository.findById(1);
//		if(oq.isPresent()) {
//			Question q = oq.get();
//			assertEquals("sbb가 무엇인가요?", q.getSubject());
//		}
		
		// Repository => findBy+컬럼명 => select * from 테이블명 where 컬럼명 = "파라미터"
//		List<Question> qList = this.questionRepository.findBySubject("sbb가 무엇인가요?");
//		assertEquals(2, qList.size());
		
		// Repository => findBy+컴럼명+And+컬럼명
//		List<Question> qList = this.questionRepository.findBySubjectAndContent("sbb가 무엇인가요?", "ssb에 대해서 알고 싶습니다!");
//		assertEquals(2, qList.size());
		
		// Repository => findBy+컬럼명+Like
//		List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
//		assertEquals(2, qList.size());
		
		// 데이터 수정
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertEquals(true, oq.isPresent());
//		Question q = oq.get();
//		q.setSubject("sbb는 수정인가요?");
//		this.questionRepository.save(q);
		
		// 데이터 삭제
//		assertEquals(2, this.questionRepository.count());
//		Optional <Question> oq1 = this.questionRepository.findById(1);
//		Optional <Question> oq2 = this.questionRepository.findById(3);
//		assertEquals(true,oq1.isPresent());
//		Question q1 = oq1.get();
//		assertEquals(true,oq2.isPresent());
//		Question q2 = oq2.get();
//		this.questionRepository.delete(q1);
//		this.questionRepository.delete(q2);
//		assertEquals(2, this.questionRepository.count());

		
		
	}

}
