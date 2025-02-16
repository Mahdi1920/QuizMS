package tn.esprit.quiz_ms.services;

import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import tn.starter.mongoShared.dto.QuizDTO;

import java.util.List;

@Service
@AllArgsConstructor
public class QuizServiceImpl implements IQuizService{

	@Override
	public QuizDTO add(QuizDTO quizDTO) {
		return null;
	}

	@Override
	public QuizDTO update(QuizDTO quizDTO) {
		return null;
	}

	@Override
	public QuizDTO retrieveById(ObjectId objectId) {
		return null;
	}

	@Override
	public List<QuizDTO> retrieveAll() {
		return List.of();
	}

	@Override
	public void delete(ObjectId objectId) {

	}
}
