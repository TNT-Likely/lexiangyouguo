package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Procover entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "procover", catalog = "lxyg")
public class Procover implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer proId;
	private String proCovUrl;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;

	// Constructors

	/** default constructor */
	public Procover() {
	}

	/** minimal constructor */
	public Procover(Timestamp timeAdd, Timestamp timeUpdate) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Procover(Integer proId, String proCovUrl, Timestamp timeAdd,
			Timestamp timeUpdate) {
		this.proId = proId;
		this.proCovUrl = proCovUrl;
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

	@Column(name = "ProId")
	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	@Column(name = "ProCovUrl")
	public String getProCovUrl() {
		return this.proCovUrl;
	}

	public void setProCovUrl(String proCovUrl) {
		this.proCovUrl = proCovUrl;
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