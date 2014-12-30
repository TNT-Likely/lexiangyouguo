package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Ordercontent entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="ordercontent"
    ,catalog="lxyg"
)

public class Ordercontent  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer ordId;
     private Integer comId;
     private Timestamp timeAdd;
     private Timestamp timeUpdate;


    // Constructors

    /** default constructor */
    public Ordercontent() {
    }

	/** minimal constructor */
    public Ordercontent(Timestamp timeAdd, Timestamp timeUpdate) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
    }
    
    /** full constructor */
    public Ordercontent(Integer ordId, Integer comId, Timestamp timeAdd, Timestamp timeUpdate) {
        this.ordId = ordId;
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
    
    @Column(name="Ord_Id")

    public Integer getOrdId() {
        return this.ordId;
    }
    
    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
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