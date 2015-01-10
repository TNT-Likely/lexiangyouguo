package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Regionlevel entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "regionlevel", catalog = "lxyg")
public class Regionlevel implements java.io.Serializable {

	// Fields

	private Integer id;
	private String regionLevelCity;
	private String regionLevelCounty;
	private String regionLevelProvince;
	private String regionLevelTown;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;

	// Constructors

	/** default constructor */
	public Regionlevel() {
	}

	/** minimal constructor */
	public Regionlevel(Timestamp timeAdd, Timestamp timeUpdate) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Regionlevel(String regionLevelCity, String regionLevelCounty,
			String regionLevelProvince, String regionLevelTown,
			Timestamp timeAdd, Timestamp timeUpdate) {
		this.regionLevelCity = regionLevelCity;
		this.regionLevelCounty = regionLevelCounty;
		this.regionLevelProvince = regionLevelProvince;
		this.regionLevelTown = regionLevelTown;
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

	@Column(name = "RegionLevel_City")
	public String getRegionLevelCity() {
		return this.regionLevelCity;
	}

	public void setRegionLevelCity(String regionLevelCity) {
		this.regionLevelCity = regionLevelCity;
	}

	@Column(name = "RegionLevel_County")
	public String getRegionLevelCounty() {
		return this.regionLevelCounty;
	}

	public void setRegionLevelCounty(String regionLevelCounty) {
		this.regionLevelCounty = regionLevelCounty;
	}

	@Column(name = "RegionLevel_Province")
	public String getRegionLevelProvince() {
		return this.regionLevelProvince;
	}

	public void setRegionLevelProvince(String regionLevelProvince) {
		this.regionLevelProvince = regionLevelProvince;
	}

	@Column(name = "RegionLevel_Town")
	public String getRegionLevelTown() {
		return this.regionLevelTown;
	}

	public void setRegionLevelTown(String regionLevelTown) {
		this.regionLevelTown = regionLevelTown;
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