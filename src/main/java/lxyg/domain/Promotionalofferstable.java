package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Promotionalofferstable entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="promotionalofferstable"
    ,catalog="lxyg"
)

public class Promotionalofferstable  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer preId;
     private Integer comId;
     private Timestamp timeAdd;
     private Timestamp timeUpdate;
     private Float preferentialDiscount;


    // Constructors

    /** default constructor */
    public Promotionalofferstable() {
    }

	/** minimal constructor */
    public Promotionalofferstable(Timestamp timeAdd, Timestamp timeUpdate) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
    }
    
    /** full constructor */
    public Promotionalofferstable(Integer preId, Integer comId, Timestamp timeAdd, Timestamp timeUpdate, Float preferentialDiscount) {
        this.preId = preId;
        this.comId = comId;
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.preferentialDiscount = preferentialDiscount;
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
    
    @Column(name="PreferentialDiscount", precision=12, scale=0)

    public Float getPreferentialDiscount() {
        return this.preferentialDiscount;
    }
    
    public void setPreferentialDiscount(Float preferentialDiscount) {
        this.preferentialDiscount = preferentialDiscount;
    }
   








}