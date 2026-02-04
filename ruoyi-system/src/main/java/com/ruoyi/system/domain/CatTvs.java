package com.ruoyi.system.domain;

import java.math.BigDecimal;
import lombok.Data;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.annotation.Excel.ColumnType;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 电视库存表 cat_tvs
 * 
 * @author ruoyi
 */
@Data
public class CatTvs extends BaseEntity
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

    /** 型号/SKU */
    @Excel(name = "型号/SKU")
    private String model;

    /** 屏幕尺寸(英寸) */
    @Excel(name = "屏幕尺寸(英寸)", cellType = ColumnType.NUMERIC, scale = 1)
    private BigDecimal screenSize;

    /** 分辨率 */
    @Excel(name = "分辨率")
    private String resolution;

    /** 全面屏标志 */
    @Excel(name = "全面屏标志", readConverterExp = "0=是,1=不是")
    private String haveFrame;

    /** 面板类型 */
    @Excel(name = "面板类型")
    private String panelType;

    /** 接口信息 */
    @Excel(name = "接口信息")
    private String portInfo;

    /** 能否上网 */
    @Excel(name = "能否上网", readConverterExp = "0=能,2=不能")
    private String isInternet;

    /** 瑕疵点 */
    @Excel(name = "瑕疵点")
    private String flaw;

    /** 能效等级 */
    @Excel(name = "能效等级")
    private String energyRating;

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
}