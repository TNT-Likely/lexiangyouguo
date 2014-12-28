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
 * Promotionalofferstable entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "promotionalofferstable", catalog = "lxyg")
public class Promotionalofferstable implements java.io.Serializable {

	// Fields

	private Integer id;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private Integer goodsId;
	private Integer preferentialTypeId;
	private Float preferentialDiscount;
	private Set<Dailyspecials> dailyspecialses = new HashSet<Dailyspecials>(0);
	private Set<Holidayspecialarea> holidayspecialareas = new HashSet<Holidayspecialarea>(
			0);
	private Set<Preferentialtype> preferentialtypes = new HashSet<Preferentialtype>(
			0);

	// Constructors

	/** default constructor */
	public Promotionalofferstable() {
	}

	/** minimal constructor */
	public Promotionalofferstable(Timestamp timeAdd, Timestamp timeUpdate) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Promotionalofferstable(Timestamp timeAdd, Timestamp timeUpdate,
			Integer goodsId, Integer preferentialTypeId,
			Float preferentialDiscount, Set<Dailyspecials> dailyspecialses,
			Set<Holidayspecialarea> holidayspecialareas,
			Set<Preferentialtype> preferentialtypes) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.goodsId = goodsId;
		this.preferentialTypeId = preferentialTypeId;
		this.preferentialDiscount = preferentialDiscount;
		this.dailyspecialses = dailyspecialses;
		this.holidayspecialareas = holidayspecialareas;
		this.preferentialtypes = preferentialtypes;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "promotionalofferstable")
	public Set<Dailyspecials> getDailyspecialses() {
		return this.dailyspecialses;
	}

	public void setDailyspecialses(Set<Dailyspecials> dailyspecialses) {
		this.dailyspecialses = dailyspecialses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "promotionalofferstable")
	public Set<Holidayspecialarea> getHolidayspecialareas() {
		return this.holidayspecialareas;
	}

	public void setHolidayspecialareas(
			Set<Holidayspecialarea> holidayspecialareas) {
		this.holidayspecialareas = holidayspecialareas;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "promotionalofferstable")
	public Set<Preferentialtype> getPreferentialtypes() {
		return this.preferentialtypes;
	}

	public void setPreferentialtypes(Set<Preferentialtype> preferentialtypes) {
		this.preferentialtypes = preferentialtypes;
	}

}