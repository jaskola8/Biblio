package com.example.booker.services;

import com.example.booker.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import com.example.booker.model.entity.UserEntity;
import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
public class UserService {

    private final UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public UserEntity findUserByUsername(String username) {
        return userRepository.findById(username).orElse(null);
    }

    @Transactional
    public List<UserEntity> findUserByParams(UserEntity userEntity) {
        Example<UserEntity> example = Example.of(userEntity, ExampleMatcher.matchingAny());
        return userRepository.findAll(example);
    }

    @Transactional
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public UserEntity saveUser(UserEntity userEntity) {
        return null;
    }

    public void deleteUser(String username) {

    }
}
