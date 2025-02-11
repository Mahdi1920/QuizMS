package tn.esprit.quiz_ms.services;

import tn.esprit.quiz_ms.entities.Quiz;
import tn.esprit.quiz_ms.repositories.QuizRepository;

import java.util.List;
import java.util.Optional;

public interface IQuizService {
	public Quiz addQuiz(Quiz quiz);
	public Quiz updateQuiz(Quiz quiz);
	public Optional<Quiz> retrieveQuiz(String idQuiz);
	public List<Quiz> retrieveAllQuizs();
	void removeQuiz (String idQuiz);

}
