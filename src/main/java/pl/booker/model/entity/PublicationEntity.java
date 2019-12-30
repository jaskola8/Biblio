package pl.booker.model.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.ISBN;

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
public class PublicationEntity {

    @Id
    private ISBN id;

    @NotBlank
    @Min(3)
    private String title;

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
    private Year publicationYear;

    private int release = 1;
}
