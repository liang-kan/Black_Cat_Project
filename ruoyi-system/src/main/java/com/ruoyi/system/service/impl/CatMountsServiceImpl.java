package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.system.domain.CatMounts;
import com.ruoyi.system.mapper.CatMountsMapper;
import com.ruoyi.system.service.ICatMountsService;

/**
 * 挂架库存 服务层实现
 * 
 * @author ruoyi
 */
@Service
public class CatMountsServiceImpl implements ICatMountsService
{
    @Autowired
    private CatMountsMapper mountsMapper;

    /**
     * 查询挂架库存信息
     * 
     * @param id 挂架库存ID
     * @return 挂架库存信息
     */
    @Override
    public CatMounts selectMountsById(Long id)
    {
        return mountsMapper.selectMountsById(id);
    }

    /**
     * 查询挂架库存列表
     * 
     * @param mounts 挂架库存信息
     * @return 挂架库存集合
     */
    @Override
    public List<CatMounts> selectMountsList(CatMounts mounts)
    {
        return mountsMapper.selectMountsList(mounts);
    }

    /**
     * 新增挂架库存
     * 
     * @param mounts 挂架库存信息
     * @return 结果
     */
    @Override
    public int insertMounts(CatMounts mounts)
    {
        return mountsMapper.insertMounts(mounts);
    }

    /**
     * 修改挂架库存
     * 
     * @param mounts 挂架库存信息
     * @return 结果
     */
    @Override
    public int updateMounts(CatMounts mounts)
    {
        return mountsMapper.updateMounts(mounts);
    }

    /**
     * 批量删除挂架库存
     * 
     * @param ids 需要删除的挂架库存ID
     * @return 结果
     */
    @Override
    public int deleteMountsByIds(Long[] ids)
    {
        return mountsMapper.deleteMountsByIds(ids);
    }

    /**
     * 删除挂架库存信息
     * 
     * @param id 挂架库存ID
     * @return 结果
     */
    @Override
    public int deleteMountsById(Long id)
    {
        return mountsMapper.deleteMountsById(id);
    }
}