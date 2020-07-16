package com.evan.wj.new_dao;

import com.evan.wj.new_pojo.Chemicalcategory;
import com.evan.wj.new_pojo.Org;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrgDao extends JpaRepository<Org,Integer> {
}
