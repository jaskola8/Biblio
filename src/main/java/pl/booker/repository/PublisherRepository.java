package pl.booker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.booker.model.entity.PublisherEntity;

@Repository
public interface PublisherRepository extends JpaRepository<PublisherEntity, String> {

}
