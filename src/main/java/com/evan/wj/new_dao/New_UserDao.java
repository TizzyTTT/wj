package com.evan.wj.new_dao;

import com.evan.wj.new_pojo.Userinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface New_UserDao extends JpaRepository<Userinfo,Integer> {

    Userinfo findByUsername(String username);

    Userinfo getByUsernameAndPassword(String username,String password);


}
