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
@Table(name="member"
    ,catalog="lxyg"
)

public class Member  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Timestamp timeAdd;
     private Timestamp timeUpdate;
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
    public Member() {
    }

	/** minimal constructor */
    public Member(Timestamp timeAdd, Timestamp timeUpdate, Timestamp memberRegisteredTime, String memberName, String password, Timestamp memberBirthday) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
        this.memberRegisteredTime = memberRegisteredTime;
        this.memberName = memberName;
        this.password = password;
        this.memberBirthday = memberBirthday;
    }
    
    /** full constructor */
    public Member(Timestamp timeAdd, Timestamp timeUpdate, String email, Boolean memberWhetherAuthenticate, Timestamp memberRegisteredTime, String memberCurrentPicture, String memberName, String password, String memberRealName, Boolean memberSex, Timestamp memberBirthday, String memberResidentialAddress, String memberHomeTown) {
        this.timeAdd = timeAdd;
        this.timeUpdate = timeUpdate;
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
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="Id", unique=true, nullable=false)

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="TimeAdd", nullable=false, length=19)

    public Timestamp getTimeAdd() {
        return this.timeAdd;
    }
    
    public void setTimeAdd(Timestamp timeAdd) {
        this.timeAdd = timeAdd;
    }
    
    @Column(name="TimeUpdate", nullable=false, length=19)

    public Timestamp getTimeUpdate() {
        return this.timeUpdate;
    }
    
    public void setTimeUpdate(Timestamp timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
    
    @Column(name="Email", length=1024)

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="MemberWhetherAuthenticate")

    public Boolean getMemberWhetherAuthenticate() {
        return this.memberWhetherAuthenticate;
    }
    
    public void setMemberWhetherAuthenticate(Boolean memberWhetherAuthenticate) {
        this.memberWhetherAuthenticate = memberWhetherAuthenticate;
    }
    
    @Column(name="MemberRegisteredTime", nullable=false, length=19)

    public Timestamp getMemberRegisteredTime() {
        return this.memberRegisteredTime;
    }
    
    public void setMemberRegisteredTime(Timestamp memberRegisteredTime) {
        this.memberRegisteredTime = memberRegisteredTime;
    }
    
    @Column(name="MemberCurrentPicture", length=1024)

    public String getMemberCurrentPicture() {
        return this.memberCurrentPicture;
    }
    
    public void setMemberCurrentPicture(String memberCurrentPicture) {
        this.memberCurrentPicture = memberCurrentPicture;
    }
    
    @Column(name="MemberName", nullable=false, length=1024)

    public String getMemberName() {
        return this.memberName;
    }
    
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    
    @Column(name="Password", nullable=false, length=1024)

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="MemberRealName", length=1024)

    public String getMemberRealName() {
        return this.memberRealName;
    }
    
    public void setMemberRealName(String memberRealName) {
        this.memberRealName = memberRealName;
    }
    
    @Column(name="MemberSex")

    public Boolean getMemberSex() {
        return this.memberSex;
    }
    
    public void setMemberSex(Boolean memberSex) {
        this.memberSex = memberSex;
    }
    
    @Column(name="MemberBirthday", nullable=false, length=19)

    public Timestamp getMemberBirthday() {
        return this.memberBirthday;
    }
    
    public void setMemberBirthday(Timestamp memberBirthday) {
        this.memberBirthday = memberBirthday;
    }
    
    @Column(name="MemberResidentialAddress", length=1024)

    public String getMemberResidentialAddress() {
        return this.memberResidentialAddress;
    }
    
    public void setMemberResidentialAddress(String memberResidentialAddress) {
        this.memberResidentialAddress = memberResidentialAddress;
    }
    
    @Column(name="MemberHomeTown", length=1024)

    public String getMemberHomeTown() {
        return this.memberHomeTown;
    }
    
    public void setMemberHomeTown(String memberHomeTown) {
        this.memberHomeTown = memberHomeTown;
    }
   








}