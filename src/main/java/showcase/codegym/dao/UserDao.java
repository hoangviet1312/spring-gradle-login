package showcase.codegym.dao;

import showcase.codegym.model.Login;
import showcase.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAccount("john");
        u1.setName("John");
        u1.setAge(10);
        u1.setEmail("john@codegym.vn");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User();
        u2.setAccount("nghiem");
        u2.setName("Nghiem");
        u2.setAge(27);
        u2.setEmail("nghiem@codegym.vn");
        u2.setPassword("654321");
        users.add(u2);

        User u3 = new User();
        u3.setAccount("viet");
        u3.setName("Viet");
        u3.setAge(24);
        u3.setEmail("viet@codegym.vn");
        u3.setPassword("615243");
        users.add(u3);
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())) {
                return u;
            }
        }
        return null;
    }
}
