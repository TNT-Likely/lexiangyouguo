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
 * Gifttable entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "gifttable", catalog = "lxyg")
public class Gifttable implements java.io.Serializable {

	// Fields

	private Integer id;
	private Gifttablecontents gifttablecontents;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private String giftName;
	private Integer occasionId;
	private Integer typeId;
	private Set<Occasiontable> occasiontables = new HashSet<Occasiontable>(0);
	private Set<Typetable> typetables = new HashSet<Typetable>(0);

	// Constructors

	/** default constructor */
	public Gifttable() {
	}

	/** minimal constructor */
	public Gifttable(Integer id, Timestamp timeAdd, Timestamp timeUpdate,
			String giftName) {
		this.id = id;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.giftName = giftName;
	}

	/** full constructor */
	public Gifttable(Integer id, Gifttablecontents gifttablecontents,
			Timestamp timeAdd, Timestamp timeUpdate, String giftName,
			Integer occasionId, Integer typeId,
			Set<Occasiontable> occasiontables, Set<Typetable> typetables) {
		this.id = id;
		this.gifttablecontents = gifttablecontents;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.giftName = giftName;
		this.occasionId = occasionId;
		this.typeId = typeId;
		this.occasiontables = occasiontables;
		this.typetables = typetables;
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
	@JoinColumn(name = "Gif_Id")
	public Gifttablecontents getGifttablecontents() {
		return this.gifttablecontents;
	}

	public void setGifttablecontents(Gifttablecontents gifttablecontents) {
		this.gifttablecontents = gifttablecontents;
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

	@Column(name = "GiftName", nullable = false, length = 1024)
	public String getGiftName() {
		return this.giftName;
	}

	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}

	@Column(name = "OccasionId")
	public Integer getOccasionId() {
		return this.occasionId;
	}

	public void setOccasionId(Integer occasionId) {
		this.occasionId = occasionId;
	}

	@Column(name = "TypeId")
	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gifttable")
	public Set<Occasiontable> getOccasiontables() {
		return this.occasiontables;
	}

	public void setOccasiontables(Set<Occasiontable> occasiontables) {
		this.occasiontables = occasiontables;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gifttable")
	public Set<Typetable> getTypetables() {
		return this.typetables;
	}

	public void setTypetables(Set<Typetable> typetables) {
		this.typetables = typetables;
	}

}