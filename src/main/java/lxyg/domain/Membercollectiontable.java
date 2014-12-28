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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Membercollectiontable entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "membercollectiontable", catalog = "lxyg")
public class Membercollectiontable implements java.io.Serializable {

	// Fields

	private Integer id;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private Integer memberId;
	private Integer goodsId;
	private Set<Memberlist> memberlists = new HashSet<Memberlist>(0);
	private Set<Commoditylist> commoditylists = new HashSet<Commoditylist>(0);

	// Constructors

	/** default constructor */
	public Membercollectiontable() {
	}

	/** minimal constructor */
	public Membercollectiontable(Timestamp timeAdd, Timestamp timeUpdate,
			Integer memberId, Integer goodsId) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.memberId = memberId;
		this.goodsId = goodsId;
	}

	/** full constructor */
	public Membercollectiontable(Timestamp timeAdd, Timestamp timeUpdate,
			Integer memberId, Integer goodsId, Set<Memberlist> memberlists,
			Set<Commoditylist> commoditylists) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.memberId = memberId;
		this.goodsId = goodsId;
		this.memberlists = memberlists;
		this.commoditylists = commoditylists;
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

	@Column(name = "MemberId", nullable = false)
	public Integer getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	@Column(name = "GoodsId", nullable = false)
	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "membercollectiontable")
	public Set<Memberlist> getMemberlists() {
		return this.memberlists;
	}

	public void setMemberlists(Set<Memberlist> memberlists) {
		this.memberlists = memberlists;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "membercollectiontable")
	public Set<Commoditylist> getCommoditylists() {
		return this.commoditylists;
	}

	public void setCommoditylists(Set<Commoditylist> commoditylists) {
		this.commoditylists = commoditylists;
	}

}