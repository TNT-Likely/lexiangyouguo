package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Storesettings entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="storesettings"
    ,catalog="lxyg"
)

public class Storesettings  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer shoId;
     private Timestamp timeAdd;
     private Timestamp timeUpdate;
     private String storeBasicSetting;
     private String storeShoppingProcess;
     private String storeCommodityDisplaySetting;


    // Constructors

    /** default constructor */
    public Storesettings() {
    }

	/** minimal constructor */
    public Storesettings(Timestamp timeAdd, Timestamp timeUpdate) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
    }
    
    /** full constructor */
    public Storesettings(Integer shoId, Timestamp timeAdd, Timestamp timeUpdate, String storeBasicSetting, String storeShoppingProcess, String storeCommodityDisplaySetting) {
        this.shoId = shoId;
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.storeBasicSetting = storeBasicSetting;
        this.storeShoppingProcess = storeShoppingProcess;
        this.storeCommodityDisplaySetting = storeCommodityDisplaySetting;
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
    
    @Column(name="Sho_Id")

    public Integer getShoId() {
        return this.shoId;
    }
    
    public void setShoId(Integer shoId) {
        this.shoId = shoId;
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
    
    @Column(name="StoreBasicSetting", length=1024)

    public String getStoreBasicSetting() {
        return this.storeBasicSetting;
    }
    
    public void setStoreBasicSetting(String storeBasicSetting) {
        this.storeBasicSetting = storeBasicSetting;
    }
    
    @Column(name="StoreShoppingProcess", length=1024)

    public String getStoreShoppingProcess() {
        return this.storeShoppingProcess;
    }
    
    public void setStoreShoppingProcess(String storeShoppingProcess) {
        this.storeShoppingProcess = storeShoppingProcess;
    }
    
    @Column(name="StoreCommodityDisplaySetting", length=1024)

    public String getStoreCommodityDisplaySetting() {
        return this.storeCommodityDisplaySetting;
    }
    
    public void setStoreCommodityDisplaySetting(String storeCommodityDisplaySetting) {
        this.storeCommodityDisplaySetting = storeCommodityDisplaySetting;
    }
   








}