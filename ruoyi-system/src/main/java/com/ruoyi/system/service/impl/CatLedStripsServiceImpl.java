package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.domain.BaseEntity;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.system.domain.CatLedStrips;
import com.ruoyi.system.mapper.CatLedStripsMapper;
import com.ruoyi.system.service.ICatLedStripsService;

/**
 * 灯条库存 服务层实现
 * 
 * @author ruoyi
 */
@Service
public class CatLedStripsServiceImpl implements ICatLedStripsService
{
    @Autowired
    private CatLedStripsMapper ledStripsMapper;

    /**
     * 查询灯条库存信息
     * 
     * @param id 灯条库存ID
     * @return 灯条库存信息
     */
    @Override
    public CatLedStrips selectLedStripsById(Long id)
    {
        return ledStripsMapper.selectLedStripsById(id);
    }

    /**
     * 查询灯条库存列表
     * 
     * @param ledStrips 灯条库存信息
     * @return 灯条库存集合
     */
    @Override
    public List<CatLedStrips> selectLedStripsList(CatLedStrips ledStrips)
    {
        return ledStripsMapper.selectLedStripsList(ledStrips);
    }

    /**
     * 新增灯条库存
     * 
     * @param ledStrips 灯条库存信息
     * @return 结果
     */
    @Override
    public int insertLedStrips(CatLedStrips ledStrips)
    {
        return ledStripsMapper.insertLedStrips(ledStrips);
    }

    /**
     * 修改灯条库存
     * 
     * @param ledStrips 灯条库存信息
     * @return 结果
     */
    @Override
    public int updateLedStrips(CatLedStrips ledStrips)
    {
        return ledStripsMapper.updateLedStrips(ledStrips);
    }

    /**
     * 批量删除灯条库存
     * 
     * @param ids 需要删除的灯条库存ID
     * @return 结果
     */
    @Override
    public int deleteLedStripsByIds(Long[] ids)
    {
        return ledStripsMapper.deleteLedStripsByIds(ids);
    }

    /**
     * 删除灯条库存信息
     * 
     * @param id 灯条库存ID
     * @return 结果
     */
    @Override
    public int deleteLedStripsById(Long id)
    {
        return ledStripsMapper.deleteLedStripsById(id);
    }
}