package com.qingcheng.service.goods;

import com.qingcheng.entity.PageResult;
import com.qingcheng.pojo.goods.Brand;

import java.util.List;
import java.util.Map;

/**
 * @author Summerday
 */
public interface BrandService {
    /**
     * 查询全部Brands
     *
     * @return brands列表
     */
    public List<Brand> findAll();

    /**
     * 分页查询
     *
     * @param page 第几页
     * @param size 每页记录数
     * @return 分页结果
     */
    public PageResult<Brand> findPage(int page, int size);

    /**
     * 按条件查询
     *
     * @param searchMap 条件map
     * @return brand列表
     */
    public List<Brand> findList(Map<String, Object> searchMap);

    /**
     * 分页查询+条件查询
     *
     * @param searchMap 条件map
     * @param page      页码
     * @param size      每页记录数
     * @return 列表
     */
    public PageResult<Brand> findList(Map<String, Object> searchMap, int page, int size);


    /**
     * 根据id查询品牌
     *
     * @param id 主键id
     * @return 品牌
     */
    public Brand findById(Integer id);

    /**
     * 新增品牌
     *
     * @param brand 新增品牌
     */
    public void add(Brand brand);

    /**
     * 修改品牌
     *
     * @param brand 新品牌
     */
    int update(Brand brand);

    /**
     * 删除品牌
     * @param id 品牌id
     */
    int delete(Integer id);
}
