package com.qingcheng.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qingcheng.entity.PageResult;
import com.qingcheng.entity.Result;
import com.qingcheng.pojo.goods.Brand;
import com.qingcheng.service.goods.BrandService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author Summerday
 */

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Reference
    private BrandService brandService;

    @GetMapping("/findAll")
    public List<Brand> findAll() {
        return brandService.findAll();
    }

    @GetMapping("/findPage")
    public PageResult<Brand> findPage(int page, int size) {
        return brandService.findPage(page, size);
    }

    @PostMapping("/findList")
    public List<Brand> findList(@RequestBody Map<String, Object> searchMap) {
        return brandService.findList(searchMap);
    }

    @PostMapping("/findPage")
    //http://localhost:9101/brand/findPage.do?page=1&size=5
    //body{"name":"","letter":"F"}
    public PageResult<Brand> findList(@RequestBody Map<String, Object> searchMap, int page, int size) {
        return brandService.findList(searchMap, page, size);
    }

    @GetMapping("/findById")
    public Brand findById(Integer id) {
        return brandService.findById(id);
    }

    @PostMapping("/add")
    public Result add(@RequestBody Brand brand) {
        brandService.add(brand);
        return new Result("新增成功");
    }

    @PostMapping("/update")
    public Result update(@RequestBody Brand brand) {
        if(brandService.update(brand) == 0){
            return new Result(1,"更新失败");
        }
        return new Result("更新成功");
    }

    @GetMapping("/delete")
    public Result delete(Integer id) {
        if (brandService.delete(id) == 0) {
            return new Result(1, "删除失败");
        }
        return new Result("删除成功");
    }
}
