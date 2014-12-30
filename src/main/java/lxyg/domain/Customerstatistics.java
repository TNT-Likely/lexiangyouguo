package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Customerstatistics entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="customerstatistics"
    ,catalog="lxyg"
)

public class Customerstatistics  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Timestamp timeAdd;
     private Timestamp timeUpdate;
     private Float csMembersPurchaseRate;
     private Double csMembersAverageOrder;
     private Double csMembersAveragePurchases;


    // Constructors

    /** default constructor */
    public Customerstatistics() {
    }

	/** minimal constructor */
    public Customerstatistics(Timestamp timeAdd, Timestamp timeUpdate, Float csMembersPurchaseRate) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.csMembersPurchaseRate = csMembersPurchaseRate;
    }
    
    /** full constructor */
    public Customerstatistics(Timestamp timeAdd, Timestamp timeUpdate, Float csMembersPurchaseRate, Double csMembersAverageOrder, Double csMembersAveragePurchases) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.csMembersPurchaseRate = csMembersPurchaseRate;
        this.csMembersAverageOrder = csMembersAverageOrder;
        this.csMembersAveragePurchases = csMembersAveragePurchases;
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
    
    @Column(name="CS_MembersPurchaseRate", nullable=false, precision=12, scale=0)

    public Float getCsMembersPurchaseRate() {
        return this.csMembersPurchaseRate;
    }
    
    public void setCsMembersPurchaseRate(Float csMembersPurchaseRate) {
        this.csMembersPurchaseRate = csMembersPurchaseRate;
    }
    
    @Column(name="CS_MembersAverageOrder", precision=22, scale=0)

    public Double getCsMembersAverageOrder() {
        return this.csMembersAverageOrder;
    }
    
    public void setCsMembersAverageOrder(Double csMembersAverageOrder) {
        this.csMembersAverageOrder = csMembersAverageOrder;
    }
    
    @Column(name="CS_MembersAveragePurchases", precision=22, scale=0)

    public Double getCsMembersAveragePurchases() {
        return this.csMembersAveragePurchases;
    }
    
    public void setCsMembersAveragePurchases(Double csMembersAveragePurchases) {
        this.csMembersAveragePurchases = csMembersAveragePurchases;
    }
   








}