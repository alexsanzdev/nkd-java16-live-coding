package slides.debugging;

import java.util.UUID;

public class UserController {

    private UserDataAccess userDataAccess;

    public UserController(UserDataAccess userDataAccess) {
        this.userDataAccess = userDataAccess;
    }

    public void addNewUser(String username, String firstName, String lastName, boolean admin) {
        validate(username, firstName, lastName, admin);

        UserData user = new UserData();
        user.setUserId(UUID.randomUUID().toString());
        user.setUsername(username);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAdmin(admin);

        userDataAccess.store(user);
    }

    private void validate(String username, String firstName, String lastName, boolean admin) {
        if (username == null || username.trim().length() == 0)
            throw new ValidationException("Username can not be blank");
        if (firstName == null || firstName.trim().length() == 0)
            throw new ValidationException("First name can not be blank");
        if (lastName == null || lastName.trim().length() == 0)
            throw new ValidationException("Last name can not be blank");
    }
}
