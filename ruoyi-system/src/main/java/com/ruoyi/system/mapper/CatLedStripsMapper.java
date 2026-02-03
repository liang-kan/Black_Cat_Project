package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.CatLedStrips;

/**
 * 灯条库存 数据层
 * 
 * @author ruoyi
 */
public interface CatLedStripsMapper
{
    /**
     * 查询灯条库存信息
     * 
     * @param ledStrips 灯条库存信息
     * @return 灯条库存信息
     */
    public CatLedStrips selectLedStrips(CatLedStrips ledStrips);

    /**
     * 通过ID查询灯条库存
     * 
     * @param id 灯条库存ID
     * @return 灯条库存信息
     */
    public CatLedStrips selectLedStripsById(Long id);

    /**
     * 查询灯条库存列表
     * 
     * @param ledStrips 灯条库存信息
     * @return 灯条库存集合
     */
    public List<CatLedStrips> selectLedStripsList(CatLedStrips ledStrips);

    /**
     * 新增灯条库存
     * 
     * @param ledStrips 灯条库存信息
     * @return 结果
     */
    public int insertLedStrips(CatLedStrips ledStrips);

    /**
     * 修改灯条库存
     * 
     * @param ledStrips 灯条库存信息
     * @return 结果
     */
    public int updateLedStrips(CatLedStrips ledStrips);

    /**
     * 删除灯条库存
     * 
     * @param id 灯条库存ID
     * @return 结果
     */
    public int deleteLedStripsById(Long id);

    /**
     * 批量删除灯条库存
     * 
     * @param ids 需要删除的灯条库存ID
     * @return 结果
     */
    public int deleteLedStripsByIds(Long[] ids);
}