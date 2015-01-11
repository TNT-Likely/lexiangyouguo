package lxyg.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Procomment entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "procomment", catalog = "lxyg")
public class Procomment implements java.io.Serializable {

	// Fields

	private Integer id;
	private Member member;
	private Product product;
	private Boolean proComIsShoOrder;
	private Integer proComLevel;
	private Integer proComStaLevel;
	private String proComContent;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private Set<Proshoorder> proshoorders = new HashSet<Proshoorder>(0);

	// Constructors

	/** default constructor */
	public Procomment() {
	}

	/** minimal constructor */
	public Procomment(Integer id, Member member, Product product,
			Integer proComLevel, Integer proComStaLevel, String proComContent,
			Timestamp timeAdd, Timestamp timeUpdate) {
		this.id = id;
		this.member = member;
		this.product = product;
		this.proComLevel = proComLevel;
		this.proComStaLevel = proComStaLevel;
		this.proComContent = proComContent;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Procomment(Integer id, Member member, Product product,
			Boolean proComIsShoOrder, Integer proComLevel,
			Integer proComStaLevel, String proComContent, Timestamp timeAdd,
			Timestamp timeUpdate, Set<Proshoorder> proshoorders) {
		this.id = id;
		this.member = member;
		this.product = product;
		this.proComIsShoOrder = proComIsShoOrder;
		this.proComLevel = proComLevel;
		this.proComStaLevel = proComStaLevel;
		this.proComContent = proComContent;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.proshoorders = proshoorders;
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
	@JoinColumn(name = "MemId", nullable = false)
	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ProId", nullable = false)
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "procomment")
	public Set<Proshoorder> getProshoorders() {
		return this.proshoorders;
	}

	public void setProshoorders(Set<Proshoorder> proshoorders) {
		this.proshoorders = proshoorders;
	}

}