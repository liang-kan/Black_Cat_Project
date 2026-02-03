package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.CatMounts;
import com.ruoyi.system.service.ICatMountsService;

/**
 * 挂架库存 信息操作处理
 * 
 * @author ruoyi
 */
@RestController
@RequestMapping("/system/mounts")
public class CatMountsController extends BaseController
{
    @Autowired
    private ICatMountsService mountsService;

    /**
     * 获取挂架库存列表
     */
    @GetMapping("/list")
    public TableDataInfo list(CatMounts mounts)
    {
        startPage();
        List<CatMounts> list = mountsService.selectMountsList(mounts);
        return getDataTable(list);
    }

    @Log(title = "挂架库存管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CatMounts mounts)
    {
        List<CatMounts> list = mountsService.selectMountsList(mounts);
        ExcelUtil<CatMounts> util = new ExcelUtil<CatMounts>(CatMounts.class);
        util.exportExcel(response, list, "挂架库存数据");
    }

    /**
     * 根据挂架库存ID获取详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable Long id)
    {
        return success(mountsService.selectMountsById(id));
    }

    /**
     * 新增挂架库存
     */
    @Log(title = "挂架库存管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CatMounts mounts)
    {
        mounts.setCreateBy(getUsername());
        return toAjax(mountsService.insertMounts(mounts));
    }

    /**
     * 修改挂架库存
     */
    @Log(title = "挂架库存管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CatMounts mounts)
    {
        mounts.setUpdateBy(getUsername());
        return toAjax(mountsService.updateMounts(mounts));
    }

    /**
     * 删除挂架库存
     */
    @Log(title = "挂架库存管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mountsService.deleteMountsByIds(ids));
    }
}