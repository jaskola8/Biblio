package pl.booker.services.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import pl.booker.model.entity.UserEntity;
import pl.booker.model.form.NewPassForm;
import pl.booker.model.form.NewUserForm;
import pl.booker.repository.UserRepository;
import pl.booker.services.UserService;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public UserEntity findUserByUsername(String username) {
        return userRepository.findById(username).orElse(null);
    }

    @Override
    @Transactional
    public List<UserEntity> findUserByParams(UserEntity userEntity) {
        Example<UserEntity> example = Example.of(userEntity, ExampleMatcher.matchingAny());
        return userRepository.findAll(example);
    }

    @Override
    @Transactional
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public UserEntity saveNewUser(NewUserForm newUserForm) {
        return null;
    }

    @Override
    public UserEntity saveNewPassword(NewPassForm newPassForm) {
        return null;
    }

    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        return null;
    }

    @Override
    public void deleteUser(String username) {

    }
}
