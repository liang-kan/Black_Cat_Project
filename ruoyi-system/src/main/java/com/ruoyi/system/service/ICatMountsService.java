package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.CatMounts;

/**
 * 挂架库存 服务层
 * 
 * @author ruoyi
 */
public interface ICatMountsService
{
    /**
     * 查询挂架库存信息
     * 
     * @param id 挂架库存ID
     * @return 挂架库存信息
     */
    public CatMounts selectMountsById(Long id);

    /**
     * 查询挂架库存列表
     * 
     * @param mounts 挂架库存信息
     * @return 挂架库存集合
     */
    public List<CatMounts> selectMountsList(CatMounts mounts);

    /**
     * 新增挂架库存
     * 
     * @param mounts 挂架库存信息
     * @return 结果
     */
    public int insertMounts(CatMounts mounts);

    /**
     * 修改挂架库存
     * 
     * @param mounts 挂架库存信息
     * @return 结果
     */
    public int updateMounts(CatMounts mounts);

    /**
     * 批量删除挂架库存
     * 
     * @param ids 需要删除的挂架库存ID
     * @return 结果
     */
    public int deleteMountsByIds(Long[] ids);

    /**
     * 删除挂架库存信息
     * 
     * @param id 挂架库存ID
     * @return 结果
     */
    public int deleteMountsById(Long id);
}