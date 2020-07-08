package com.evan.wj.new_service;

import com.evan.wj.new_dao.ChemicalDao;
import com.evan.wj.new_dao.ChemicalcategoryDao;
import com.evan.wj.new_pojo.Chemicalcategory;
import com.evan.wj.new_pojo.Chemicals;
import com.evan.wj.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChemicalService {

    @Autowired
    ChemicalDao chemicalDao;

    @Autowired
    ChemicalcategoryService chemicalcategoryService;

    //陈列
    public List<Chemicals> list() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return chemicalDao.findAll(sort);
    }

    //关键词模糊查询
    public List<Chemicals> Search(String keyword){
        return chemicalDao.findAllByChemicalnameLike("%"+keyword+"%");
    }
    //按类别查询
    public List<Chemicals> listByCategory(int cid){
        Chemicalcategory c = chemicalcategoryService.get(cid);
        return chemicalDao.findAllByChemicalcategory(c);
    }

    //按编号查询
    public List<Chemicals> listByNo(String chemicalNo){
        return chemicalDao.findAllByChemicalno(chemicalNo);
    }

    //添加或者修改
    public void addOrUpdate(Chemicals chemicals){
        System.out.println(chemicals.getChemicalname()+" "+chemicals.getChemicalcategory());
        chemicalDao.save(chemicals);
    }

    //删除
    public void deleteById(int cid){

        chemicalDao.deleteById(cid);
    }


}
