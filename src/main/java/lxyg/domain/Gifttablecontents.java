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
 * Gifttablecontents entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "gifttablecontents", catalog = "lxyg")
public class Gifttablecontents implements java.io.Serializable {

	// Fields

	private Integer id;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private Integer goodsId;
	private String giftId;
	private Set<Commoditylist> commoditylists = new HashSet<Commoditylist>(0);
	private Set<Gifttable> gifttables = new HashSet<Gifttable>(0);

	// Constructors

	/** default constructor */
	public Gifttablecontents() {
	}

	/** minimal constructor */
	public Gifttablecontents(Integer id, Timestamp timeAdd, Timestamp timeUpdate) {
		this.id = id;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Gifttablecontents(Integer id, Timestamp timeAdd,
			Timestamp timeUpdate, Integer goodsId, String giftId,
			Set<Commoditylist> commoditylists, Set<Gifttable> gifttables) {
		this.id = id;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.goodsId = goodsId;
		this.giftId = giftId;
		this.commoditylists = commoditylists;
		this.gifttables = gifttables;
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

	@Column(name = "GoodsId")
	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	@Column(name = "GiftId", length = 10)
	public String getGiftId() {
		return this.giftId;
	}

	public void setGiftId(String giftId) {
		this.giftId = giftId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gifttablecontents")
	public Set<Commoditylist> getCommoditylists() {
		return this.commoditylists;
	}

	public void setCommoditylists(Set<Commoditylist> commoditylists) {
		this.commoditylists = commoditylists;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gifttablecontents")
	public Set<Gifttable> getGifttables() {
		return this.gifttables;
	}

	public void setGifttables(Set<Gifttable> gifttables) {
		this.gifttables = gifttables;
	}

}