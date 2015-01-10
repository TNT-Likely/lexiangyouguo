package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Memberregistrationitems entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "memberregistrationitems", catalog = "lxyg")
public class Memberregistrationitems implements java.io.Serializable {

	// Fields

	private Integer id;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private String mriName;
	private String mriWeightsSorting;
	private Boolean whetherShown;
	private Boolean mriWhetherRequired;

	// Constructors

	/** default constructor */
	public Memberregistrationitems() {
	}

	/** minimal constructor */
	public Memberregistrationitems(Timestamp timeAdd, Timestamp timeUpdate) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Memberregistrationitems(Timestamp timeAdd, Timestamp timeUpdate,
			String mriName, String mriWeightsSorting, Boolean whetherShown,
			Boolean mriWhetherRequired) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.mriName = mriName;
		this.mriWeightsSorting = mriWeightsSorting;
		this.whetherShown = whetherShown;
		this.mriWhetherRequired = mriWhetherRequired;
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

	@Column(name = "MRI_Name", length = 1024)
	public String getMriName() {
		return this.mriName;
	}

	public void setMriName(String mriName) {
		this.mriName = mriName;
	}

	@Column(name = "MRI_WeightsSorting", length = 1024)
	public String getMriWeightsSorting() {
		return this.mriWeightsSorting;
	}

	public void setMriWeightsSorting(String mriWeightsSorting) {
		this.mriWeightsSorting = mriWeightsSorting;
	}

	@Column(name = "WhetherShown")
	public Boolean getWhetherShown() {
		return this.whetherShown;
	}

	public void setWhetherShown(Boolean whetherShown) {
		this.whetherShown = whetherShown;
	}

	@Column(name = "MRI_WhetherRequired")
	public Boolean getMriWhetherRequired() {
		return this.mriWhetherRequired;
	}

	public void setMriWhetherRequired(Boolean mriWhetherRequired) {
		this.mriWhetherRequired = mriWhetherRequired;
	}

}