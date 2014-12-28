package lxyg.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Ordercontentlist entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ordercontentlist", catalog = "lxyg")
public class Ordercontentlist implements java.io.Serializable {

	// Fields

	private Integer id;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private Integer orderId;
	private Integer goodsId;
	private Set<Orderlist> orderlists = new HashSet<Orderlist>(0);
	private Set<Commoditylist> commoditylists = new HashSet<Commoditylist>(0);

	// Constructors

	/** default constructor */
	public Ordercontentlist() {
	}

	/** minimal constructor */
	public Ordercontentlist(Integer id, Timestamp timeAdd,
			Timestamp timeUpdate, Integer orderId, Integer goodsId) {
		this.id = id;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.orderId = orderId;
		this.goodsId = goodsId;
	}

	/** full constructor */
	public Ordercontentlist(Integer id, Timestamp timeAdd,
			Timestamp timeUpdate, Integer orderId, Integer goodsId,
			Set<Orderlist> orderlists, Set<Commoditylist> commoditylists) {
		this.id = id;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.orderId = orderId;
		this.goodsId = goodsId;
		this.orderlists = orderlists;
		this.commoditylists = commoditylists;
	}

	// Property accessors
	@Id
	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Column(name = "OrderId", nullable = false)
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@Column(name = "GoodsId", nullable = false)
	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ordercontentlist")
	public Set<Orderlist> getOrderlists() {
		return this.orderlists;
	}

	public void setOrderlists(Set<Orderlist> orderlists) {
		this.orderlists = orderlists;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ordercontentlist")
	public Set<Commoditylist> getCommoditylists() {
		return this.commoditylists;
	}

	public void setCommoditylists(Set<Commoditylist> commoditylists) {
		this.commoditylists = commoditylists;
	}

}