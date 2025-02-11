package tn.esprit.quiz_ms.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDate;
@Document(collection = "quiz") // Specifies the MongoDB collection
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Quiz implements Serializable {
	@Id
	@Setter(AccessLevel.NONE)
	long idQuiz;
	String titreQuiz;
	String specialite;
	LocalDate dateQuiz ;
	LocalDate createdAt ;
	LocalDate updatedAt ;
}
