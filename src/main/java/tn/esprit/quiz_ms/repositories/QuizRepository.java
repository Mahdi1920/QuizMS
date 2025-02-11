package tn.esprit.quiz_ms.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.quiz_ms.entities.Quiz;

public interface QuizRepository extends MongoRepository<Quiz, String> {
}
