package pl.booker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.booker.model.entity.AuthorEntity;
import pl.booker.model.entity.PublicationEntity;
import pl.booker.model.entity.UserEntity;

import java.util.Set;

@Repository
public interface PublicationRepository extends JpaRepository <PublicationEntity, String> {

    public Set<PublicationEntity> getAllByOwners(UserEntity userEntity);

    public Set<PublicationEntity> getAllByAuthors(AuthorEntity authorEntity);

}
