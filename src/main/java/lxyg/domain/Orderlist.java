package lxyg.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Orderlist entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "orderlist", catalog = "lxyg")
public class Orderlist implements java.io.Serializable {

	// Fields

	private Integer id;
	private Ordercontentlist ordercontentlist;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private Integer orderNumber;
	private Timestamp orderTime;
	private Float orderTotalMoney;
	private Float orderAmountPayable;
	private String orderState;
	private Integer orderMembersId;
	private Integer orderConsigneeAddressId;
	private String orderDescribe;
	private Set<Memberlist> memberlists = new HashSet<Memberlist>(0);
	private Set<Harvestaddresstable> harvestaddresstables = new HashSet<Harvestaddresstable>(
			0);
	private Set<Orderstate> orderstates = new HashSet<Orderstate>(0);

	// Constructors

	/** default constructor */
	public Orderlist() {
	}

	/** minimal constructor */
	public Orderlist(Timestamp timeAdd, Timestamp timeUpdate,
			Integer orderNumber, Timestamp orderTime, Float orderTotalMoney,
			Float orderAmountPayable, String orderState) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.orderNumber = orderNumber;
		this.orderTime = orderTime;
		this.orderTotalMoney = orderTotalMoney;
		this.orderAmountPayable = orderAmountPayable;
		this.orderState = orderState;
	}

	/** full constructor */
	public Orderlist(Ordercontentlist ordercontentlist, Timestamp timeAdd,
			Timestamp timeUpdate, Integer orderNumber, Timestamp orderTime,
			Float orderTotalMoney, Float orderAmountPayable, String orderState,
			Integer orderMembersId, Integer orderConsigneeAddressId,
			String orderDescribe, Set<Memberlist> memberlists,
			Set<Harvestaddresstable> harvestaddresstables,
			Set<Orderstate> orderstates) {
		this.ordercontentlist = ordercontentlist;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.orderNumber = orderNumber;
		this.orderTime = orderTime;
		this.orderTotalMoney = orderTotalMoney;
		this.orderAmountPayable = orderAmountPayable;
		this.orderState = orderState;
		this.orderMembersId = orderMembersId;
		this.orderConsigneeAddressId = orderConsigneeAddressId;
		this.orderDescribe = orderDescribe;
		this.memberlists = memberlists;
		this.harvestaddresstables = harvestaddresstables;
		this.orderstates = orderstates;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Ord_Id")
	public Ordercontentlist getOrdercontentlist() {
		return this.ordercontentlist;
	}

	public void setOrdercontentlist(Ordercontentlist ordercontentlist) {
		this.ordercontentlist = ordercontentlist;
	}

	@Column(name = "TimeAdd", nullable = false, length = 19)
	public Timestamp getTimeAdd() {
		return this.timeAdd;
	}

	public void setTimeAdd(Timestamp timeAdd) {
		this.timeAdd = timeAdd;
	}

	@Column(name = "TimeUpdate", nullable = false, length = 19)
	public Timestamp getTimeUpdate() {
		return this.timeUpdate;
	}

	public void setTimeUpdate(Timestamp timeUpdate) {
		this.timeUpdate = timeUpdate;
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

	@Column(name = "OrderAmountPayable", nullable = false, precision = 12, scale = 0)
	public Float getOrderAmountPayable() {
		return this.orderAmountPayable;
	}

	public void setOrderAmountPayable(Float orderAmountPayable) {
		this.orderAmountPayable = orderAmountPayable;
	}

	@Column(name = "OrderState", nullable = false, length = 1024)
	public String getOrderState() {
		return this.orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	@Column(name = "OrderMembersId")
	public Integer getOrderMembersId() {
		return this.orderMembersId;
	}

	public void setOrderMembersId(Integer orderMembersId) {
		this.orderMembersId = orderMembersId;
	}

	@Column(name = "OrderConsigneeAddressId")
	public Integer getOrderConsigneeAddressId() {
		return this.orderConsigneeAddressId;
	}

	public void setOrderConsigneeAddressId(Integer orderConsigneeAddressId) {
		this.orderConsigneeAddressId = orderConsigneeAddressId;
	}

	@Column(name = "OrderDescribe", length = 1024)
	public String getOrderDescribe() {
		return this.orderDescribe;
	}

	public void setOrderDescribe(String orderDescribe) {
		this.orderDescribe = orderDescribe;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "orderlist")
	public Set<Memberlist> getMemberlists() {
		return this.memberlists;
	}

	public void setMemberlists(Set<Memberlist> memberlists) {
		this.memberlists = memberlists;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "orderlist")
	public Set<Harvestaddresstable> getHarvestaddresstables() {
		return this.harvestaddresstables;
	}

	public void setHarvestaddresstables(
			Set<Harvestaddresstable> harvestaddresstables) {
		this.harvestaddresstables = harvestaddresstables;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "orderlist")
	public Set<Orderstate> getOrderstates() {
		return this.orderstates;
	}

	public void setOrderstates(Set<Orderstate> orderstates) {
		this.orderstates = orderstates;
	}

}