package com.example.booker.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.booker.model.entity.RoleEntity;
import com.example.booker.model.entity.UserEntity;

import java.util.Set;

public interface UserRepository extends JpaRepository<UserEntity, String> {

    @Query("select u from UserEntity u inner join u.roles r where r.name in :roles")
    public Set<UserEntity> findBySpecifiedRoles(@Param("roles") Set<RoleEntity> roles);

}
