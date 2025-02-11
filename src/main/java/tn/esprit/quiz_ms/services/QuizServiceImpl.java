package tn.esprit.quiz_ms.services;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.quiz_ms.entities.Quiz;
import tn.esprit.quiz_ms.repositories.QuizRepository;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
public class QuizServiceImpl implements IQuizService{
	QuizRepository quizRepository;
	@Override
	public Quiz addQuiz(Quiz quiz) {
		return quizRepository.save(quiz);
	}

	@Override
	public Quiz updateQuiz(Quiz quiz) {
		return quizRepository.save(quiz);
	}

	@Override
	public Optional<Quiz> retrieveQuiz(long idQuiz) {
		return quizRepository.findById(idQuiz);
	}

	@Override
	public List<Quiz> retrieveAllQuizs() {
		return quizRepository.findAll();
	}

	@Override
	public void removeQuiz(long idQuiz) {
		quizRepository.deleteById(idQuiz);
	}
}
