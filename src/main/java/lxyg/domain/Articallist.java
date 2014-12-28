package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Articallist entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "articallist", catalog = "lxyg")
public class Articallist implements java.io.Serializable {

	// Fields

	private Integer id;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private Integer number;
	private String articaTitle;
	private String articaClassification;
	private String articalImportant;
	private Boolean whetherShown;
	private Timestamp addTime;

	// Constructors

	/** default constructor */
	public Articallist() {
	}

	/** minimal constructor */
	public Articallist(Integer id, Timestamp timeAdd, Timestamp timeUpdate,
			Timestamp addTime) {
		this.id = id;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.addTime = addTime;
	}

	/** full constructor */
	public Articallist(Integer id, Timestamp timeAdd, Timestamp timeUpdate,
			Integer number, String articaTitle, String articaClassification,
			String articalImportant, Boolean whetherShown, Timestamp addTime) {
		this.id = id;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.number = number;
		this.articaTitle = articaTitle;
		this.articaClassification = articaClassification;
		this.articalImportant = articalImportant;
		this.whetherShown = whetherShown;
		this.addTime = addTime;
	}

	// Property accessors
	@Id
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

	@Column(name = "Number")
	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Column(name = "ArticaTitle", length = 1024)
	public String getArticaTitle() {
		return this.articaTitle;
	}

	public void setArticaTitle(String articaTitle) {
		this.articaTitle = articaTitle;
	}

	@Column(name = "ArticaClassification", length = 1024)
	public String getArticaClassification() {
		return this.articaClassification;
	}

	public void setArticaClassification(String articaClassification) {
		this.articaClassification = articaClassification;
	}

	@Column(name = "ArticalImportant", length = 1024)
	public String getArticalImportant() {
		return this.articalImportant;
	}

	public void setArticalImportant(String articalImportant) {
		this.articalImportant = articalImportant;
	}

	@Column(name = "WhetherShown")
	public Boolean getWhetherShown() {
		return this.whetherShown;
	}

	public void setWhetherShown(Boolean whetherShown) {
		this.whetherShown = whetherShown;
	}

	@Column(name = "AddTime", nullable = false, length = 19)
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

}