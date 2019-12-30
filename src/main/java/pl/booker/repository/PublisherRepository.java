package pl.booker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.booker.model.entity.PublicationEntity;
import pl.booker.model.entity.PublisherEntity;

import java.util.Set;

@Repository
public interface PublisherRepository extends JpaRepository<PublisherEntity, String> {

    public Set<PublisherEntity> getAllByPublications(PublicationEntity publicationEntity);

}
