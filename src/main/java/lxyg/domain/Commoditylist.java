package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Commoditylist entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="commoditylist"
    ,catalog="lxyg"
)

public class Commoditylist  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer comId;
     private Integer comId2;
     private Integer comId3;
     private Integer comId4;
     private Timestamp timeAdd;
     private Timestamp timeUpdate;
     private String commodityItemNamber;
     private String commodityShelves;
     private Integer commodityInventory;
     private Integer commodityQuantity;
     private String commodityDisplay;
     private Integer commodityCollectionNumber;
     private String commodityName;


    // Constructors

    /** default constructor */
    public Commoditylist() {
    }

	/** minimal constructor */
    public Commoditylist(Timestamp timeAdd, Timestamp timeUpdate, String commodityItemNamber) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.commodityItemNamber = commodityItemNamber;
    }
    
    /** full constructor */
    public Commoditylist(Integer comId, Integer comId2, Integer comId3, Integer comId4, Timestamp timeAdd, Timestamp timeUpdate, String commodityItemNamber, String commodityShelves, Integer commodityInventory, Integer commodityQuantity, String commodityDisplay, Integer commodityCollectionNumber, String commodityName) {
        this.comId = comId;
        this.comId2 = comId2;
        this.comId3 = comId3;
        this.comId4 = comId4;
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.commodityItemNamber = commodityItemNamber;
        this.commodityShelves = commodityShelves;
        this.commodityInventory = commodityInventory;
        this.commodityQuantity = commodityQuantity;
        this.commodityDisplay = commodityDisplay;
        this.commodityCollectionNumber = commodityCollectionNumber;
        this.commodityName = commodityName;
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
    
    @Column(name="Com_Id")

    public Integer getComId() {
        return this.comId;
    }
    
    public void setComId(Integer comId) {
        this.comId = comId;
    }
    
    @Column(name="Com_Id2")

    public Integer getComId2() {
        return this.comId2;
    }
    
    public void setComId2(Integer comId2) {
        this.comId2 = comId2;
    }
    
    @Column(name="Com_Id3")

    public Integer getComId3() {
        return this.comId3;
    }
    
    public void setComId3(Integer comId3) {
        this.comId3 = comId3;
    }
    
    @Column(name="Com_Id4")

    public Integer getComId4() {
        return this.comId4;
    }
    
    public void setComId4(Integer comId4) {
        this.comId4 = comId4;
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
    
    @Column(name="CommodityItemNamber", nullable=false, length=1024)

    public String getCommodityItemNamber() {
        return this.commodityItemNamber;
    }
    
    public void setCommodityItemNamber(String commodityItemNamber) {
        this.commodityItemNamber = commodityItemNamber;
    }
    
    @Column(name="CommodityShelves", length=1024)

    public String getCommodityShelves() {
        return this.commodityShelves;
    }
    
    public void setCommodityShelves(String commodityShelves) {
        this.commodityShelves = commodityShelves;
    }
    
    @Column(name="CommodityInventory")

    public Integer getCommodityInventory() {
        return this.commodityInventory;
    }
    
    public void setCommodityInventory(Integer commodityInventory) {
        this.commodityInventory = commodityInventory;
    }
    
    @Column(name="CommodityQuantity")

    public Integer getCommodityQuantity() {
        return this.commodityQuantity;
    }
    
    public void setCommodityQuantity(Integer commodityQuantity) {
        this.commodityQuantity = commodityQuantity;
    }
    
    @Column(name="CommodityDisplay", length=1024)

    public String getCommodityDisplay() {
        return this.commodityDisplay;
    }
    
    public void setCommodityDisplay(String commodityDisplay) {
        this.commodityDisplay = commodityDisplay;
    }
    
    @Column(name="CommodityCollectionNumber")

    public Integer getCommodityCollectionNumber() {
        return this.commodityCollectionNumber;
    }
    
    public void setCommodityCollectionNumber(Integer commodityCollectionNumber) {
        this.commodityCollectionNumber = commodityCollectionNumber;
    }
    
    @Column(name="CommodityName", length=1024)

    public String getCommodityName() {
        return this.commodityName;
    }
    
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }
   








}