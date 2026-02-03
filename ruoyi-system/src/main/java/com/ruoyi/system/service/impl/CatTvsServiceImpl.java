package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.system.domain.CatTvs;
import com.ruoyi.system.mapper.CatTvsMapper;
import com.ruoyi.system.service.ICatTvsService;

/**
 * 电视库存 服务层实现
 * 
 * @author ruoyi
 */
@Service
public class CatTvsServiceImpl implements ICatTvsService
{
    @Autowired
    private CatTvsMapper tvsMapper;

    /**
     * 查询电视库存信息
     * 
     * @param id 电视库存ID
     * @return 电视库存信息
     */
    @Override
    public CatTvs selectTvsById(Long id)
    {
        return tvsMapper.selectTvsById(id);
    }

    /**
     * 查询电视库存列表
     * 
     * @param tvs 电视库存信息
     * @return 电视库存集合
     */
    @Override
    public List<CatTvs> selectTvsList(CatTvs tvs)
    {
        return tvsMapper.selectTvsList(tvs);
    }

    /**
     * 新增电视库存
     * 
     * @param tvs 电视库存信息
     * @return 结果
     */
    @Override
    public int insertTvs(CatTvs tvs)
    {
        return tvsMapper.insertTvs(tvs);
    }

    /**
     * 修改电视库存
     * 
     * @param tvs 电视库存信息
     * @return 结果
     */
    @Override
    public int updateTvs(CatTvs tvs)
    {
        return tvsMapper.updateTvs(tvs);
    }

    /**
     * 批量删除电视库存
     * 
     * @param ids 需要删除的电视库存ID
     * @return 结果
     */
    @Override
    public int deleteTvsByIds(Long[] ids)
    {
        return tvsMapper.deleteTvsByIds(ids);
    }

    /**
     * 删除电视库存信息
     * 
     * @param id 电视库存ID
     * @return 结果
     */
    @Override
    public int deleteTvsById(Long id)
    {
        return tvsMapper.deleteTvsById(id);
    }
}