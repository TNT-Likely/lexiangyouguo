package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * Holidayspecialarea entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="holidayspecialarea"
    ,catalog="lxyg"
)

public class Holidayspecialarea  implements java.io.Serializable {


    // Fields    

     private HolidayspecialareaId id;
     private Integer preId;
     private Integer comId;
     private Float preferentialDiscount;
     private Timestamp timeAdd;
     private Timestamp timeUpdate;
     private String holidaySpeciaMeaning;


    // Constructors

    /** default constructor */
    public Holidayspecialarea() {
    }

	/** minimal constructor */
    public Holidayspecialarea(HolidayspecialareaId id, Timestamp timeAdd, Timestamp timeUpdate, String holidaySpeciaMeaning) {
        this.id = id;
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.holidaySpeciaMeaning = holidaySpeciaMeaning;
    }
    
    /** full constructor */
    public Holidayspecialarea(HolidayspecialareaId id, Integer preId, Integer comId, Float preferentialDiscount, Timestamp timeAdd, Timestamp timeUpdate, String holidaySpeciaMeaning) {
        this.id = id;
        this.preId = preId;
        this.comId = comId;
        this.preferentialDiscount = preferentialDiscount;
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.holidaySpeciaMeaning = holidaySpeciaMeaning;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="proId", column=@Column(name="Pro_Id", nullable=false) ), 
        @AttributeOverride(name="id", column=@Column(name="Id", nullable=false) ) } )

    public HolidayspecialareaId getId() {
        return this.id;
    }
    
    public void setId(HolidayspecialareaId id) {
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
    
    @Column(name="HolidaySpeciaMeaning", nullable=false, length=1024)

    public String getHolidaySpeciaMeaning() {
        return this.holidaySpeciaMeaning;
    }
    
    public void setHolidaySpeciaMeaning(String holidaySpeciaMeaning) {
        this.holidaySpeciaMeaning = holidaySpeciaMeaning;
    }
   








}