package com.evan.wj.new_controller;

import com.evan.wj.new_pojo.Chemicals;
import com.evan.wj.new_service.ChemicalService;
import com.evan.wj.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChemicalController {

    @Autowired
    ChemicalService chemicalService;

    //普通陈列危化品
    @GetMapping("api/chemical")
    public List<Chemicals> list() throws Exception{
        return chemicalService.list();
    }

    //添加危化品api
    @PostMapping("api/chemical")
    public Chemicals addOrUpdate(@RequestBody Chemicals chemicals) throws Exception{
        chemicalService.addOrUpdate(chemicals);
        return chemicals;
    }

    //删除危化品
    @PostMapping("api/deletechemical")
    public void delete(@RequestBody Chemicals chemicals) throws Exception {

        System.out.println("chemicals.getId : "+chemicals.getId());
        chemicalService.deleteById(chemicals.getId());
    }

    //查询
    @GetMapping("api/query")
    public List<Chemicals> searchResult(@RequestParam("keywords") String keywords) throws Exception{
        // 关键词为空时查询出所有药品
        if ("".equals(keywords)) {
            return chemicalService.list();
        } else {
            return chemicalService.Search(keywords);
        }
    }

    //按照类别查询危化品
    @GetMapping("api/categories/{cid}/chemical")
    public List<Chemicals> listByCategory(@PathVariable("cid") int cid) throws Exception {
        if (0 != cid) {
            return chemicalService.listByCategory(cid);
        } else {
            return list();
        }
    }

}
