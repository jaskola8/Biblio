package pl.booker.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@Entity
public class PublisherEntity {

    @Id
    private String name;

    @OneToMany
    private Set<PublicationEntity> publications;
}
