package pl.booker.model.entity;

import pl.booker.model.entity.UserEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToMany
    private Set<UserEntity> users;

}
