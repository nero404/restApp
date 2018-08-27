package com.rob.Testowy2.service;

import com.rob.Testowy2.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService {
    private static final AtomicLong counter = new AtomicLong();

    private static List<User> users;

    static{
       // users= populateUsers();
        users = new ArrayList<User>();
    }
    public List<User> findAllUsers() {
        return users;
    }

    public User findUserById(int id) {
        for (User user : users) {
            if (user.getId() == id)
                return user;
        }
        return null;
    }

    public void deleteUserById(int id) {


        for(Iterator<User> it = users.iterator(); it.hasNext();) {
            User user = it.next();
            if (user.getId() == id)
                it.remove();
        }
    }

    public void updateUser(User user){
        int indexUser = users.indexOf(user);
        users.set(indexUser, user);
    }

    public void saveUser(User user){
        user.setId(counter.incrementAndGet());
        users.add(user);
    }


    public static List<User>  populateUsers(){
        List<User> users = new ArrayList<User>();
        users.add(new User(counter.incrementAndGet(), "mietek", 15));
        users.add(new User(counter.incrementAndGet(), "Czesiu", 15));
        users.add(new User(counter.incrementAndGet(), "wiesiek", 15));

        return users;
    }






}
