package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Gift entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="gift"
    ,catalog="lxyg"
)

public class Gift  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer occId;
     private Integer typId;
     private Timestamp timeAdd;
     private Timestamp timeUpdate;
     private String giftName;


    // Constructors

    /** default constructor */
    public Gift() {
    }

	/** minimal constructor */
    public Gift(Timestamp timeAdd, Timestamp timeUpdate, String giftName) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.giftName = giftName;
    }
    
    /** full constructor */
    public Gift(Integer occId, Integer typId, Timestamp timeAdd, Timestamp timeUpdate, String giftName) {
        this.occId = occId;
        this.typId = typId;
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.giftName = giftName;
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
    
    @Column(name="Occ_Id")

    public Integer getOccId() {
        return this.occId;
    }
    
    public void setOccId(Integer occId) {
        this.occId = occId;
    }
    
    @Column(name="Typ_Id")

    public Integer getTypId() {
        return this.typId;
    }
    
    public void setTypId(Integer typId) {
        this.typId = typId;
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
    
    @Column(name="GiftName", nullable=false, length=1024)

    public String getGiftName() {
        return this.giftName;
    }
    
    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }
   








}