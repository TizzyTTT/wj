package com.evan.wj.new_service;

import com.evan.wj.new_dao.ChemicalcategoryDao;
import com.evan.wj.new_pojo.Chemicalcategory;
import com.evan.wj.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChemicalcategoryService {

    @Autowired
    ChemicalcategoryDao chemicalcategoryDao;

    public List<Chemicalcategory> list() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return chemicalcategoryDao.findAll(sort);
    }

    public Chemicalcategory get(int id) {
        Chemicalcategory c = chemicalcategoryDao.findById(id).orElse(null);
        return c;
    }

}
