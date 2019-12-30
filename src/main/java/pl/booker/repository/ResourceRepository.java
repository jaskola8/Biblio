package pl.booker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.booker.model.entity.PublicationEntity;
import pl.booker.model.entity.ResourceEntity;

import java.util.Set;
import java.util.UUID;

@Repository
public interface ResourceRepository extends JpaRepository<ResourceEntity, UUID> {

    public Set<ResourceEntity> getAllByPublicationEntities(PublicationEntity publicationEntity);

}
