package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Displaytype entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "displaytype", catalog = "lxyg")
public class Displaytype implements java.io.Serializable {

	// Fields

	private Integer id;
	private Link link;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private String displayLogoType;
	private String displayTextType;

	// Constructors

	/** default constructor */
	public Displaytype() {
	}

	/** minimal constructor */
	public Displaytype(Integer id, Timestamp timeAdd, Timestamp timeUpdate) {
		this.id = id;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Displaytype(Integer id, Link link, Timestamp timeAdd,
			Timestamp timeUpdate, String displayLogoType, String displayTextType) {
		this.id = id;
		this.link = link;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.displayLogoType = displayLogoType;
		this.displayTextType = displayTextType;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Lin_Id")
	public Link getLink() {
		return this.link;
	}

	public void setLink(Link link) {
		this.link = link;
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

	@Column(name = "Display_LogoType", length = 1024)
	public String getDisplayLogoType() {
		return this.displayLogoType;
	}

	public void setDisplayLogoType(String displayLogoType) {
		this.displayLogoType = displayLogoType;
	}

	@Column(name = "Display_TextType", length = 1024)
	public String getDisplayTextType() {
		return this.displayTextType;
	}

	public void setDisplayTextType(String displayTextType) {
		this.displayTextType = displayTextType;
	}

}