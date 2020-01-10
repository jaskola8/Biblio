package com.example.booker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.booker.model.entity.AuthorEntity;
import com.example.booker.model.entity.PublicationEntity;

import java.util.List;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {

    public List<AuthorEntity> getAllByPublications(PublicationEntity publicationEntity);
}
