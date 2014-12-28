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
 * Memberlist entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "memberlist", catalog = "lxyg")
public class Memberlist implements java.io.Serializable {

	// Fields

	private Integer id;
	private Membercollectiontable membercollectiontable;
	private Orderlist orderlist;
	private Carttable carttable;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private Integer number;
	private String email;
	private Boolean memberWhetherAuthenticate;
	private Timestamp memberRegisteredTime;
	private String memberCurrentPicture;
	private String memberName;
	private String password;
	private String memberRealName;
	private Boolean memberSex;
	private Timestamp memberBirthday;
	private String memberResidentialAddress;
	private String memberHomeTown;

	// Constructors

	/** default constructor */
	public Memberlist() {
	}

	/** minimal constructor */
	public Memberlist(Timestamp timeAdd, Timestamp timeUpdate, Integer number,
			Timestamp memberRegisteredTime, Timestamp memberBirthday) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.number = number;
		this.memberRegisteredTime = memberRegisteredTime;
		this.memberBirthday = memberBirthday;
	}

	/** full constructor */
	public Memberlist(Membercollectiontable membercollectiontable,
			Orderlist orderlist, Carttable carttable, Timestamp timeAdd,
			Timestamp timeUpdate, Integer number, String email,
			Boolean memberWhetherAuthenticate, Timestamp memberRegisteredTime,
			String memberCurrentPicture, String memberName, String password,
			String memberRealName, Boolean memberSex, Timestamp memberBirthday,
			String memberResidentialAddress, String memberHomeTown) {
		this.membercollectiontable = membercollectiontable;
		this.orderlist = orderlist;
		this.carttable = carttable;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.number = number;
		this.email = email;
		this.memberWhetherAuthenticate = memberWhetherAuthenticate;
		this.memberRegisteredTime = memberRegisteredTime;
		this.memberCurrentPicture = memberCurrentPicture;
		this.memberName = memberName;
		this.password = password;
		this.memberRealName = memberRealName;
		this.memberSex = memberSex;
		this.memberBirthday = memberBirthday;
		this.memberResidentialAddress = memberResidentialAddress;
		this.memberHomeTown = memberHomeTown;
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
	@JoinColumn(name = "Mem_Id")
	public Membercollectiontable getMembercollectiontable() {
		return this.membercollectiontable;
	}

	public void setMembercollectiontable(
			Membercollectiontable membercollectiontable) {
		this.membercollectiontable = membercollectiontable;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Ord_Id")
	public Orderlist getOrderlist() {
		return this.orderlist;
	}

	public void setOrderlist(Orderlist orderlist) {
		this.orderlist = orderlist;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Car_Id")
	public Carttable getCarttable() {
		return this.carttable;
	}

	public void setCarttable(Carttable carttable) {
		this.carttable = carttable;
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

	@Column(name = "Number", nullable = false)
	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Column(name = "Email", length = 1024)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "MemberWhetherAuthenticate")
	public Boolean getMemberWhetherAuthenticate() {
		return this.memberWhetherAuthenticate;
	}

	public void setMemberWhetherAuthenticate(Boolean memberWhetherAuthenticate) {
		this.memberWhetherAuthenticate = memberWhetherAuthenticate;
	}

	@Column(name = "MemberRegisteredTime", nullable = false, length = 19)
	public Timestamp getMemberRegisteredTime() {
		return this.memberRegisteredTime;
	}

	public void setMemberRegisteredTime(Timestamp memberRegisteredTime) {
		this.memberRegisteredTime = memberRegisteredTime;
	}

	@Column(name = "MemberCurrentPicture", length = 1024)
	public String getMemberCurrentPicture() {
		return this.memberCurrentPicture;
	}

	public void setMemberCurrentPicture(String memberCurrentPicture) {
		this.memberCurrentPicture = memberCurrentPicture;
	}

	@Column(name = "MemberName", length = 1024)
	public String getMemberName() {
		return this.memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Column(name = "Password", length = 1024)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "MemberRealName", length = 1024)
	public String getMemberRealName() {
		return this.memberRealName;
	}

	public void setMemberRealName(String memberRealName) {
		this.memberRealName = memberRealName;
	}

	@Column(name = "MemberSex")
	public Boolean getMemberSex() {
		return this.memberSex;
	}

	public void setMemberSex(Boolean memberSex) {
		this.memberSex = memberSex;
	}

	@Column(name = "MemberBirthday", nullable = false, length = 19)
	public Timestamp getMemberBirthday() {
		return this.memberBirthday;
	}

	public void setMemberBirthday(Timestamp memberBirthday) {
		this.memberBirthday = memberBirthday;
	}

	@Column(name = "MemberResidentialAddress", length = 1024)
	public String getMemberResidentialAddress() {
		return this.memberResidentialAddress;
	}

	public void setMemberResidentialAddress(String memberResidentialAddress) {
		this.memberResidentialAddress = memberResidentialAddress;
	}

	@Column(name = "MemberHomeTown", length = 1024)
	public String getMemberHomeTown() {
		return this.memberHomeTown;
	}

	public void setMemberHomeTown(String memberHomeTown) {
		this.memberHomeTown = memberHomeTown;
	}

}