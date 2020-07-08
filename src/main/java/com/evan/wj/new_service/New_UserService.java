package com.evan.wj.new_service;

import com.evan.wj.new_dao.New_UserDao;
import com.evan.wj.new_pojo.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class New_UserService {
    @Autowired
    New_UserDao userDAO;

    public boolean isExist(String username) {
        Userinfo user = getByName(username);
        return null!=user;
    }

    public Userinfo getByName(String username) {
        return userDAO.findByUsername(username);
    }

    public Userinfo get(String username, String password){
        return userDAO.getByUsernameAndPassword(username, password);
    }

    public void add(Userinfo user) {
        userDAO.save(user);
    }
}
