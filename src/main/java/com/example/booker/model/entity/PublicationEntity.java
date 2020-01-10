package com.example.booker.model.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.Year;
import java.util.List;
import java.util.Set;


@Entity
@Getter
@Setter
@Table(name = "PUBLICATIONS")
public class PublicationEntity {

    @Id
    private Long id;

    @NaturalId
    @Column(name = "ISBN")
    private String ISBN;

    @NotBlank
    @Column(name = "title")
    private String title;

    @Column(name = "subtitle")
    private String subtitle;

    @OneToMany
    private Set<ResourceEntity> resources;

    @ManyToMany
    private List<AuthorEntity> authors;

    @ManyToMany
    private Set<UserEntity> owners;

    @ManyToOne
    private PublisherEntity publishers;

    @Size(min = 1900)
    @Column(name = "publication_year")
    private Long publicationYear;

    @Column(name = "release")
    private int release = 1;
}
