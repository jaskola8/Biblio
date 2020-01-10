package com.example.booker.repository;

import com.example.booker.model.entity.RoleEntity;
import com.example.booker.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

    public Set<RoleEntity> getAllByUsers(UserEntity userEntity);

}
