package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Membercollectiontable entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="membercollectiontable"
    ,catalog="lxyg"
)

public class Membercollectiontable  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer memId;
     private Integer comId;
     private Timestamp timeAdd;
     private Timestamp timeUpdate;


    // Constructors

    /** default constructor */
    public Membercollectiontable() {
    }

	/** minimal constructor */
    public Membercollectiontable(Timestamp timeAdd, Timestamp timeUpdate) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
    }
    
    /** full constructor */
    public Membercollectiontable(Integer memId, Integer comId, Timestamp timeAdd, Timestamp timeUpdate) {
        this.memId = memId;
        this.comId = comId;
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
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
   








}