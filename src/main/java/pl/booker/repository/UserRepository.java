package pl.booker.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.booker.model.entity.UserEntity;

import java.util.Set;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

    public Set<UserEntity> getAllByRolesEquals(Set<String> roles);

}
