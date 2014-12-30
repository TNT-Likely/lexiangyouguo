package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Occasion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="occasion"
    ,catalog="lxyg"
)

public class Occasion  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Timestamp timeAdd;
     private Timestamp timeUpdate;
     private String occasionVisitRelatives;
     private String occasionVisitFriends;
     private String occasionGiftGiving;
     private String occasionVisitPatient;
     private String occasionCongratulationsToHospital;
     private String occasionFamilyOrder;


    // Constructors

    /** default constructor */
    public Occasion() {
    }

	/** minimal constructor */
    public Occasion(Timestamp timeAdd, Timestamp timeUpdate) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
    }
    
    /** full constructor */
    public Occasion(Timestamp timeAdd, Timestamp timeUpdate, String occasionVisitRelatives, String occasionVisitFriends, String occasionGiftGiving, String occasionVisitPatient, String occasionCongratulationsToHospital, String occasionFamilyOrder) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.occasionVisitRelatives = occasionVisitRelatives;
        this.occasionVisitFriends = occasionVisitFriends;
        this.occasionGiftGiving = occasionGiftGiving;
        this.occasionVisitPatient = occasionVisitPatient;
        this.occasionCongratulationsToHospital = occasionCongratulationsToHospital;
        this.occasionFamilyOrder = occasionFamilyOrder;
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
    
    @Column(name="Occasion_VisitRelatives", length=1024)

    public String getOccasionVisitRelatives() {
        return this.occasionVisitRelatives;
    }
    
    public void setOccasionVisitRelatives(String occasionVisitRelatives) {
        this.occasionVisitRelatives = occasionVisitRelatives;
    }
    
    @Column(name="Occasion_VisitFriends", length=1024)

    public String getOccasionVisitFriends() {
        return this.occasionVisitFriends;
    }
    
    public void setOccasionVisitFriends(String occasionVisitFriends) {
        this.occasionVisitFriends = occasionVisitFriends;
    }
    
    @Column(name="Occasion_GiftGiving", length=1024)

    public String getOccasionGiftGiving() {
        return this.occasionGiftGiving;
    }
    
    public void setOccasionGiftGiving(String occasionGiftGiving) {
        this.occasionGiftGiving = occasionGiftGiving;
    }
    
    @Column(name="Occasion_VisitPatient", length=1024)

    public String getOccasionVisitPatient() {
        return this.occasionVisitPatient;
    }
    
    public void setOccasionVisitPatient(String occasionVisitPatient) {
        this.occasionVisitPatient = occasionVisitPatient;
    }
    
    @Column(name="Occasion_CongratulationsToHospital", length=1024)

    public String getOccasionCongratulationsToHospital() {
        return this.occasionCongratulationsToHospital;
    }
    
    public void setOccasionCongratulationsToHospital(String occasionCongratulationsToHospital) {
        this.occasionCongratulationsToHospital = occasionCongratulationsToHospital;
    }
    
    @Column(name="Occasion_FamilyOrder", length=1024)

    public String getOccasionFamilyOrder() {
        return this.occasionFamilyOrder;
    }
    
    public void setOccasionFamilyOrder(String occasionFamilyOrder) {
        this.occasionFamilyOrder = occasionFamilyOrder;
    }
   








}