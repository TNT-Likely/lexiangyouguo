package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "order", catalog = "lxyg")
public class Order implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer proId;
	private Integer orderNumber;
	private Timestamp orderTime;
	private Float orderTotalMoney;
	private Float orderPayMoney;
	private Integer memberId;
	private String orderDescribe;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(Integer proId, Integer orderNumber, Timestamp orderTime,
			Float orderTotalMoney, Float orderPayMoney, Integer memberId,
			Timestamp timeAdd) {
		this.proId = proId;
		this.orderNumber = orderNumber;
		this.orderTime = orderTime;
		this.orderTotalMoney = orderTotalMoney;
		this.orderPayMoney = orderPayMoney;
		this.memberId = memberId;
		this.timeAdd = timeAdd;
	}

	/** full constructor */
	public Order(Integer proId, Integer orderNumber, Timestamp orderTime,
			Float orderTotalMoney, Float orderPayMoney, Integer memberId,
			String orderDescribe, Timestamp timeAdd, Timestamp timeUpdate) {
		this.proId = proId;
		this.orderNumber = orderNumber;
		this.orderTime = orderTime;
		this.orderTotalMoney = orderTotalMoney;
		this.orderPayMoney = orderPayMoney;
		this.memberId = memberId;
		this.orderDescribe = orderDescribe;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "proId", nullable = false)
	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	@Column(name = "OrderNumber", nullable = false)
	public Integer getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	@Column(name = "OrderTime", nullable = false, length = 19)
	public Timestamp getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}

	@Column(name = "OrderTotalMoney", nullable = false, precision = 12, scale = 0)
	public Float getOrderTotalMoney() {
		return this.orderTotalMoney;
	}

	public void setOrderTotalMoney(Float orderTotalMoney) {
		this.orderTotalMoney = orderTotalMoney;
	}

	@Column(name = "OrderPayMoney", nullable = false, precision = 12, scale = 0)
	public Float getOrderPayMoney() {
		return this.orderPayMoney;
	}

	public void setOrderPayMoney(Float orderPayMoney) {
		this.orderPayMoney = orderPayMoney;
	}

	@Column(name = "MemberId", nullable = false)
	public Integer getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	@Column(name = "OrderDescribe", length = 1024)
	public String getOrderDescribe() {
		return this.orderDescribe;
	}

	public void setOrderDescribe(String orderDescribe) {
		this.orderDescribe = orderDescribe;
	}

	@Column(name = "TimeAdd", nullable = false, length = 19)
	public Timestamp getTimeAdd() {
		return this.timeAdd;
	}

	public void setTimeAdd(Timestamp timeAdd) {
		this.timeAdd = timeAdd;
	}

	@Column(name = "TimeUpdate", length = 19)
	public Timestamp getTimeUpdate() {
		return this.timeUpdate;
	}

	public void setTimeUpdate(Timestamp timeUpdate) {
		this.timeUpdate = timeUpdate;
	}

}