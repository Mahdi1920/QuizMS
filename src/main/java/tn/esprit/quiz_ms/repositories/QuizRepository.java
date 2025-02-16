package tn.esprit.quiz_ms.repositories;

import org.bson.types.ObjectId;
import tn.esprit.quiz_ms.entities.Quiz;
import tn.starter.mongoShared.repositories.BaseRepository;

public interface QuizRepository extends BaseRepository<Quiz,String> {
}
