package pl.coderslab.accessibility.model;

import lombok.*;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "answers")
public class Answers{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "question_id")
    private Long questionId;

    @Column(name = "answer_id")
    private Long answerId;

    @Column(name = "institution_id")
    private Long institutionId;

//    @ManyToOne
//    private Questions questions;
//
//    @ManyToOne
//    private PossibleAnswers possibleAnswers;
//
//    @ManyToOne
//    private Institutions institutions;

}
