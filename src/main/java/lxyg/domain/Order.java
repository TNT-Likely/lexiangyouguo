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
 * Order entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "order", catalog = "lxyg")
public class Order implements java.io.Serializable {

	// Fields

	private Integer id;
	private Member member;
	private Product product;
	private Integer orderNumber;
	private Timestamp orderTime;
	private Float orderTotalMoney;
	private Float orderPayMoney;
	private String orderDescribe;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private Set<Harvestaddresstable> harvestaddresstables = new HashSet<Harvestaddresstable>(
			0);
	private Set<Orderstate> orderstates = new HashSet<Orderstate>(0);
	private Set<Ordercomments> ordercommentses = new HashSet<Ordercomments>(0);

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(Member member, Product product, Integer orderNumber,
			Timestamp orderTime, Float orderTotalMoney, Float orderPayMoney,
			Timestamp timeAdd) {
		this.member = member;
		this.product = product;
		this.orderNumber = orderNumber;
		this.orderTime = orderTime;
		this.orderTotalMoney = orderTotalMoney;
		this.orderPayMoney = orderPayMoney;
		this.timeAdd = timeAdd;
	}

	/** full constructor */
	public Order(Member member, Product product, Integer orderNumber,
			Timestamp orderTime, Float orderTotalMoney, Float orderPayMoney,
			String orderDescribe, Timestamp timeAdd, Timestamp timeUpdate,
			Set<Harvestaddresstable> harvestaddresstables,
			Set<Orderstate> orderstates, Set<Ordercomments> ordercommentses) {
		this.member = member;
		this.product = product;
		this.orderNumber = orderNumber;
		this.orderTime = orderTime;
		this.orderTotalMoney = orderTotalMoney;
		this.orderPayMoney = orderPayMoney;
		this.orderDescribe = orderDescribe;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.harvestaddresstables = harvestaddresstables;
		this.orderstates = orderstates;
		this.ordercommentses = ordercommentses;
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
	@JoinColumn(name = "MemberId", nullable = false)
	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "proId", nullable = false)
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "order")
	public Set<Harvestaddresstable> getHarvestaddresstables() {
		return this.harvestaddresstables;
	}

	public void setHarvestaddresstables(
			Set<Harvestaddresstable> harvestaddresstables) {
		this.harvestaddresstables = harvestaddresstables;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "order")
	public Set<Orderstate> getOrderstates() {
		return this.orderstates;
	}

	public void setOrderstates(Set<Orderstate> orderstates) {
		this.orderstates = orderstates;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "order")
	public Set<Ordercomments> getOrdercommentses() {
		return this.ordercommentses;
	}

	public void setOrdercommentses(Set<Ordercomments> ordercommentses) {
		this.ordercommentses = ordercommentses;
	}

}