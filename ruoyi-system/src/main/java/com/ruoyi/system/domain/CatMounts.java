package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.annotation.Excel.ColumnType;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 挂架库存表 cat_mounts
 * 
 * @author ruoyi
 */
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

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getMountType()
    {
        return mountType;
    }

    public void setMountType(String mountType)
    {
        this.mountType = mountType;
    }

    public BigDecimal getMaxLoadKg()
    {
        return maxLoadKg;
    }

    public void setMaxLoadKg(BigDecimal maxLoadKg)
    {
        this.maxLoadKg = maxLoadKg;
    }

    public String getFitsSizeRange()
    {
        return fitsSizeRange;
    }

    public void setFitsSizeRange(String fitsSizeRange)
    {
        this.fitsSizeRange = fitsSizeRange;
    }

    public String getVesaStandard()
    {
        return vesaStandard;
    }

    public void setVesaStandard(String vesaStandard)
    {
        this.vesaStandard = vesaStandard;
    }

    public BigDecimal getSteelThickness()
    {
        return steelThickness;
    }

    public void setSteelThickness(BigDecimal steelThickness)
    {
        this.steelThickness = steelThickness;
    }

    public Integer getStockQuantity()
    {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity)
    {
        this.stockQuantity = stockQuantity;
    }

    public BigDecimal getUnitPrice()
    {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice)
    {
        this.unitPrice = unitPrice;
    }

    public String getWarehouseLocation()
    {
        return warehouseLocation;
    }

    public void setWarehouseLocation(String warehouseLocation)
    {
        this.warehouseLocation = warehouseLocation;
    }

    public Integer getStatus()
    {
        return status;
    }

    public void setStatus(Integer status)
    {
        this.status = status;
    }

    public String getDelFlag()
    {
        return delFlag;
    }

    public void setDelFlag(String delFlag)
    {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("brand", getBrand())
            .append("model", getModel())
            .append("mountType", getMountType())
            .append("maxLoadKg", getMaxLoadKg())
            .append("fitsSizeRange", getFitsSizeRange())
            .append("vesaStandard", getVesaStandard())
            .append("steelThickness", getSteelThickness())
            .append("stockQuantity", getStockQuantity())
            .append("unitPrice", getUnitPrice())
            .append("warehouseLocation", getWarehouseLocation())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}