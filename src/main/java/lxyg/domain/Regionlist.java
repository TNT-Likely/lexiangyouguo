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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Regionlist entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "regionlist", catalog = "lxyg")
public class Regionlist implements java.io.Serializable {

	// Fields

	private Integer id;
	private Regionleveltable regionleveltable;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private String regionName;
	private Set<Regionleveltable> regionleveltables = new HashSet<Regionleveltable>(
			0);

	// Constructors

	/** default constructor */
	public Regionlist() {
	}

	/** minimal constructor */
	public Regionlist(Timestamp timeAdd, Timestamp timeUpdate) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Regionlist(Regionleveltable regionleveltable, Timestamp timeAdd,
			Timestamp timeUpdate, String regionName,
			Set<Regionleveltable> regionleveltables) {
		this.regionleveltable = regionleveltable;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.regionName = regionName;
		this.regionleveltables = regionleveltables;
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
	@JoinColumn(name = "RegionLevelId")
	public Regionleveltable getRegionleveltable() {
		return this.regionleveltable;
	}

	public void setRegionleveltable(Regionleveltable regionleveltable) {
		this.regionleveltable = regionleveltable;
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

	@Column(name = "RegionName", length = 1024)
	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "regionlist")
	public Set<Regionleveltable> getRegionleveltables() {
		return this.regionleveltables;
	}

	public void setRegionleveltables(Set<Regionleveltable> regionleveltables) {
		this.regionleveltables = regionleveltables;
	}

}