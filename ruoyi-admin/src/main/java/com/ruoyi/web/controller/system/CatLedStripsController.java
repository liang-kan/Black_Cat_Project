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
import com.ruoyi.system.domain.CatLedStrips;
import com.ruoyi.system.service.ICatLedStripsService;

/**
 * 灯条库存 信息操作处理
 * 
 * @author ruoyi
 */
@RestController
@RequestMapping("/system/ledStrips")
public class CatLedStripsController extends BaseController
{
    @Autowired
    private ICatLedStripsService ledStripsService;

    /**
     * 获取灯条库存列表
     */
    @GetMapping("/list")
    public TableDataInfo list(CatLedStrips ledStrips)
    {
        startPage();
        List<CatLedStrips> list = ledStripsService.selectLedStripsList(ledStrips);
        return getDataTable(list);
    }

    @Log(title = "灯条库存管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CatLedStrips ledStrips)
    {
        List<CatLedStrips> list = ledStripsService.selectLedStripsList(ledStrips);
        ExcelUtil<CatLedStrips> util = new ExcelUtil<CatLedStrips>(CatLedStrips.class);
        util.exportExcel(response, list, "灯条库存数据");
    }

    /**
     * 根据灯条库存ID获取详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable Long id)
    {
        return success(ledStripsService.selectLedStripsById(id));
    }

    /**
     * 新增灯条库存
     */
    @Log(title = "灯条库存管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CatLedStrips ledStrips)
    {
        ledStrips.setCreateBy(getUsername());
        return toAjax(ledStripsService.insertLedStrips(ledStrips));
    }

    /**
     * 修改灯条库存
     */
    @Log(title = "灯条库存管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CatLedStrips ledStrips)
    {
        ledStrips.setUpdateBy(getUsername());
        return toAjax(ledStripsService.updateLedStrips(ledStrips));
    }

    /**
     * 删除灯条库存
     */
    @Log(title = "灯条库存管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(ledStripsService.deleteLedStripsByIds(ids));
    }
}