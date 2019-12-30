package pl.booker.services;

import pl.booker.model.entity.UserEntity;
import pl.booker.model.form.NewPassForm;
import pl.booker.model.form.NewUserForm;

import java.util.List;

public interface UserService {

    UserEntity findUserByUsername(String username);

    List<UserEntity> findUserByParams(UserEntity userEntity);

    List<UserEntity> getAllUsers();

    UserEntity saveNewUser(NewUserForm userForm);

    UserEntity saveNewPassword(NewPassForm newPassForm);

    UserEntity saveUser(UserEntity userEntity);

    void deleteUser(String username);
}
