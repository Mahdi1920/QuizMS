package tn.esprit.quiz_ms.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.quiz_ms.entities.Quiz;

public interface QuizRepository extends MongoRepository<Quiz,Long> {
}
