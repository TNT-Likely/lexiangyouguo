package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Artical entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="artical"
    ,catalog="lxyg"
)

public class Artical  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Timestamp timeAdd;
     private Timestamp timeUpdate;
     private String articaTitle;
     private String articaClassification;
     private String articalImportant;
     private Boolean whetherShown;
     private Timestamp addTime;


    // Constructors

    /** default constructor */
    public Artical() {
    }

	/** minimal constructor */
    public Artical(Timestamp timeAdd, Timestamp timeUpdate, String articaTitle, Timestamp addTime) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.articaTitle = articaTitle;
        this.addTime = addTime;
    }
    
    /** full constructor */
    public Artical(Timestamp timeAdd, Timestamp timeUpdate, String articaTitle, String articaClassification, String articalImportant, Boolean whetherShown, Timestamp addTime) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.articaTitle = articaTitle;
        this.articaClassification = articaClassification;
        this.articalImportant = articalImportant;
        this.whetherShown = whetherShown;
        this.addTime = addTime;
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
    
    @Column(name="ArticaTitle", nullable=false, length=1024)

    public String getArticaTitle() {
        return this.articaTitle;
    }
    
    public void setArticaTitle(String articaTitle) {
        this.articaTitle = articaTitle;
    }
    
    @Column(name="ArticaClassification", length=1024)

    public String getArticaClassification() {
        return this.articaClassification;
    }
    
    public void setArticaClassification(String articaClassification) {
        this.articaClassification = articaClassification;
    }
    
    @Column(name="ArticalImportant", length=1024)

    public String getArticalImportant() {
        return this.articalImportant;
    }
    
    public void setArticalImportant(String articalImportant) {
        this.articalImportant = articalImportant;
    }
    
    @Column(name="WhetherShown")

    public Boolean getWhetherShown() {
        return this.whetherShown;
    }
    
    public void setWhetherShown(Boolean whetherShown) {
        this.whetherShown = whetherShown;
    }
    
    @Column(name="AddTime", nullable=false, length=19)

    public Timestamp getAddTime() {
        return this.addTime;
    }
    
    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }
   








}