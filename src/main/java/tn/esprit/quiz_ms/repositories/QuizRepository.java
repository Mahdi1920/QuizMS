package tn.esprit.quiz_ms.repositories;

import org.bson.types.ObjectId;
import tn.esprit.quiz_ms.entities.Quiz;
import tn.starter.shared.repositories.MongoBaseRepository;

public interface QuizRepository extends MongoBaseRepository<Quiz,ObjectId> {
}
