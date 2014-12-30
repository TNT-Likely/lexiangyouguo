package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Regionlist entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="regionlist"
    ,catalog="lxyg"
)

public class Regionlist  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer regId;
     private Timestamp timeAdd;
     private Timestamp timeUpdate;
     private String regionName;


    // Constructors

    /** default constructor */
    public Regionlist() {
    }

	/** minimal constructor */
    public Regionlist(Timestamp timeAdd, Timestamp timeUpdate, String regionName) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.regionName = regionName;
    }
    
    /** full constructor */
    public Regionlist(Integer regId, Timestamp timeAdd, Timestamp timeUpdate, String regionName) {
        this.regId = regId;
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.regionName = regionName;
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
    
    @Column(name="Reg_Id")

    public Integer getRegId() {
        return this.regId;
    }
    
    public void setRegId(Integer regId) {
        this.regId = regId;
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
    
    @Column(name="RegionName", nullable=false, length=1024)

    public String getRegionName() {
        return this.regionName;
    }
    
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
   








}