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
 * Holidayspecialarea entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "holidayspecialarea", catalog = "lxyg")
public class Holidayspecialarea implements java.io.Serializable {

	// Fields

	private HolidayspecialareaId id;
	private Preferentialtype preferentialtype;
	private Promotionalofferstable promotionalofferstable;
	private Product product;
	private Integer goodsId;
	private Integer preferentialTypeId;
	private Float preferentialDiscount;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private String holidaySpeciaMeaning;

	// Constructors

	/** default constructor */
	public Holidayspecialarea() {
	}

	/** minimal constructor */
	public Holidayspecialarea(HolidayspecialareaId id,
			Promotionalofferstable promotionalofferstable, Timestamp timeAdd,
			Timestamp timeUpdate) {
		this.id = id;
		this.promotionalofferstable = promotionalofferstable;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Holidayspecialarea(HolidayspecialareaId id,
			Preferentialtype preferentialtype,
			Promotionalofferstable promotionalofferstable, Product product,
			Integer goodsId, Integer preferentialTypeId,
			Float preferentialDiscount, Timestamp timeAdd,
			Timestamp timeUpdate, String holidaySpeciaMeaning) {
		this.id = id;
		this.preferentialtype = preferentialtype;
		this.promotionalofferstable = promotionalofferstable;
		this.product = product;
		this.goodsId = goodsId;
		this.preferentialTypeId = preferentialTypeId;
		this.preferentialDiscount = preferentialDiscount;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.holidaySpeciaMeaning = holidaySpeciaMeaning;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "Id", nullable = false)),
			@AttributeOverride(name = "proId", column = @Column(name = "Pro_Id", nullable = false)) })
	public HolidayspecialareaId getId() {
		return this.id;
	}

	public void setId(HolidayspecialareaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Pre_Id")
	public Preferentialtype getPreferentialtype() {
		return this.preferentialtype;
	}

	public void setPreferentialtype(Preferentialtype preferentialtype) {
		this.preferentialtype = preferentialtype;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "proId")
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
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

	@Column(name = "HolidaySpeciaMeaning", length = 1024)
	public String getHolidaySpeciaMeaning() {
		return this.holidaySpeciaMeaning;
	}

	public void setHolidaySpeciaMeaning(String holidaySpeciaMeaning) {
		this.holidaySpeciaMeaning = holidaySpeciaMeaning;
	}

}