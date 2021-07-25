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
@Table(name = "institutions")
public class Institutions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    private String website;

    private String phoneNumber;

    @OneToMany
    @JoinColumn(name="institution_id")
    private List<Answers> answers;


}
