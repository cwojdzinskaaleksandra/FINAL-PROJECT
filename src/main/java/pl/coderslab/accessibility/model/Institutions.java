package pl.coderslab.accessibility.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "institutions")
public class Institutions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @UniqueElements(message = "Nazwa musi być unikatowa")
    @NotBlank(message = "Nazwa nie może być pusta")
    @Length(min=3, max=100, message = "Nazwa musi mieć minimum 3, a maksimum 100 znaków")
    private String name;

    @NotBlank(message = "Adres nie może być pusty")
    @Length(min=10, max=70, message = "Adres musi mieć minimum 10, a maksimum 70 znaków")
    private String address;

    private String website;

    private String phoneNumber;

    @OneToMany(mappedBy = "institutionId")
    private List<Answers> answers;


}
