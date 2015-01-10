package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Artical entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "artical", catalog = "lxyg")
public class Artical implements java.io.Serializable {

	// Fields

	private Integer id;
	private Timestamp addTime;
	private String articaClassification;
	private String articaTitle;
	private String articalImportant;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private Boolean whetherShown;

	// Constructors

	/** default constructor */
	public Artical() {
	}

	/** minimal constructor */
	public Artical(Timestamp addTime, String articaTitle, Timestamp timeAdd,
			Timestamp timeUpdate) {
		this.addTime = addTime;
		this.articaTitle = articaTitle;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Artical(Timestamp addTime, String articaClassification,
			String articaTitle, String articalImportant, Timestamp timeAdd,
			Timestamp timeUpdate, Boolean whetherShown) {
		this.addTime = addTime;
		this.articaClassification = articaClassification;
		this.articaTitle = articaTitle;
		this.articalImportant = articalImportant;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.whetherShown = whetherShown;
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

	@Column(name = "AddTime", nullable = false, length = 19)
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	@Column(name = "ArticaClassification")
	public String getArticaClassification() {
		return this.articaClassification;
	}

	public void setArticaClassification(String articaClassification) {
		this.articaClassification = articaClassification;
	}

	@Column(name = "ArticaTitle", nullable = false)
	public String getArticaTitle() {
		return this.articaTitle;
	}

	public void setArticaTitle(String articaTitle) {
		this.articaTitle = articaTitle;
	}

	@Column(name = "ArticalImportant")
	public String getArticalImportant() {
		return this.articalImportant;
	}

	public void setArticalImportant(String articalImportant) {
		this.articalImportant = articalImportant;
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

	@Column(name = "WhetherShown")
	public Boolean getWhetherShown() {
		return this.whetherShown;
	}

	public void setWhetherShown(Boolean whetherShown) {
		this.whetherShown = whetherShown;
	}

}