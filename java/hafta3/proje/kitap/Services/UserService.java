package hafta3.proje.kitap.Services;

import hafta3.proje.kitap.Model.User;

import java.util.HashSet;
import java.util.Set;

public class UserService {

    private static Set<User> users = new HashSet<>();

    public void createUser(String name, String email, String password){

        User user = new User(name, email, password);
        users.add(user);
        System.out.println("Kullanıcı başarıyla eklendi: " + email);
    }

    public void listUsers(){
        for (User user : users){
            System.out.println(user.getName() +" -> "+ user.getEmail() +"");

        }
    }

    public User findUser(String name){
        for (User user : users){
            if (user.getEmail().equals(user)){
                return user;
            }
        }
        return null;
    }

    public User findEmail(String email){
        User user1 = null;
        for (User user : users){
            if (user.getEmail().equals(email)){
                user1 = user;
                return user1;
            }
        }
        return null;
    }
}
