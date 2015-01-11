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
 * Typetable entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "typetable", catalog = "lxyg")
public class Typetable implements java.io.Serializable {

	// Fields

	private Integer id;
	private Gifttable gifttable;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private String typeRecovery;
	private String typeImproveResistance;
	private String typeRorBrain;
	private String typeBeauty;
	private Set<Gifttable> gifttables = new HashSet<Gifttable>(0);

	// Constructors

	/** default constructor */
	public Typetable() {
	}

	/** minimal constructor */
	public Typetable(Timestamp timeAdd, Timestamp timeUpdate) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Typetable(Gifttable gifttable, Timestamp timeAdd,
			Timestamp timeUpdate, String typeRecovery,
			String typeImproveResistance, String typeRorBrain,
			String typeBeauty, Set<Gifttable> gifttables) {
		this.gifttable = gifttable;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.typeRecovery = typeRecovery;
		this.typeImproveResistance = typeImproveResistance;
		this.typeRorBrain = typeRorBrain;
		this.typeBeauty = typeBeauty;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Gif_Id")
	public Gifttable getGifttable() {
		return this.gifttable;
	}

	public void setGifttable(Gifttable gifttable) {
		this.gifttable = gifttable;
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

	@Column(name = "Type_Recovery", length = 1024)
	public String getTypeRecovery() {
		return this.typeRecovery;
	}

	public void setTypeRecovery(String typeRecovery) {
		this.typeRecovery = typeRecovery;
	}

	@Column(name = "Type_ImproveResistance", length = 1024)
	public String getTypeImproveResistance() {
		return this.typeImproveResistance;
	}

	public void setTypeImproveResistance(String typeImproveResistance) {
		this.typeImproveResistance = typeImproveResistance;
	}

	@Column(name = "Type_RorBrain", length = 1024)
	public String getTypeRorBrain() {
		return this.typeRorBrain;
	}

	public void setTypeRorBrain(String typeRorBrain) {
		this.typeRorBrain = typeRorBrain;
	}

	@Column(name = "Type_Beauty", length = 1024)
	public String getTypeBeauty() {
		return this.typeBeauty;
	}

	public void setTypeBeauty(String typeBeauty) {
		this.typeBeauty = typeBeauty;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "typetable")
	public Set<Gifttable> getGifttables() {
		return this.gifttables;
	}

	public void setGifttables(Set<Gifttable> gifttables) {
		this.gifttables = gifttables;
	}

}