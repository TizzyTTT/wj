package com.evan.wj.new_dao;

import com.evan.wj.new_pojo.Org;
import com.evan.wj.new_pojo.Userinfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface New_UserDao extends JpaRepository<Userinfo,Integer> {

    Userinfo findByUsername(String username);

    Userinfo getByUsernameAndPassword(String username,String password);

    List<Userinfo> queryAllByUsernoOrRealname(String key);

    List<Userinfo> queryAllByOrg(Org org);


}
