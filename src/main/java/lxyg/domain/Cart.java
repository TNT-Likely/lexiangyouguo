package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cart entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "cart", catalog = "lxyg")
public class Cart implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer proId;
	private Integer proNumber;
	private Float proTotalMoney;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;

	// Constructors

	/** default constructor */
	public Cart() {
	}

	/** full constructor */
	public Cart(Integer proId, Integer proNumber, Float proTotalMoney,
			Timestamp timeAdd, Timestamp timeUpdate) {
		this.proId = proId;
		this.proNumber = proNumber;
		this.proTotalMoney = proTotalMoney;
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

	@Column(name = "ProId", nullable = false)
	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	@Column(name = "ProNumber", nullable = false)
	public Integer getProNumber() {
		return this.proNumber;
	}

	public void setProNumber(Integer proNumber) {
		this.proNumber = proNumber;
	}

	@Column(name = "ProTotalMoney", nullable = false, precision = 10, scale = 0)
	public Float getProTotalMoney() {
		return this.proTotalMoney;
	}

	public void setProTotalMoney(Float proTotalMoney) {
		this.proTotalMoney = proTotalMoney;
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