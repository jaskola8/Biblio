package com.example.booker.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "AUTHORS")
public class AuthorEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "First name is mandatory.")
    @Size(min = 2)
    @Column(name = "first_name")
    private String firstName;

    @NotBlank(message = "Last name is mandatory.")
    @Size(min = 2)
    @Column(name = "last_name")
    private String lastName;

    @ManyToMany
    private Set<PublicationEntity> publications;

}
