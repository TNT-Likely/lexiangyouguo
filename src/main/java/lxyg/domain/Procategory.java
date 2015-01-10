package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Procategory entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "procategory", catalog = "lxyg")
public class Procategory implements java.io.Serializable {

	// Fields

	private Integer id;
	private String proCatName;
	private String proCatDescibe;
	private Integer proCatLevel;
	private Integer proCatParId;
	private Integer proCatSort;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;

	// Constructors

	/** default constructor */
	public Procategory() {
	}

	/** minimal constructor */
	public Procategory(String proCatName, Integer proCatLevel,
			Timestamp timeAdd, Timestamp timeUpdate) {
		this.proCatName = proCatName;
		this.proCatLevel = proCatLevel;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Procategory(String proCatName, String proCatDescibe,
			Integer proCatLevel, Integer proCatParId, Integer proCatSort,
			Timestamp timeAdd, Timestamp timeUpdate) {
		this.proCatName = proCatName;
		this.proCatDescibe = proCatDescibe;
		this.proCatLevel = proCatLevel;
		this.proCatParId = proCatParId;
		this.proCatSort = proCatSort;
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

	@Column(name = "ProCatName", nullable = false)
	public String getProCatName() {
		return this.proCatName;
	}

	public void setProCatName(String proCatName) {
		this.proCatName = proCatName;
	}

	@Column(name = "ProCatDescibe")
	public String getProCatDescibe() {
		return this.proCatDescibe;
	}

	public void setProCatDescibe(String proCatDescibe) {
		this.proCatDescibe = proCatDescibe;
	}

	@Column(name = "ProCatLevel", nullable = false)
	public Integer getProCatLevel() {
		return this.proCatLevel;
	}

	public void setProCatLevel(Integer proCatLevel) {
		this.proCatLevel = proCatLevel;
	}

	@Column(name = "ProCatParId")
	public Integer getProCatParId() {
		return this.proCatParId;
	}

	public void setProCatParId(Integer proCatParId) {
		this.proCatParId = proCatParId;
	}

	@Column(name = "ProCatSort")
	public Integer getProCatSort() {
		return this.proCatSort;
	}

	public void setProCatSort(Integer proCatSort) {
		this.proCatSort = proCatSort;
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