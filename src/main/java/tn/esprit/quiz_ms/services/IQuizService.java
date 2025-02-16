package tn.esprit.quiz_ms.services;

import org.bson.types.ObjectId;
import tn.esprit.quiz_ms.entities.Quiz;
import tn.starter.mongoShared.dto.QuizDTO;
import tn.starter.mongoShared.services.IGenericService;

public interface IQuizService extends IGenericService<QuizDTO,Quiz, ObjectId> {


}
