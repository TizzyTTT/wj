package com.evan.wj.new_service;

import com.evan.wj.new_dao.OrgDao;
import com.evan.wj.new_pojo.Org;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrgService {

    @Autowired
    OrgDao orgDao;

    public Org get(int orgid){
        Org org = orgDao.findById(orgid).orElse(null);
        return org;
    }



}
