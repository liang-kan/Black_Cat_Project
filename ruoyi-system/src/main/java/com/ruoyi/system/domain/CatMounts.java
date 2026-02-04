package com.ruoyi.system.domain;

import java.math.BigDecimal;
import lombok.Data;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.annotation.Excel.ColumnType;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 挂架库存表 cat_mounts
 * 
 * @author ruoyi
 */
@Data
public class CatMounts extends BaseEntity
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

    /** 类型 */
    @Excel(name = "类型")
    private String mountType;

    /** 最大承重(KG) */
    @Excel(name = "最大承重(KG)", cellType = ColumnType.NUMERIC, scale = 2)
    private BigDecimal maxLoadKg;

    /** 适用尺寸范围 */
    @Excel(name = "适用尺寸范围")
    private String fitsSizeRange;

    /** VESA孔距 */
    @Excel(name = "VESA孔距")
    private String vesaStandard;

    /** 钢材厚度 */
    @Excel(name = "钢材厚度", cellType = ColumnType.NUMERIC, scale = 2)
    private BigDecimal steelThickness;

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