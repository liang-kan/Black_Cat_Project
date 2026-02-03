package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.annotation.Excel.ColumnType;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 灯条库存表 cat_led_strips
 * 
 * @author ruoyi
 */
public class CatLedStrips extends BaseEntity
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

    public Integer getIsSideLight()
    {
        return isSideLight;
    }

    public void setIsSideLight(Integer isSideLight)
    {
        this.isSideLight = isSideLight;
    }

    public String getVoltage()
    {
        return voltage;
    }

    public void setVoltage(String voltage)
    {
        this.voltage = voltage;
    }

    public BigDecimal getLengthMeters()
    {
        return lengthMeters;
    }

    public void setLengthMeters(BigDecimal lengthMeters)
    {
        this.lengthMeters = lengthMeters;
    }

    public String getColorTemp()
    {
        return colorTemp;
    }

    public void setColorTemp(String colorTemp)
    {
        this.colorTemp = colorTemp;
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
            .append("isSideLight", getIsSideLight())
            .append("voltage", getVoltage())
            .append("lengthMeters", getLengthMeters())
            .append("colorTemp", getColorTemp())
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