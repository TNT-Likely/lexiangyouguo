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
 * Link entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "link", catalog = "lxyg")
public class Link implements java.io.Serializable {

	// Fields

	private Integer id;
	private Displaytype displaytype;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private String linkName;
	private String linkAddress;
	private Integer linkSorting;
	private Set<Displaytype> displaytypes = new HashSet<Displaytype>(0);

	// Constructors

	/** default constructor */
	public Link() {
	}

	/** minimal constructor */
	public Link(Timestamp timeAdd, Timestamp timeUpdate, String linkName) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.linkName = linkName;
	}

	/** full constructor */
	public Link(Displaytype displaytype, Timestamp timeAdd,
			Timestamp timeUpdate, String linkName, String linkAddress,
			Integer linkSorting, Set<Displaytype> displaytypes) {
		this.displaytype = displaytype;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.linkName = linkName;
		this.linkAddress = linkAddress;
		this.linkSorting = linkSorting;
		this.displaytypes = displaytypes;
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
	@JoinColumn(name = "DisplayTypeId")
	public Displaytype getDisplaytype() {
		return this.displaytype;
	}

	public void setDisplaytype(Displaytype displaytype) {
		this.displaytype = displaytype;
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

	@Column(name = "LinkName", nullable = false, length = 1024)
	public String getLinkName() {
		return this.linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	@Column(name = "LinkAddress", length = 1024)
	public String getLinkAddress() {
		return this.linkAddress;
	}

	public void setLinkAddress(String linkAddress) {
		this.linkAddress = linkAddress;
	}

	@Column(name = "LinkSorting")
	public Integer getLinkSorting() {
		return this.linkSorting;
	}

	public void setLinkSorting(Integer linkSorting) {
		this.linkSorting = linkSorting;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "link")
	public Set<Displaytype> getDisplaytypes() {
		return this.displaytypes;
	}

	public void setDisplaytypes(Set<Displaytype> displaytypes) {
		this.displaytypes = displaytypes;
	}

}