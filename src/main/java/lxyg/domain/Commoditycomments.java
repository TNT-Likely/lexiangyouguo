package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Commoditycomments entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="commoditycomments"
    ,catalog="lxyg"
)

public class Commoditycomments  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer memId;
     private Timestamp timeAdd;
     private Timestamp timeUpdate;
     private String commodityComType;
     private String commodityComContent;
     private Integer commodityComDescriptionConsistent;
     private Integer commodityComDeliverySpeed;
     private Integer commodityComLogisticsSpeed;
     private Integer commodityComCourierServiceAttitude;


    // Constructors

    /** default constructor */
    public Commoditycomments() {
    }

	/** minimal constructor */
    public Commoditycomments(Timestamp timeAdd, Timestamp timeUpdate) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
    }
    
    /** full constructor */
    public Commoditycomments(Integer memId, Timestamp timeAdd, Timestamp timeUpdate, String commodityComType, String commodityComContent, Integer commodityComDescriptionConsistent, Integer commodityComDeliverySpeed, Integer commodityComLogisticsSpeed, Integer commodityComCourierServiceAttitude) {
        this.memId = memId;
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.commodityComType = commodityComType;
        this.commodityComContent = commodityComContent;
        this.commodityComDescriptionConsistent = commodityComDescriptionConsistent;
        this.commodityComDeliverySpeed = commodityComDeliverySpeed;
        this.commodityComLogisticsSpeed = commodityComLogisticsSpeed;
        this.commodityComCourierServiceAttitude = commodityComCourierServiceAttitude;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="Id", unique=true, nullable=false)

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="Mem_Id")

    public Integer getMemId() {
        return this.memId;
    }
    
    public void setMemId(Integer memId) {
        this.memId = memId;
    }
    
    @Column(name="TimeAdd", nullable=false, length=19)

    public Timestamp getTimeAdd() {
        return this.timeAdd;
    }
    
    public void setTimeAdd(Timestamp timeAdd) {
        this.timeAdd = timeAdd;
    }
    
    @Column(name="TimeUpdate", nullable=false, length=19)

    public Timestamp getTimeUpdate() {
        return this.timeUpdate;
    }
    
    public void setTimeUpdate(Timestamp timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
    
    @Column(name="CommodityCom_Type", length=1024)

    public String getCommodityComType() {
        return this.commodityComType;
    }
    
    public void setCommodityComType(String commodityComType) {
        this.commodityComType = commodityComType;
    }
    
    @Column(name="CommodityCom_Content", length=1024)

    public String getCommodityComContent() {
        return this.commodityComContent;
    }
    
    public void setCommodityComContent(String commodityComContent) {
        this.commodityComContent = commodityComContent;
    }
    
    @Column(name="CommodityCom_DescriptionConsistent")

    public Integer getCommodityComDescriptionConsistent() {
        return this.commodityComDescriptionConsistent;
    }
    
    public void setCommodityComDescriptionConsistent(Integer commodityComDescriptionConsistent) {
        this.commodityComDescriptionConsistent = commodityComDescriptionConsistent;
    }
    
    @Column(name="CommodityCom_deliverySpeed")

    public Integer getCommodityComDeliverySpeed() {
        return this.commodityComDeliverySpeed;
    }
    
    public void setCommodityComDeliverySpeed(Integer commodityComDeliverySpeed) {
        this.commodityComDeliverySpeed = commodityComDeliverySpeed;
    }
    
    @Column(name="CommodityCom_LogisticsSpeed")

    public Integer getCommodityComLogisticsSpeed() {
        return this.commodityComLogisticsSpeed;
    }
    
    public void setCommodityComLogisticsSpeed(Integer commodityComLogisticsSpeed) {
        this.commodityComLogisticsSpeed = commodityComLogisticsSpeed;
    }
    
    @Column(name="CommodityCom_CourierServiceAttitude")

    public Integer getCommodityComCourierServiceAttitude() {
        return this.commodityComCourierServiceAttitude;
    }
    
    public void setCommodityComCourierServiceAttitude(Integer commodityComCourierServiceAttitude) {
        this.commodityComCourierServiceAttitude = commodityComCourierServiceAttitude;
    }
   








}