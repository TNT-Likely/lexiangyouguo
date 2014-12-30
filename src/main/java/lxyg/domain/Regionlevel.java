package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Regionlevel entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="regionlevel"
    ,catalog="lxyg"
)

public class Regionlevel  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Timestamp timeAdd;
     private Timestamp timeUpdate;
     private String regionLevelProvince;
     private String regionLevelCity;
     private String regionLevelCounty;
     private String regionLevelTown;


    // Constructors

    /** default constructor */
    public Regionlevel() {
    }

	/** minimal constructor */
    public Regionlevel(Timestamp timeAdd, Timestamp timeUpdate) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
    }
    
    /** full constructor */
    public Regionlevel(Timestamp timeAdd, Timestamp timeUpdate, String regionLevelProvince, String regionLevelCity, String regionLevelCounty, String regionLevelTown) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.regionLevelProvince = regionLevelProvince;
        this.regionLevelCity = regionLevelCity;
        this.regionLevelCounty = regionLevelCounty;
        this.regionLevelTown = regionLevelTown;
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
    
    @Column(name="RegionLevel_Province", length=1024)

    public String getRegionLevelProvince() {
        return this.regionLevelProvince;
    }
    
    public void setRegionLevelProvince(String regionLevelProvince) {
        this.regionLevelProvince = regionLevelProvince;
    }
    
    @Column(name="RegionLevel_City", length=1024)

    public String getRegionLevelCity() {
        return this.regionLevelCity;
    }
    
    public void setRegionLevelCity(String regionLevelCity) {
        this.regionLevelCity = regionLevelCity;
    }
    
    @Column(name="RegionLevel_County", length=1024)

    public String getRegionLevelCounty() {
        return this.regionLevelCounty;
    }
    
    public void setRegionLevelCounty(String regionLevelCounty) {
        this.regionLevelCounty = regionLevelCounty;
    }
    
    @Column(name="RegionLevel_Town", length=1024)

    public String getRegionLevelTown() {
        return this.regionLevelTown;
    }
    
    public void setRegionLevelTown(String regionLevelTown) {
        this.regionLevelTown = regionLevelTown;
    }
   








}