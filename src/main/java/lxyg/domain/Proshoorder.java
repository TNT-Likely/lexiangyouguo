package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Proshoorder entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "proshoorder", catalog = "lxyg")
public class Proshoorder implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer proComId;
	private String proShoOrdUrl;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;

	// Constructors

	/** default constructor */
	public Proshoorder() {
	}

	/** full constructor */
	public Proshoorder(Integer proComId, String proShoOrdUrl,
			Timestamp timeAdd, Timestamp timeUpdate) {
		this.proComId = proComId;
		this.proShoOrdUrl = proShoOrdUrl;
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

	@Column(name = "ProComId", nullable = false)
	public Integer getProComId() {
		return this.proComId;
	}

	public void setProComId(Integer proComId) {
		this.proComId = proComId;
	}

	@Column(name = "ProShoOrdUrl", nullable = false)
	public String getProShoOrdUrl() {
		return this.proShoOrdUrl;
	}

	public void setProShoOrdUrl(String proShoOrdUrl) {
		this.proShoOrdUrl = proShoOrdUrl;
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