package pl.booker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.booker.model.entity.PublicationEntity;

@Repository
public interface DocumentRepository extends JpaRepository <PublicationEntity, String> {

}
