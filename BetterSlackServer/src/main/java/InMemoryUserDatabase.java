import java.util.*;

public class InMemoryUserDatabase implements UserRepository {
    private static Set<User> users = new HashSet<>();

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public Optional<User> find(String username) {
        return users.stream().filter(user -> user.getUsername().equals(username)).findAny();
    }
}
