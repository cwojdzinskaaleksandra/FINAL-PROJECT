package pl.coderslab.accessibility.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Answers{

    @Id
    @NotNull
    private Long questionId;

    @NotNull
    private Long answerId;

}
