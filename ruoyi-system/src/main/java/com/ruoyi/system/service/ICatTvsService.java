package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.CatTvs;

/**
 * 电视库存 服务层
 * 
 * @author ruoyi
 */
public interface ICatTvsService
{
    /**
     * 查询电视库存信息
     * 
     * @param id 电视库存ID
     * @return 电视库存信息
     */
    public CatTvs selectTvsById(Long id);

    /**
     * 查询电视库存列表
     * 
     * @param tvs 电视库存信息
     * @return 电视库存集合
     */
    public List<CatTvs> selectTvsList(CatTvs tvs);

    /**
     * 新增电视库存
     * 
     * @param tvs 电视库存信息
     * @return 结果
     */
    public int insertTvs(CatTvs tvs);

    /**
     * 修改电视库存
     * 
     * @param tvs 电视库存信息
     * @return 结果
     */
    public int updateTvs(CatTvs tvs);

    /**
     * 批量删除电视库存
     * 
     * @param ids 需要删除的电视库存ID
     * @return 结果
     */
    public int deleteTvsByIds(Long[] ids);

    /**
     * 删除电视库存信息
     * 
     * @param id 电视库存ID
     * @return 结果
     */
    public int deleteTvsById(Long id);
}