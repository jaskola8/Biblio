package pl.booker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.booker.model.entity.AuthorEntity;
import pl.booker.model.entity.RoleEntity;

import javax.management.relation.Role;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

}
