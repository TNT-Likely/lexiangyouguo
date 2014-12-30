package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Displaytype entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="displaytype"
    ,catalog="lxyg"
)

public class Displaytype  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Timestamp timeAdd;
     private Timestamp timeUpdate;
     private String displayLogoType;
     private String displayTextType;


    // Constructors

    /** default constructor */
    public Displaytype() {
    }

	/** minimal constructor */
    public Displaytype(Timestamp timeAdd, Timestamp timeUpdate) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
    }
    
    /** full constructor */
    public Displaytype(Timestamp timeAdd, Timestamp timeUpdate, String displayLogoType, String displayTextType) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.displayLogoType = displayLogoType;
        this.displayTextType = displayTextType;
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
    
    @Column(name="Display_LogoType", length=1024)

    public String getDisplayLogoType() {
        return this.displayLogoType;
    }
    
    public void setDisplayLogoType(String displayLogoType) {
        this.displayLogoType = displayLogoType;
    }
    
    @Column(name="Display_TextType", length=1024)

    public String getDisplayTextType() {
        return this.displayTextType;
    }
    
    public void setDisplayTextType(String displayTextType) {
        this.displayTextType = displayTextType;
    }
   








}