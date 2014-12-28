package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Dailyspecials entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "dailyspecials", catalog = "lxyg")
public class Dailyspecials implements java.io.Serializable {

	// Fields

	private DailyspecialsId id;
	private Promotionalofferstable promotionalofferstable;
	private Integer goodsId;
	private Integer preferentialTypeId;
	private Float preferentialDiscount;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;

	// Constructors

	/** default constructor */
	public Dailyspecials() {
	}

	/** minimal constructor */
	public Dailyspecials(DailyspecialsId id,
			Promotionalofferstable promotionalofferstable, Timestamp timeAdd,
			Timestamp timeUpdate) {
		this.id = id;
		this.promotionalofferstable = promotionalofferstable;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Dailyspecials(DailyspecialsId id,
			Promotionalofferstable promotionalofferstable, Integer goodsId,
			Integer preferentialTypeId, Float preferentialDiscount,
			Timestamp timeAdd, Timestamp timeUpdate) {
		this.id = id;
		this.promotionalofferstable = promotionalofferstable;
		this.goodsId = goodsId;
		this.preferentialTypeId = preferentialTypeId;
		this.preferentialDiscount = preferentialDiscount;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "Id", nullable = false)),
			@AttributeOverride(name = "proId", column = @Column(name = "Pro_Id", nullable = false)) })
	public DailyspecialsId getId() {
		return this.id;
	}

	public void setId(DailyspecialsId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Pro_Id", nullable = false, insertable = false, updatable = false)
	public Promotionalofferstable getPromotionalofferstable() {
		return this.promotionalofferstable;
	}

	public void setPromotionalofferstable(
			Promotionalofferstable promotionalofferstable) {
		this.promotionalofferstable = promotionalofferstable;
	}

	@Column(name = "GoodsId")
	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	@Column(name = "PreferentialTypeId")
	public Integer getPreferentialTypeId() {
		return this.preferentialTypeId;
	}

	public void setPreferentialTypeId(Integer preferentialTypeId) {
		this.preferentialTypeId = preferentialTypeId;
	}

	@Column(name = "PreferentialDiscount", precision = 12, scale = 0)
	public Float getPreferentialDiscount() {
		return this.preferentialDiscount;
	}

	public void setPreferentialDiscount(Float preferentialDiscount) {
		this.preferentialDiscount = preferentialDiscount;
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

}