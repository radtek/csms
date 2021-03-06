package com.bycc.entity;

import com.bycc.enumitem.AreaType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 办案区
 */
@Entity
@Table(name = "bdm_handling_area")
@TableGenerator(name = "com.bycc.entity.BdmHandlingArea",
        table = "ID_Sequence",
        pkColumnName = "KEY_ID_",
        valueColumnName = "GEN_VALUE_",
        pkColumnValue = "com.bycc.entity.BdmHandlingArea",
        initialValue = 1,
        allocationSize = 1
)
public class BdmHandlingArea implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @Id
    @Column(name = "id_")
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "com.bycc.entity.BdmHandlingArea")
    private Integer id;

    /**
     * 编码
     */
    @Column(name = "code_")
    private String code;

    /**
     * 名称
     */
    @Column(name = "name_")
    private String name;

    /**
     * 区域
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "area_type_")
    private AreaType areaType;

    /**
     * 地址
     */
    @Column(name = "address_")
    private String address;

    /**
     * 备注
     */
    @Column(name = "note_")
    private String note;

    /**
     * 操作人
     */
    @Column(name = "operator_id_")
    private Integer operatorId;

    /**
     * 插入日期
     */
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "insert_date_")
    private Date insertDate;

    /**
     * 更新时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_date_")
    private Date updateDate;

    /**
     * 所属公安局（派出所）
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "police_station_id_")
    private BdmPoliceStation policeStation;

    /**
     * 物品柜列表
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "handlingArea", fetch = FetchType.LAZY)
    private List<BdmCabinet> cabinets = new ArrayList<BdmCabinet>();

    /**
     * 腕带列表
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "handlingArea", fetch = FetchType.LAZY)
    private List<BdmStrap> straps = new ArrayList<BdmStrap>();

    public BdmHandlingArea(){}
    //构造函数--构造测试数据用
    public BdmHandlingArea(String code, String name, BdmPoliceStation ps) {
        this.code = code;
        this.name = name;
        this.policeStation = ps;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AreaType getAreaType() {
        return areaType;
    }

    public void setAreaType(AreaType areaType) {
        this.areaType = areaType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public BdmPoliceStation getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(BdmPoliceStation policeStation) {
        this.policeStation = policeStation;
    }

    public List<BdmCabinet> getCabinets() {
        return cabinets;
    }

    public void setCabinets(List<BdmCabinet> cabinets) {
        this.cabinets = cabinets;
    }

    public List<BdmStrap> getStraps() {
        return straps;
    }

    public void setStraps(List<BdmStrap> straps) {
        this.straps = straps;
    }
}
