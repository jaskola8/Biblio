package com.example.booker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.booker.model.entity.PublicationEntity;
import com.example.booker.model.entity.PublisherEntity;

import java.util.Set;

public interface PublisherRepository extends JpaRepository<PublisherEntity, Long> {

    public Set<PublisherEntity> getAllByPublications(PublicationEntity publicationEntity);

}
