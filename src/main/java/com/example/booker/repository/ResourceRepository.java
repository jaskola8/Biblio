package com.example.booker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.booker.model.entity.PublicationEntity;
import com.example.booker.model.entity.ResourceEntity;

import java.util.Set;
import java.util.UUID;

public interface ResourceRepository extends JpaRepository<ResourceEntity, Long> {

    public Set<ResourceEntity> getAllByPublicationEntities(PublicationEntity publicationEntity);

}
