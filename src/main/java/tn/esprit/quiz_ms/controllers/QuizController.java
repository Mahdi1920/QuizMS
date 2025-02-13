package tn.esprit.quiz_ms.controllers;

import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;
import tn.esprit.quiz_ms.entities.Quiz;
import tn.esprit.quiz_ms.services.IQuizService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/Quiz")
public class QuizController {
	IQuizService quizService;
	@PostMapping("/addQuiz")
	public Quiz addQuiz(@RequestBody Quiz quiz) {
		return quizService.add(quiz);
	}
	@PutMapping("/putQuiz")
	public Quiz updateQuiz(@RequestBody Quiz quiz) {
		return quizService.update(quiz);
	}
	@GetMapping("/getQuizById/{idQuiz}")
	public Quiz retrieveQuiz(@PathVariable ObjectId idQuiz) {
		return quizService.retrieveById(idQuiz);
	}
	@GetMapping("/GetQuizs")
	public List<Quiz> retrieveAllQuizs() {
		return quizService.retrieveAll();
	}
	@DeleteMapping("/deleteQuiz/{idQuiz}")
	public void removeQuiz(@PathVariable ObjectId idQuiz) {
		quizService.delete(idQuiz);
	}
}
