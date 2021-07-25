package pl.coderslab.accessibility.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "possible_answers")
public class PossibleAnswers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String answer;

    @OneToMany
    @JoinColumn(name="answer_id")
    private List<Answers> answers;
}
