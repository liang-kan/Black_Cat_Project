package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.annotation.Excel.ColumnType;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 电视库存表 cat_tvs
 * 
 * @author ruoyi
 */
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

    public BigDecimal getScreenSize()
    {
        return screenSize;
    }

    public void setScreenSize(BigDecimal screenSize)
    {
        this.screenSize = screenSize;
    }

    public String getResolution()
    {
        return resolution;
    }

    public void setResolution(String resolution)
    {
        this.resolution = resolution;
    }

    public String getHaveFrame()
    {
        return haveFrame;
    }

    public void setHaveFrame(String haveFrame)
    {
        this.haveFrame = haveFrame;
    }

    public String getPanelType()
    {
        return panelType;
    }

    public void setPanelType(String panelType)
    {
        this.panelType = panelType;
    }

    public String getPortInfo()
    {
        return portInfo;
    }

    public void setPortInfo(String portInfo)
    {
        this.portInfo = portInfo;
    }

    public String getIsInternet()
    {
        return isInternet;
    }

    public void setIsInternet(String isInternet)
    {
        this.isInternet = isInternet;
    }

    public String getFlaw()
    {
        return flaw;
    }

    public void setFlaw(String flaw)
    {
        this.flaw = flaw;
    }

    public String getEnergyRating()
    {
        return energyRating;
    }

    public void setEnergyRating(String energyRating)
    {
        this.energyRating = energyRating;
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
            .append("screenSize", getScreenSize())
            .append("resolution", getResolution())
            .append("haveFrame", getHaveFrame())
            .append("panelType", getPanelType())
            .append("portInfo", getPortInfo())
            .append("isInternet", getIsInternet())
            .append("flaw", getFlaw())
            .append("energyRating", getEnergyRating())
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