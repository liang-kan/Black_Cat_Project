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
import com.ruoyi.system.domain.CatTvs;
import com.ruoyi.system.service.ICatTvsService;

/**
 * 电视库存 信息操作处理
 * 
 * @author ruoyi
 */
@RestController
@RequestMapping("/system/tvs")
public class CatTvsController extends BaseController
{
    @Autowired
    private ICatTvsService tvsService;

    /**
     * 获取电视库存列表
     */
    @GetMapping("/list")
    public TableDataInfo list(CatTvs tvs)
    {
        startPage();
        List<CatTvs> list = tvsService.selectTvsList(tvs);
        return getDataTable(list);
    }

    @Log(title = "电视库存管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CatTvs tvs)
    {
        List<CatTvs> list = tvsService.selectTvsList(tvs);
        ExcelUtil<CatTvs> util = new ExcelUtil<CatTvs>(CatTvs.class);
        util.exportExcel(response, list, "电视库存数据");
    }

    /**
     * 根据电视库存ID获取详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable Long id)
    {
        return success(tvsService.selectTvsById(id));
    }

    /**
     * 新增电视库存
     */
    @Log(title = "电视库存管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CatTvs tvs)
    {
        tvs.setCreateBy(getUsername());
        return toAjax(tvsService.insertTvs(tvs));
    }

    /**
     * 修改电视库存
     */
    @Log(title = "电视库存管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CatTvs tvs)
    {
        tvs.setUpdateBy(getUsername());
        return toAjax(tvsService.updateTvs(tvs));
    }

    /**
     * 删除电视库存
     */
    @Log(title = "电视库存管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tvsService.deleteTvsByIds(ids));
    }
}