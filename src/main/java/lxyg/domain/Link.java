package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Link entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="link"
    ,catalog="lxyg"
)

public class Link  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer disId;
     private Timestamp timeAdd;
     private Timestamp timeUpdate;
     private String linkName;
     private String linkAddress;
     private Integer linkSorting;


    // Constructors

    /** default constructor */
    public Link() {
    }

	/** minimal constructor */
    public Link(Timestamp timeAdd, Timestamp timeUpdate, String linkName) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.linkName = linkName;
    }
    
    /** full constructor */
    public Link(Integer disId, Timestamp timeAdd, Timestamp timeUpdate, String linkName, String linkAddress, Integer linkSorting) {
        this.disId = disId;
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.linkName = linkName;
        this.linkAddress = linkAddress;
        this.linkSorting = linkSorting;
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
    
    @Column(name="Dis_Id")

    public Integer getDisId() {
        return this.disId;
    }
    
    public void setDisId(Integer disId) {
        this.disId = disId;
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
    
    @Column(name="LinkName", nullable=false, length=1024)

    public String getLinkName() {
        return this.linkName;
    }
    
    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }
    
    @Column(name="LinkAddress", length=1024)

    public String getLinkAddress() {
        return this.linkAddress;
    }
    
    public void setLinkAddress(String linkAddress) {
        this.linkAddress = linkAddress;
    }
    
    @Column(name="LinkSorting")

    public Integer getLinkSorting() {
        return this.linkSorting;
    }
    
    public void setLinkSorting(Integer linkSorting) {
        this.linkSorting = linkSorting;
    }
   








}