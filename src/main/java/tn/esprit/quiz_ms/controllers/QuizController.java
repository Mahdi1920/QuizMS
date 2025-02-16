package tn.esprit.quiz_ms.controllers;

import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;
import tn.esprit.quiz_ms.entities.Quiz;
import tn.starter.mongoShared.controllers.GenericController;
import tn.starter.mongoShared.dto.QuizDTO;

@RestController
@AllArgsConstructor
@RequestMapping("/api/quiz")
public class QuizController extends GenericController<QuizDTO,Quiz,ObjectId> {

}
