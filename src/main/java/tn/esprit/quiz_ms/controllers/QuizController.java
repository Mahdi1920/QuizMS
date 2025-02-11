package tn.esprit.quiz_ms.controllers;

import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.quiz_ms.entities.Quiz;
import tn.esprit.quiz_ms.services.IQuizService;

import java.util.List;
import java.util.Optional;

@RestController
@NoArgsConstructor
@RequestMapping("/api/Quiz")
public class QuizController {
	IQuizService quizService;
	@PostMapping("/addQuiz") 
	public Quiz addQuiz(Quiz quiz) {
		return quizService.addQuiz(quiz);
	}
	@PutMapping("/putQuiz")
	public Quiz updateQuiz(Quiz quiz) {
		return quizService.updateQuiz(quiz);
	}
	@GetMapping("/getQuizById/{idQuiz}")
	public Optional<Quiz> retrieveQuiz(long idQuiz) {
		return quizService.retrieveQuiz(idQuiz);
	}
	@GetMapping("/GetQuizs")
	public List<Quiz> retrieveAllQuizs() {
		return quizService.retrieveAllQuizs();
	}
	@DeleteMapping("/deleteQuiz/{idQuiz}")
	public void removeQuiz(long idQuiz) {
		quizService.removeQuiz(idQuiz);
	}
}
