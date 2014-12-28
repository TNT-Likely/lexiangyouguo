package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Articleclassification entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "articleclassification", catalog = "lxyg")
public class Articleclassification implements java.io.Serializable {

	// Fields

	private Integer id;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private String articleClassName;
	private String articleClassStyle;
	private String articleClassDescripetion;
	private String articleClassWhetherNavigationBarDisplay;
	private String articleClassSorting;

	// Constructors

	/** default constructor */
	public Articleclassification() {
	}

	/** minimal constructor */
	public Articleclassification(Integer id, Timestamp timeAdd,
			Timestamp timeUpdate, String articleClassName) {
		this.id = id;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.articleClassName = articleClassName;
	}

	/** full constructor */
	public Articleclassification(Integer id, Timestamp timeAdd,
			Timestamp timeUpdate, String articleClassName,
			String articleClassStyle, String articleClassDescripetion,
			String articleClassWhetherNavigationBarDisplay,
			String articleClassSorting) {
		this.id = id;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.articleClassName = articleClassName;
		this.articleClassStyle = articleClassStyle;
		this.articleClassDescripetion = articleClassDescripetion;
		this.articleClassWhetherNavigationBarDisplay = articleClassWhetherNavigationBarDisplay;
		this.articleClassSorting = articleClassSorting;
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

	@Column(name = "ArticleClass_Name", nullable = false, length = 1024)
	public String getArticleClassName() {
		return this.articleClassName;
	}

	public void setArticleClassName(String articleClassName) {
		this.articleClassName = articleClassName;
	}

	@Column(name = "ArticleClass_Style", length = 1024)
	public String getArticleClassStyle() {
		return this.articleClassStyle;
	}

	public void setArticleClassStyle(String articleClassStyle) {
		this.articleClassStyle = articleClassStyle;
	}

	@Column(name = "ArticleClass_Descripetion", length = 1024)
	public String getArticleClassDescripetion() {
		return this.articleClassDescripetion;
	}

	public void setArticleClassDescripetion(String articleClassDescripetion) {
		this.articleClassDescripetion = articleClassDescripetion;
	}

	@Column(name = "ArticleClass_WhetherNavigationBarDisplay", length = 1024)
	public String getArticleClassWhetherNavigationBarDisplay() {
		return this.articleClassWhetherNavigationBarDisplay;
	}

	public void setArticleClassWhetherNavigationBarDisplay(
			String articleClassWhetherNavigationBarDisplay) {
		this.articleClassWhetherNavigationBarDisplay = articleClassWhetherNavigationBarDisplay;
	}

	@Column(name = "ArticleClass_Sorting", length = 10)
	public String getArticleClassSorting() {
		return this.articleClassSorting;
	}

	public void setArticleClassSorting(String articleClassSorting) {
		this.articleClassSorting = articleClassSorting;
	}

}