package slides.debugging;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserDatabase implements UserDataAccess {

    List<UserData> users = new ArrayList<>();

    @Override
    public void store(UserData data) {
        if (data.getUserId() == null) {
            throw new IllegalArgumentException("Cannot store a user without id");
        }
        users.add(data);
        System.out.println("New user is stored");
        System.out.println(data);
    }
}
