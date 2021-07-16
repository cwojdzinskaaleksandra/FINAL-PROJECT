package pl.coderslab.accessibility.domain;


import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Data
//@Getter
//@Setter
//@EqualsAndHashCode
//@RequiredArgsConstructor
//@ToString
@NoArgsConstructor
@AllArgsConstructor //tworzy konstruktor ze wszystkimi argumentami (oprocz id)
public class User extends BaseEntity{

    @UniqueElements(message = "Nazwa użytkownika już istnieje")
    @NotBlank(message = "Nazwa użytkownika nie może być pusta")
    @Length(min=3, max=30, message = "Nazwa użytkownika musi mieć minimum 3, a maksimum 30 znaków")
    private String username;

    @NotBlank(message = "Hasło nie może być puste")
    @Length(min=3, max=20, message = "Hasło musi zawierać minimum 3, a maksimum 20 znaków")
    private String password;


    @Email(message = "Niepoprawny email")
    @NotBlank(message = "Email nie może być pusty")
    private String email;


    @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.MERGE)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;
}
