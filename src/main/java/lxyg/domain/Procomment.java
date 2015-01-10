package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Procomment entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "procomment", catalog = "lxyg")
public class Procomment implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer proId;
	private Integer memId;
	private Boolean proComIsShoOrder;
	private Integer proComLevel;
	private Integer proComStaLevel;
	private String proComContent;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;

	// Constructors

	/** default constructor */
	public Procomment() {
	}

	/** minimal constructor */
	public Procomment(Integer proId, Integer memId, Integer proComLevel,
			Integer proComStaLevel, String proComContent, Timestamp timeAdd,
			Timestamp timeUpdate) {
		this.proId = proId;
		this.memId = memId;
		this.proComLevel = proComLevel;
		this.proComStaLevel = proComStaLevel;
		this.proComContent = proComContent;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Procomment(Integer proId, Integer memId, Boolean proComIsShoOrder,
			Integer proComLevel, Integer proComStaLevel, String proComContent,
			Timestamp timeAdd, Timestamp timeUpdate) {
		this.proId = proId;
		this.memId = memId;
		this.proComIsShoOrder = proComIsShoOrder;
		this.proComLevel = proComLevel;
		this.proComStaLevel = proComStaLevel;
		this.proComContent = proComContent;
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

	@Column(name = "MemId", nullable = false)
	public Integer getMemId() {
		return this.memId;
	}

	public void setMemId(Integer memId) {
		this.memId = memId;
	}

	@Column(name = "ProComIsShoOrder")
	public Boolean getProComIsShoOrder() {
		return this.proComIsShoOrder;
	}

	public void setProComIsShoOrder(Boolean proComIsShoOrder) {
		this.proComIsShoOrder = proComIsShoOrder;
	}

	@Column(name = "ProComLevel", nullable = false)
	public Integer getProComLevel() {
		return this.proComLevel;
	}

	public void setProComLevel(Integer proComLevel) {
		this.proComLevel = proComLevel;
	}

	@Column(name = "ProComStaLevel", nullable = false)
	public Integer getProComStaLevel() {
		return this.proComStaLevel;
	}

	public void setProComStaLevel(Integer proComStaLevel) {
		this.proComStaLevel = proComStaLevel;
	}

	@Column(name = "ProComContent", nullable = false)
	public String getProComContent() {
		return this.proComContent;
	}

	public void setProComContent(String proComContent) {
		this.proComContent = proComContent;
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