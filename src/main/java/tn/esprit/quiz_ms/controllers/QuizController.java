package tn.esprit.quiz_ms.controllers;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
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
	public Quiz addQuiz(@RequestBody Quiz quiz) {
		return quizService.addQuiz(quiz);
	}
	@PutMapping("/putQuiz")
	public Quiz updateQuiz(@RequestBody Quiz quiz) {
		return quizService.updateQuiz(quiz);
	}
	@GetMapping("/getQuizById/{idQuiz}")
	public Optional<Quiz> retrieveQuiz(@PathVariable String idQuiz) {
		return quizService.retrieveQuiz(idQuiz);
	}
	@GetMapping("/GetQuizs")
	public List<Quiz> retrieveAllQuizs() {
		return quizService.retrieveAllQuizs();
	}
	@DeleteMapping("/deleteQuiz/{idQuiz}")
	public void removeQuiz(@PathVariable String idQuiz) {
		quizService.removeQuiz(idQuiz);
	}
}
