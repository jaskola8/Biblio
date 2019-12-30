package pl.booker.model.form;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NewUserForm {

    private String username;
    private String password;
    private String repPassword;

    private String firstName;
    private String lastName;

}
