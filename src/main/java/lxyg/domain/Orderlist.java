package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Orderlist entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="orderlist"
    ,catalog="lxyg"
)

public class Orderlist  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer memId;
     private Integer harId;
     private Integer ordId;
     private Timestamp timeAdd;
     private Timestamp timeUpdate;
     private Integer orderNumber;
     private Timestamp orderTime;
     private Float orderTotalMoney;
     private Float orderAmountPayable;
     private String orderDescribe;


    // Constructors

    /** default constructor */
    public Orderlist() {
    }

	/** minimal constructor */
    public Orderlist(Timestamp timeAdd, Timestamp timeUpdate, Integer orderNumber, Timestamp orderTime) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.orderNumber = orderNumber;
        this.orderTime = orderTime;
    }
    
    /** full constructor */
    public Orderlist(Integer memId, Integer harId, Integer ordId, Timestamp timeAdd, Timestamp timeUpdate, Integer orderNumber, Timestamp orderTime, Float orderTotalMoney, Float orderAmountPayable, String orderDescribe) {
        this.memId = memId;
        this.harId = harId;
        this.ordId = ordId;
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.orderNumber = orderNumber;
        this.orderTime = orderTime;
        this.orderTotalMoney = orderTotalMoney;
        this.orderAmountPayable = orderAmountPayable;
        this.orderDescribe = orderDescribe;
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
    
    @Column(name="Har_Id")

    public Integer getHarId() {
        return this.harId;
    }
    
    public void setHarId(Integer harId) {
        this.harId = harId;
    }
    
    @Column(name="Ord_Id")

    public Integer getOrdId() {
        return this.ordId;
    }
    
    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
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
    
    @Column(name="OrderNumber", nullable=false)

    public Integer getOrderNumber() {
        return this.orderNumber;
    }
    
    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }
    
    @Column(name="OrderTime", nullable=false, length=19)

    public Timestamp getOrderTime() {
        return this.orderTime;
    }
    
    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }
    
    @Column(name="OrderTotalMoney", precision=12, scale=0)

    public Float getOrderTotalMoney() {
        return this.orderTotalMoney;
    }
    
    public void setOrderTotalMoney(Float orderTotalMoney) {
        this.orderTotalMoney = orderTotalMoney;
    }
    
    @Column(name="OrderAmountPayable", precision=12, scale=0)

    public Float getOrderAmountPayable() {
        return this.orderAmountPayable;
    }
    
    public void setOrderAmountPayable(Float orderAmountPayable) {
        this.orderAmountPayable = orderAmountPayable;
    }
    
    @Column(name="OrderDescribe", length=1024)

    public String getOrderDescribe() {
        return this.orderDescribe;
    }
    
    public void setOrderDescribe(String orderDescribe) {
        this.orderDescribe = orderDescribe;
    }
   








}