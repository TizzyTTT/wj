package com.evan.wj.new_dao;

import com.evan.wj.new_pojo.Chemicalcategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChemicalcategoryDao extends JpaRepository<Chemicalcategory,Integer> {
}
