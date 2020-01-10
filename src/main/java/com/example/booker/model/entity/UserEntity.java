package com.example.booker.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class UserEntity {

    @Id
    @NotBlank(message = "Username is mandatory.")
    private String username;

    private String firstName;
    private String lastName;

    @NotBlank(message = "")
    private String password;

    @ManyToMany
    private Set<PublicationEntity> publicationEntities;

    @ManyToMany
    private Set<RoleEntity> roles;

}
