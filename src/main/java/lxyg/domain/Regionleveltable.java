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
 * Regionleveltable entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "regionleveltable", catalog = "lxyg")
public class Regionleveltable implements java.io.Serializable {

	// Fields

	private Integer id;
	private Regionlist regionlist;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private String regionLevelProvince;
	private String regionLevelCity;
	private String regionLevelCounty;
	private String regionLevelTown;
	private Set<Regionlist> regionlists = new HashSet<Regionlist>(0);

	// Constructors

	/** default constructor */
	public Regionleveltable() {
	}

	/** minimal constructor */
	public Regionleveltable(Timestamp timeAdd, Timestamp timeUpdate) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Regionleveltable(Regionlist regionlist, Timestamp timeAdd,
			Timestamp timeUpdate, String regionLevelProvince,
			String regionLevelCity, String regionLevelCounty,
			String regionLevelTown, Set<Regionlist> regionlists) {
		this.regionlist = regionlist;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.regionLevelProvince = regionLevelProvince;
		this.regionLevelCity = regionLevelCity;
		this.regionLevelCounty = regionLevelCounty;
		this.regionLevelTown = regionLevelTown;
		this.regionlists = regionlists;
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
	@JoinColumn(name = "Reg_Id")
	public Regionlist getRegionlist() {
		return this.regionlist;
	}

	public void setRegionlist(Regionlist regionlist) {
		this.regionlist = regionlist;
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

	@Column(name = "RegionLevel_Province", length = 1024)
	public String getRegionLevelProvince() {
		return this.regionLevelProvince;
	}

	public void setRegionLevelProvince(String regionLevelProvince) {
		this.regionLevelProvince = regionLevelProvince;
	}

	@Column(name = "RegionLevel_City", length = 1024)
	public String getRegionLevelCity() {
		return this.regionLevelCity;
	}

	public void setRegionLevelCity(String regionLevelCity) {
		this.regionLevelCity = regionLevelCity;
	}

	@Column(name = "RegionLevel_County", length = 1024)
	public String getRegionLevelCounty() {
		return this.regionLevelCounty;
	}

	public void setRegionLevelCounty(String regionLevelCounty) {
		this.regionLevelCounty = regionLevelCounty;
	}

	@Column(name = "RegionLevel_Town", length = 1024)
	public String getRegionLevelTown() {
		return this.regionLevelTown;
	}

	public void setRegionLevelTown(String regionLevelTown) {
		this.regionLevelTown = regionLevelTown;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "regionleveltable")
	public Set<Regionlist> getRegionlists() {
		return this.regionlists;
	}

	public void setRegionlists(Set<Regionlist> regionlists) {
		this.regionlists = regionlists;
	}

}