package com.ruoyi.system.domain;

import java.math.BigDecimal;
import lombok.Data;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.annotation.Excel.ColumnType;

/**
 * 灯条库存表 cat_led_strips
 * 
 * @author ruoyi
 */
@Data
public class CatLedStrips
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    @Excel(name = "主键ID", cellType = ColumnType.NUMERIC)
    private Long id;

    /** 物品名称 */
    @Excel(name = "物品名称")
    private String name;

    /** 品牌 */
    @Excel(name = "品牌")
    private String brand;

    /** 是否侧光式灯条 */
    @Excel(name = "是否侧光式灯条", readConverterExp = "0=非侧光,1=侧光")
    private Integer isSideLight;

    /** 电压 */
    @Excel(name = "电压")
    private String voltage;

    /** 长度(cm) */
    @Excel(name = "长度(cm)", cellType = ColumnType.NUMERIC)
    private BigDecimal lengthMeters;

    /** 色温/颜色 */
    @Excel(name = "色温/颜色")
    private String colorTemp;

    /** 插口类型 */
    @Excel(name = "插口类型")
    private String socketType;

    /** 屏幕品牌 */
    @Excel(name = "屏幕品牌")
    private String screenBrand;

    /** 灯距 */
    @Excel(name = "灯距", cellType = ColumnType.NUMERIC, scale = 2)
    private BigDecimal lampSpacing;

    /** 型号 */
    @Excel(name = "型号")
    private String model;

    /** 插口大小 */
    @Excel(name = "插口大小")
    private String socketSize;

    /** 插口位置 */
    @Excel(name = "插口位置")
    private String socketSite;

    /** 当前库存数量 */
    @Excel(name = "当前库存数量", cellType = ColumnType.NUMERIC)
    private Integer stockQuantity;

    /** 单价 */
    @Excel(name = "单价", cellType = ColumnType.NUMERIC, scale = 2)
    private BigDecimal unitPrice;

    /** 仓库位置/货架号 */
    @Excel(name = "仓库位置/货架号")
    private String warehouseLocation;

    /** 状态 */
    @Excel(name = "状态", readConverterExp = "1=正常,0=下架")
    private Integer status;

    /** 删除标志 */
    private String delFlag;

    /** 创建者 */
    private String createBy;

    /** 创建时间 */
    private java.util.Date createTime;

    /** 更新者 */
    private String updateBy;

    /** 更新时间 */
    private java.util.Date updateTime;

    /** 备注 */
    @Excel(name = "备注")
    private String remark;
}