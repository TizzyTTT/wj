package com.evan.wj.new_service;

import com.evan.wj.new_dao.New_UserDao;
import com.evan.wj.new_pojo.Org;
import com.evan.wj.new_pojo.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class New_UserService {
    @Autowired
    New_UserDao userDAO;

    @Autowired
    OrgService orgService;

    @PersistenceContext
    public EntityManager em;

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

    @Transactional
    public void modify(Userinfo user){
        Userinfo New_user = em.find(Userinfo.class, user.getId());
        if(New_user == null){
            System.out.println("没有这个实体");
        }else {
            System.out.println("找到实体正在修改");
            em.persist(user);
            System.out.println("已经修改完成");
        }
    }

    public void delete(int id){ userDAO.deleteById(id); }

    public List<Userinfo> querybyNoOrName(String key){
        return userDAO.queryAllByUsernoOrRealname(key);
    }

    public List<Userinfo> querybyOrgid(int orgid){
        Org o = orgService.get(orgid);
        return userDAO.queryAllByOrg(o);
    }

}
