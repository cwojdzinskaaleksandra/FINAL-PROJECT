package pl.coderslab.accessibility.domain;


import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor //tworzy konstruktor ze wszystkimi argumentami (oprocz id)
@ToString
public class Role extends BaseEntity{

    private String name;

    @ManyToMany(mappedBy="roles")
    private Set<User> users;
}
