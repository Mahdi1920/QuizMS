package tn.esprit.quiz_ms.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.starter.shared.entities.MongoBaseEntity;

import java.time.LocalDate;

@Document(collection = "quiz")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Quiz extends MongoBaseEntity {
	String titreQuiz;
	String specialite;
	LocalDate dateQuiz ;
}
