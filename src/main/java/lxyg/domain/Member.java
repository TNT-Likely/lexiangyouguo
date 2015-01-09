package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
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
			String memberPassword, Timestamp timeAdd, Timestamp timeUpdate) {
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

}