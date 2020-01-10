package com.example.booker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.booker.model.entity.AuthorEntity;
import com.example.booker.model.entity.PublicationEntity;
import com.example.booker.model.entity.UserEntity;

import java.util.List;

public interface PublicationRepository extends JpaRepository<PublicationEntity, Long> {

    public List<PublicationEntity> getAllByOwners(UserEntity userEntity);

    public List<PublicationEntity> getAllByAuthors(AuthorEntity authorEntity);

    public PublicationEntity getById(Long id);
}
