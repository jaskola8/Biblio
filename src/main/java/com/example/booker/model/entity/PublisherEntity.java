package com.example.booker.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "PUBLISHERS")
public class PublisherEntity {

    @Id
    @Column(name = "id")
    private Long id;

    @NaturalId
    @Column(name = "publisher_name")
    private String name;

    @OneToMany
    private Set<PublicationEntity> publications;
}
