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
 * Commodityclassification entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "commodityclassification", catalog = "lxyg")
public class Commodityclassification implements java.io.Serializable {

	// Fields

	private Integer id;
	private Commoditylist commoditylist;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private String classificationName;
	private String classificationDiscript;

	// Constructors

	/** default constructor */
	public Commodityclassification() {
	}

	/** minimal constructor */
	public Commodityclassification(Timestamp timeAdd, Timestamp timeUpdate,
			String classificationName) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.classificationName = classificationName;
	}

	/** full constructor */
	public Commodityclassification(Commoditylist commoditylist,
			Timestamp timeAdd, Timestamp timeUpdate, String classificationName,
			String classificationDiscript) {
		this.commoditylist = commoditylist;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.classificationName = classificationName;
		this.classificationDiscript = classificationDiscript;
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
	@JoinColumn(name = "Com_Id")
	public Commoditylist getCommoditylist() {
		return this.commoditylist;
	}

	public void setCommoditylist(Commoditylist commoditylist) {
		this.commoditylist = commoditylist;
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

	@Column(name = "ClassificationName", nullable = false, length = 1024)
	public String getClassificationName() {
		return this.classificationName;
	}

	public void setClassificationName(String classificationName) {
		this.classificationName = classificationName;
	}

	@Column(name = "ClassificationDiscript", length = 1024)
	public String getClassificationDiscript() {
		return this.classificationDiscript;
	}

	public void setClassificationDiscript(String classificationDiscript) {
		this.classificationDiscript = classificationDiscript;
	}

}