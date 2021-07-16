package pl.coderslab.accessibility.domain;

import lombok.Data;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Data
public class Institution extends BaseEntity {

    @UniqueElements(message = "Nazwa musi być unikatowa")
    @NotBlank(message = "Nazwa nie może być pusta")
    @Length(min=3, max=100, message = "Nazwa musi mieć minimum 3, a maksimum 100 znaków")
    private String name;

    @NotBlank(message = "Adres nie może być pusty")
    @Length(min=10, max=70, message = "Adres musi mieć minimum 10, a maksimum 70 znaków")
    private String address;

    private String website;

    private String phoneNumber;

    private Set<Answers> answers;
}
