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
 * Gifttablecontents entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "gifttablecontents", catalog = "lxyg")
public class Gifttablecontents implements java.io.Serializable {

	// Fields

	private Integer id;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private Integer proId;
	private String giftId;
	private Set<Gifttable> gifttables = new HashSet<Gifttable>(0);

	// Constructors

	/** default constructor */
	public Gifttablecontents() {
	}

	/** minimal constructor */
	public Gifttablecontents(Timestamp timeAdd, Timestamp timeUpdate) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Gifttablecontents(Timestamp timeAdd, Timestamp timeUpdate,
			Integer proId, String giftId, Set<Gifttable> gifttables) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.proId = proId;
		this.giftId = giftId;
		this.gifttables = gifttables;
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

	@Column(name = "ProId")
	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	@Column(name = "GiftId", length = 10)
	public String getGiftId() {
		return this.giftId;
	}

	public void setGiftId(String giftId) {
		this.giftId = giftId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gifttablecontents")
	public Set<Gifttable> getGifttables() {
		return this.gifttables;
	}

	public void setGifttables(Set<Gifttable> gifttables) {
		this.gifttables = gifttables;
	}

}