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
 * Gifttable entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "gifttable", catalog = "lxyg")
public class Gifttable implements java.io.Serializable {

	// Fields

	private Integer id;
	private Occasiontable occasiontable;
	private Typetable typetable;
	private Gifttablecontents gifttablecontents;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private String giftName;
	private Set<Occasiontable> occasiontables = new HashSet<Occasiontable>(0);
	private Set<Typetable> typetables = new HashSet<Typetable>(0);

	// Constructors

	/** default constructor */
	public Gifttable() {
	}

	/** minimal constructor */
	public Gifttable(Timestamp timeAdd, Timestamp timeUpdate, String giftName) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.giftName = giftName;
	}

	/** full constructor */
	public Gifttable(Occasiontable occasiontable, Typetable typetable,
			Gifttablecontents gifttablecontents, Timestamp timeAdd,
			Timestamp timeUpdate, String giftName,
			Set<Occasiontable> occasiontables, Set<Typetable> typetables) {
		this.occasiontable = occasiontable;
		this.typetable = typetable;
		this.gifttablecontents = gifttablecontents;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.giftName = giftName;
		this.occasiontables = occasiontables;
		this.typetables = typetables;
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
	@JoinColumn(name = "OccasionId")
	public Occasiontable getOccasiontable() {
		return this.occasiontable;
	}

	public void setOccasiontable(Occasiontable occasiontable) {
		this.occasiontable = occasiontable;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TypeId")
	public Typetable getTypetable() {
		return this.typetable;
	}

	public void setTypetable(Typetable typetable) {
		this.typetable = typetable;
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