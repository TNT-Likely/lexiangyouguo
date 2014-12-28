package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Administratorlist entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "administratorlist", catalog = "lxyg")
public class Administratorlist implements java.io.Serializable {

	// Fields

	private Integer id;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private String administratoName;
	private String password;
	private String administratoSex;
	private String administratoAddress;
	private Timestamp addTime;
	private Timestamp administratoastLoginTime;

	// Constructors

	/** default constructor */
	public Administratorlist() {
	}

	/** minimal constructor */
	public Administratorlist(Integer id, Timestamp timeAdd,
			Timestamp timeUpdate, String administratoName, String password,
			Timestamp addTime, Timestamp administratoastLoginTime) {
		this.id = id;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.administratoName = administratoName;
		this.password = password;
		this.addTime = addTime;
		this.administratoastLoginTime = administratoastLoginTime;
	}

	/** full constructor */
	public Administratorlist(Integer id, Timestamp timeAdd,
			Timestamp timeUpdate, String administratoName, String password,
			String administratoSex, String administratoAddress,
			Timestamp addTime, Timestamp administratoastLoginTime) {
		this.id = id;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.administratoName = administratoName;
		this.password = password;
		this.administratoSex = administratoSex;
		this.administratoAddress = administratoAddress;
		this.addTime = addTime;
		this.administratoastLoginTime = administratoastLoginTime;
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

	@Column(name = "AdministratoName", nullable = false, length = 1024)
	public String getAdministratoName() {
		return this.administratoName;
	}

	public void setAdministratoName(String administratoName) {
		this.administratoName = administratoName;
	}

	@Column(name = "Password", nullable = false, length = 1024)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "AdministratoSex", length = 2)
	public String getAdministratoSex() {
		return this.administratoSex;
	}

	public void setAdministratoSex(String administratoSex) {
		this.administratoSex = administratoSex;
	}

	@Column(name = "AdministratoAddress", length = 1024)
	public String getAdministratoAddress() {
		return this.administratoAddress;
	}

	public void setAdministratoAddress(String administratoAddress) {
		this.administratoAddress = administratoAddress;
	}

	@Column(name = "AddTime", nullable = false, length = 19)
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	@Column(name = "AdministratoastLoginTime", nullable = false, length = 19)
	public Timestamp getAdministratoastLoginTime() {
		return this.administratoastLoginTime;
	}

	public void setAdministratoastLoginTime(Timestamp administratoastLoginTime) {
		this.administratoastLoginTime = administratoastLoginTime;
	}

}