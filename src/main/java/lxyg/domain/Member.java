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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Member entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "member", catalog = "lxyg")
public class Member implements java.io.Serializable {

	// Fields

	private Integer id;
	private String memberEmail;
	private Timestamp memberBirthday;
	private String memberCurrentPicture;
	private String memberHomeTown;
	private String memberName;
	private String memberRealName;
	private Timestamp memberRegisteredTime;
	private String memberResidentialAddress;
	private Boolean memberSex;
	private Boolean memberWhetherAuthenticate;
	private String memberPassword;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private Set<Order> orders = new HashSet<Order>(0);
	private Set<Procomment> procomments = new HashSet<Procomment>(0);
	private Set<Cart> carts = new HashSet<Cart>(0);
	private Set<Membercollectiontable> membercollectiontables = new HashSet<Membercollectiontable>(
			0);

	// Constructors

	/** default constructor */
	public Member() {
	}

	/** minimal constructor */
	public Member(String memberName, String memberPassword) {
		this.memberName = memberName;
		this.memberPassword = memberPassword;
	}

	/** full constructor */
	public Member(String memberEmail, Timestamp memberBirthday,
			String memberCurrentPicture, String memberHomeTown,
			String memberName, String memberRealName,
			Timestamp memberRegisteredTime, String memberResidentialAddress,
			Boolean memberSex, Boolean memberWhetherAuthenticate,
			String memberPassword, Timestamp timeAdd, Timestamp timeUpdate,
			Set<Order> orders, Set<Procomment> procomments, Set<Cart> carts,
			Set<Membercollectiontable> membercollectiontables) {
		this.memberEmail = memberEmail;
		this.memberBirthday = memberBirthday;
		this.memberCurrentPicture = memberCurrentPicture;
		this.memberHomeTown = memberHomeTown;
		this.memberName = memberName;
		this.memberRealName = memberRealName;
		this.memberRegisteredTime = memberRegisteredTime;
		this.memberResidentialAddress = memberResidentialAddress;
		this.memberSex = memberSex;
		this.memberWhetherAuthenticate = memberWhetherAuthenticate;
		this.memberPassword = memberPassword;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.orders = orders;
		this.procomments = procomments;
		this.carts = carts;
		this.membercollectiontables = membercollectiontables;
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

	@Column(name = "MemberEmail")
	public String getMemberEmail() {
		return this.memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	@Column(name = "MemberBirthday", length = 19)
	public Timestamp getMemberBirthday() {
		return this.memberBirthday;
	}

	public void setMemberBirthday(Timestamp memberBirthday) {
		this.memberBirthday = memberBirthday;
	}

	@Column(name = "MemberCurrentPicture")
	public String getMemberCurrentPicture() {
		return this.memberCurrentPicture;
	}

	public void setMemberCurrentPicture(String memberCurrentPicture) {
		this.memberCurrentPicture = memberCurrentPicture;
	}

	@Column(name = "MemberHomeTown")
	public String getMemberHomeTown() {
		return this.memberHomeTown;
	}

	public void setMemberHomeTown(String memberHomeTown) {
		this.memberHomeTown = memberHomeTown;
	}

	@Column(name = "MemberName", nullable = false)
	public String getMemberName() {
		return this.memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Column(name = "MemberRealName")
	public String getMemberRealName() {
		return this.memberRealName;
	}

	public void setMemberRealName(String memberRealName) {
		this.memberRealName = memberRealName;
	}

	@Column(name = "MemberRegisteredTime", length = 19)
	public Timestamp getMemberRegisteredTime() {
		return this.memberRegisteredTime;
	}

	public void setMemberRegisteredTime(Timestamp memberRegisteredTime) {
		this.memberRegisteredTime = memberRegisteredTime;
	}

	@Column(name = "MemberResidentialAddress")
	public String getMemberResidentialAddress() {
		return this.memberResidentialAddress;
	}

	public void setMemberResidentialAddress(String memberResidentialAddress) {
		this.memberResidentialAddress = memberResidentialAddress;
	}

	@Column(name = "MemberSex")
	public Boolean getMemberSex() {
		return this.memberSex;
	}

	public void setMemberSex(Boolean memberSex) {
		this.memberSex = memberSex;
	}

	@Column(name = "MemberWhetherAuthenticate")
	public Boolean getMemberWhetherAuthenticate() {
		return this.memberWhetherAuthenticate;
	}

	public void setMemberWhetherAuthenticate(Boolean memberWhetherAuthenticate) {
		this.memberWhetherAuthenticate = memberWhetherAuthenticate;
	}

	@Column(name = "MemberPassword", nullable = false)
	public String getMemberPassword() {
		return this.memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	@Column(name = "TimeAdd", length = 19)
	public Timestamp getTimeAdd() {
		return this.timeAdd;
	}

	public void setTimeAdd(Timestamp timeAdd) {
		this.timeAdd = timeAdd;
	}

	@Column(name = "TimeUpdate", length = 19)
	public Timestamp getTimeUpdate() {
		return this.timeUpdate;
	}

	public void setTimeUpdate(Timestamp timeUpdate) {
		this.timeUpdate = timeUpdate;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "member")
	public Set<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "member")
	public Set<Procomment> getProcomments() {
		return this.procomments;
	}

	public void setProcomments(Set<Procomment> procomments) {
		this.procomments = procomments;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "member")
	public Set<Cart> getCarts() {
		return this.carts;
	}

	public void setCarts(Set<Cart> carts) {
		this.carts = carts;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "member")
	public Set<Membercollectiontable> getMembercollectiontables() {
		return this.membercollectiontables;
	}

	public void setMembercollectiontables(
			Set<Membercollectiontable> membercollectiontables) {
		this.membercollectiontables = membercollectiontables;
	}

}