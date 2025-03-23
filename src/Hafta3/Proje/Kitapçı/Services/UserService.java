package Hafta3.Proje.Kitapçı.Services;

import Hafta3.Proje.Kitapçı.Model.User;

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




}
