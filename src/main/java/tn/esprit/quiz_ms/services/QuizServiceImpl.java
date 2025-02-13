package tn.esprit.quiz_ms.services;

import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import tn.esprit.quiz_ms.entities.Quiz;
import tn.esprit.quiz_ms.repositories.QuizRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class QuizServiceImpl implements IQuizService{
	private QuizRepository quizRepository;
	@Override
	public Quiz add(Quiz quiz) {
		return quizRepository.save(quiz);
	}

	@Override
	public Quiz update(Quiz quiz) {
		return quizRepository.save(quiz);
	}

	@Override
	public Quiz retrieveById(ObjectId s) {
		return quizRepository.findById(s).orElse(null);
	}

	@Override
	public List<Quiz> retrieveAll() {
		return quizRepository.findAll();
	}

	@Override
	public void delete(ObjectId s) {
		quizRepository.deleteById(s);
	}
}
