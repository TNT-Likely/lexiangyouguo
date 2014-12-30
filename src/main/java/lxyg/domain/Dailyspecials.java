package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * Dailyspecials entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="dailyspecials"
    ,catalog="lxyg"
)

public class Dailyspecials  implements java.io.Serializable {


    // Fields    

     private DailyspecialsId id;
     private Integer preId;
     private Integer comId;
     private Float preferentialDiscount;
     private Timestamp timeAdd;
     private Timestamp timeUpdate;


    // Constructors

    /** default constructor */
    public Dailyspecials() {
    }

	/** minimal constructor */
    public Dailyspecials(DailyspecialsId id, Timestamp timeAdd, Timestamp timeUpdate) {
        this.id = id;
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
    }
    
    /** full constructor */
    public Dailyspecials(DailyspecialsId id, Integer preId, Integer comId, Float preferentialDiscount, Timestamp timeAdd, Timestamp timeUpdate) {
        this.id = id;
        this.preId = preId;
        this.comId = comId;
        this.preferentialDiscount = preferentialDiscount;
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="proId", column=@Column(name="Pro_Id", nullable=false) ), 
        @AttributeOverride(name="id", column=@Column(name="Id", nullable=false) ) } )

    public DailyspecialsId getId() {
        return this.id;
    }
    
    public void setId(DailyspecialsId id) {
        this.id = id;
    }
    
    @Column(name="Pre_Id")

    public Integer getPreId() {
        return this.preId;
    }
    
    public void setPreId(Integer preId) {
        this.preId = preId;
    }
    
    @Column(name="Com_Id")

    public Integer getComId() {
        return this.comId;
    }
    
    public void setComId(Integer comId) {
        this.comId = comId;
    }
    
    @Column(name="PreferentialDiscount", precision=12, scale=0)

    public Float getPreferentialDiscount() {
        return this.preferentialDiscount;
    }
    
    public void setPreferentialDiscount(Float preferentialDiscount) {
        this.preferentialDiscount = preferentialDiscount;
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
   








}