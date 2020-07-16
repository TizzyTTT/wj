package com.evan.wj.new_controller;

import com.evan.wj.new_pojo.Chemicals;
import com.evan.wj.new_service.ChemicalService;
import com.evan.wj.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

@RestController
public class ChemicalController {

    @Autowired
    ChemicalService chemicalService;


    //普通陈列危化品
    @GetMapping("api/chemical")
    public List<Chemicals> list() throws Exception{
        System.out.println("药品：展示所有内容");
        return chemicalService.list();
    }
    //查询
    @GetMapping("api/query")
    public List<Chemicals> searchResult(@RequestParam("keywords") String keywords) throws Exception{
        // 关键词为空时查询出所有药品
        System.out.println("查询出所有药品,关键词："+keywords);
        if ("".equals(keywords)) {
            return chemicalService.list();
        } else {
            return chemicalService.Search(keywords);
        }
    }

    //按照类别查询危化品
    @GetMapping("api/categories/{cid}/chemical")
    public List<Chemicals> listByCategory(@PathVariable("cid") int cid) throws Exception {
        System.out.println("按类别查询查询危化品 类别id"+cid);
        if (0 != cid) {
            return chemicalService.listByCategory(cid);
        } else {
            return list();
        }
    }

    //按照类别查询危化品 第二种方式
    @GetMapping("api/categories/chemical")
    public List<Chemicals> listByCategoryByParam(@RequestParam("cid") int cid) throws Exception {
        System.out.println("按类别查询查询危化品 类别id "+cid);
        if (0 != cid) {
            return chemicalService.listByCategory(cid);
        } else {
            return list();
        }
    }


    //添加危化品api
    @PostMapping("api/addchemical")
    public Chemicals add(@RequestBody Chemicals chemicals) throws Exception{
        System.out.println("药品：添加或修改药品");
    //注：修改药品时候，根据编号主键id修改
        chemicalService.add(chemicals);
        return chemicals;
    }
    //修改危化品api
    @PostMapping("api/updatechemical")
    public Chemicals Update(@RequestBody Chemicals chemicals) throws Exception{
        System.out.println("药品：添加或修改药品");
        //注：修改药品时候，根据编号主键id修改
        chemicalService.update(chemicals);
        return chemicals;
    }

    //删除危化品
    @PostMapping("api/deletechemical")
    public void delete(@RequestBody Chemicals chemicals) throws Exception {
        System.out.println("药品：根据id删除药品，药品id : "+chemicals.getId());
        chemicalService.deleteById(chemicals.getId());
    }

    //批量删除(没写出来)
    @PostMapping("api/deletesomechemical")
    public void deleteSome(@RequestBody List<Chemicals> ids) throws Exception{

        System.out.println("list length "+ ids.size()+" list first :"+ids.get(0));

        //chemicalService.deleteALot(ids);
    }


}
