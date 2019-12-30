package pl.booker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.booker.model.entity.AuthorEntity;
import pl.booker.model.entity.RoleEntity;
import pl.booker.model.entity.UserEntity;

import javax.management.relation.Role;
import java.util.Set;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

    public Set<RoleEntity> getAllByUsers(UserEntity userEntity);

}
