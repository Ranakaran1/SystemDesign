package Entities;

import java.util.List;

public class UserController {
    List<User> userList;

    UserController(List<User> user){
        this.userList = user;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void addUser(User user) {
        this.userList.add(user);
    }
    public void removeUser(User user) {
        this.userList.remove(user);
    }

    public User getUser(int userId){
        for(User user : userList){
            if(user.getUserID() == userId){
                return user;
            }
        }
        return null;
    }

    
    
}
