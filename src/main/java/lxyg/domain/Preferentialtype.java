package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Preferentialtype entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "preferentialtype", catalog = "lxyg")
public class Preferentialtype implements java.io.Serializable {

	// Fields

	private Integer id;
	private Promotionalofferstable promotionalofferstable;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private Float preferentialPercentage;
	private Integer preferentialReducePrice;
	private Integer preferentialArrivalIntegral;

	// Constructors

	/** default constructor */
	public Preferentialtype() {
	}

	/** minimal constructor */
	public Preferentialtype(Timestamp timeAdd, Timestamp timeUpdate) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Preferentialtype(Promotionalofferstable promotionalofferstable,
			Timestamp timeAdd, Timestamp timeUpdate,
			Float preferentialPercentage, Integer preferentialReducePrice,
			Integer preferentialArrivalIntegral) {
		this.promotionalofferstable = promotionalofferstable;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.preferentialPercentage = preferentialPercentage;
		this.preferentialReducePrice = preferentialReducePrice;
		this.preferentialArrivalIntegral = preferentialArrivalIntegral;
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
	@JoinColumn(name = "Pro_Id")
	public Promotionalofferstable getPromotionalofferstable() {
		return this.promotionalofferstable;
	}

	public void setPromotionalofferstable(
			Promotionalofferstable promotionalofferstable) {
		this.promotionalofferstable = promotionalofferstable;
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

	@Column(name = "PreferentialPercentage", precision = 12, scale = 0)
	public Float getPreferentialPercentage() {
		return this.preferentialPercentage;
	}

	public void setPreferentialPercentage(Float preferentialPercentage) {
		this.preferentialPercentage = preferentialPercentage;
	}

	@Column(name = "PreferentialReducePrice")
	public Integer getPreferentialReducePrice() {
		return this.preferentialReducePrice;
	}

	public void setPreferentialReducePrice(Integer preferentialReducePrice) {
		this.preferentialReducePrice = preferentialReducePrice;
	}

	@Column(name = "PreferentialArrivalIntegral")
	public Integer getPreferentialArrivalIntegral() {
		return this.preferentialArrivalIntegral;
	}

	public void setPreferentialArrivalIntegral(
			Integer preferentialArrivalIntegral) {
		this.preferentialArrivalIntegral = preferentialArrivalIntegral;
	}

}