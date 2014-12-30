package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Giftcontents entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="giftcontents"
    ,catalog="lxyg"
)

public class Giftcontents  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer gifId;
     private Integer comId;
     private Timestamp timeAdd;
     private Timestamp timeUpdate;


    // Constructors

    /** default constructor */
    public Giftcontents() {
    }

	/** minimal constructor */
    public Giftcontents(Timestamp timeAdd, Timestamp timeUpdate) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
    }
    
    /** full constructor */
    public Giftcontents(Integer gifId, Integer comId, Timestamp timeAdd, Timestamp timeUpdate) {
        this.gifId = gifId;
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
    
    @Column(name="Gif_Id")

    public Integer getGifId() {
        return this.gifId;
    }
    
    public void setGifId(Integer gifId) {
        this.gifId = gifId;
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