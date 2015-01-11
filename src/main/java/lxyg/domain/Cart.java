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
 * Cart entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "cart", catalog = "lxyg")
public class Cart implements java.io.Serializable {

	// Fields

	private Integer id;
	private Member member;
	private Product product;
	private Integer proNumber;
	private Float proTotalMoney;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private Set<Product> products = new HashSet<Product>(0);

	// Constructors

	/** default constructor */
	public Cart() {
	}

	/** minimal constructor */
	public Cart(Member member, Product product, Integer proNumber,
			Float proTotalMoney, Timestamp timeAdd, Timestamp timeUpdate) {
		this.member = member;
		this.product = product;
		this.proNumber = proNumber;
		this.proTotalMoney = proTotalMoney;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Cart(Member member, Product product, Integer proNumber,
			Float proTotalMoney, Timestamp timeAdd, Timestamp timeUpdate,
			Set<Product> products) {
		this.member = member;
		this.product = product;
		this.proNumber = proNumber;
		this.proTotalMoney = proTotalMoney;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.products = products;
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
	@JoinColumn(name = "MemberId", nullable = false)
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

	@Column(name = "ProNumber", nullable = false)
	public Integer getProNumber() {
		return this.proNumber;
	}

	public void setProNumber(Integer proNumber) {
		this.proNumber = proNumber;
	}

	@Column(name = "ProTotalMoney", nullable = false, precision = 10, scale = 0)
	public Float getProTotalMoney() {
		return this.proTotalMoney;
	}

	public void setProTotalMoney(Float proTotalMoney) {
		this.proTotalMoney = proTotalMoney;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cart")
	public Set<Product> getProducts() {
		return this.products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}