package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Gift entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "gift", catalog = "lxyg")
public class Gift implements java.io.Serializable {

	// Fields

	private Integer id;
	private String giftName;
	private Integer occId;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private Integer typId;

	// Constructors

	/** default constructor */
	public Gift() {
	}

	/** minimal constructor */
	public Gift(String giftName, Timestamp timeAdd, Timestamp timeUpdate) {
		this.giftName = giftName;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Gift(String giftName, Integer occId, Timestamp timeAdd,
			Timestamp timeUpdate, Integer typId) {
		this.giftName = giftName;
		this.occId = occId;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.typId = typId;
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

	@Column(name = "GiftName", nullable = false)
	public String getGiftName() {
		return this.giftName;
	}

	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}

	@Column(name = "Occ_Id")
	public Integer getOccId() {
		return this.occId;
	}

	public void setOccId(Integer occId) {
		this.occId = occId;
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

	@Column(name = "Typ_Id")
	public Integer getTypId() {
		return this.typId;
	}

	public void setTypId(Integer typId) {
		this.typId = typId;
	}

}