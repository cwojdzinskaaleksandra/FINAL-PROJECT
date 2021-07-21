package pl.coderslab.accessibility.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "answers")
public class Answers{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Long questionId;

    @NotNull
    private Long answerId;

    @NotNull
    private Long institutionId;

    @ManyToOne
    private Questions questions;

    @ManyToOne
    private PossibleAnswers possibleAnswers;

    @ManyToOne
    private Institutions institutions;

}
