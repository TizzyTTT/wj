package com.evan.wj.new_dao;

import com.evan.wj.new_pojo.Chemicalcategory;
import com.evan.wj.new_pojo.Chemicals;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChemicalDao extends JpaRepository<Chemicals,Integer> {

    List<Chemicals> findAllByChemicalnameLike(String name);

    List<Chemicals> findAllByChemicalno(String no);

    List<Chemicals> findAllByChemicalcategory(Chemicalcategory category);
}
