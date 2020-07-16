package com.evan.wj.new_dao;

import com.evan.wj.new_pojo.Chemicalcategory;
import com.evan.wj.new_pojo.Chemicals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ChemicalDao extends JpaRepository<Chemicals,Integer> {

    List<Chemicals> findAllByChemicalnameLike(String name);

    List<Chemicals> findAllByChemicalno(String no);

    List<Chemicals> findAllByChemicalcategory(Chemicalcategory category);

//    // 注意更新和删除是需要加事务的， 并且要加上 @Modify的注解
//    @Modifying
//    @Transactional
//    @Query("delete from Chemicals c where c.id in (?1)")
//    void deleteBatch1(List<Integer> ids);

    void deleteChemicalsByIdIn(List<Integer> ids);

}
