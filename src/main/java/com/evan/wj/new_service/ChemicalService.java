package com.evan.wj.new_service;

import com.evan.wj.new_dao.ChemicalDao;
import com.evan.wj.new_dao.ChemicalcategoryDao;
import com.evan.wj.new_pojo.Chemicalcategory;
import com.evan.wj.new_pojo.Chemicals;
import com.evan.wj.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class ChemicalService {

    @Autowired
    ChemicalDao chemicalDao;

    @PersistenceContext
    private EntityManager em;

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
        System.out.println(c.getCname());
        return chemicalDao.findAllByChemicalcategory(c);
    }

    //按编号查询
    public List<Chemicals> listByNo(String chemicalNo){
        return chemicalDao.findAllByChemicalno(chemicalNo);
    }

    //添加
    public void add(Chemicals chemicals){
        System.out.println(chemicals.getChemicalname()+" "+chemicals.getChemicalcategory());
        chemicalDao.save(chemicals);
    }

    //修改，涉及到业务需要加注释，EntityManager可以自由处理实体关系
    @Transactional
    public void update(Chemicals chemicals){
        System.out.println(chemicals.getChemicalname()+" "+chemicals.getChemicalcategory());
        Chemicals New_Chemical = em.find(Chemicals.class,chemicals.getId());
        if(New_Chemical == null){
            System.out.println("没有这个实体");
        }else {
            System.out.println("找到实体正在修改");
            New_Chemical.setChemicalno(chemicals.getChemicalno());
            New_Chemical.setChemicalcategory(chemicals.getChemicalcategory());
            New_Chemical.setChemicalname(chemicals.getChemicalname());
            // 是不是可以通过  New_Chemical = chemicals 替代
            em.persist(New_Chemical);
            System.out.println("已经修改完成");
        }
    }

    //删除
    public void deleteById(int cid){
        chemicalDao.deleteById(cid);
    }

    //批量删除
    public void deleteALot(List<Integer> ids){
        chemicalDao.deleteChemicalsByIdIn(ids);
    }


}
