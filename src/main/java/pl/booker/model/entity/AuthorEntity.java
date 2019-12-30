package pl.booker.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "First name is mandatory.")
    @Size(min = 2)
    private String firstName;

    @NotBlank(message = "Last name is mandatory.")
    @Size(min = 2)
    private String lastName;

    @ManyToMany
    private Set<PublicationEntity> publications;

}
