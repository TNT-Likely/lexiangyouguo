package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Type entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="type"
    ,catalog="lxyg"
)

public class Type  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Timestamp timeAdd;
     private Timestamp timeUpdate;
     private String typeRecovery;
     private String typeImproveResistance;
     private String typeRorBrain;
     private String typeBeauty;


    // Constructors

    /** default constructor */
    public Type() {
    }

	/** minimal constructor */
    public Type(Timestamp timeAdd, Timestamp timeUpdate) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
    }
    
    /** full constructor */
    public Type(Timestamp timeAdd, Timestamp timeUpdate, String typeRecovery, String typeImproveResistance, String typeRorBrain, String typeBeauty) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.typeRecovery = typeRecovery;
        this.typeImproveResistance = typeImproveResistance;
        this.typeRorBrain = typeRorBrain;
        this.typeBeauty = typeBeauty;
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
    
    @Column(name="Type_Recovery", length=1024)

    public String getTypeRecovery() {
        return this.typeRecovery;
    }
    
    public void setTypeRecovery(String typeRecovery) {
        this.typeRecovery = typeRecovery;
    }
    
    @Column(name="Type_ImproveResistance", length=1024)

    public String getTypeImproveResistance() {
        return this.typeImproveResistance;
    }
    
    public void setTypeImproveResistance(String typeImproveResistance) {
        this.typeImproveResistance = typeImproveResistance;
    }
    
    @Column(name="Type_RorBrain", length=1024)

    public String getTypeRorBrain() {
        return this.typeRorBrain;
    }
    
    public void setTypeRorBrain(String typeRorBrain) {
        this.typeRorBrain = typeRorBrain;
    }
    
    @Column(name="Type_Beauty", length=1024)

    public String getTypeBeauty() {
        return this.typeBeauty;
    }
    
    public void setTypeBeauty(String typeBeauty) {
        this.typeBeauty = typeBeauty;
    }
   








}