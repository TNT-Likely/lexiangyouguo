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
 * Occasiontable entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "occasiontable", catalog = "lxyg")
public class Occasiontable implements java.io.Serializable {

	// Fields

	private Integer id;
	private Gifttable gifttable;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private String occasionVisitRelatives;
	private String occasionVisitFriends;
	private String occasionGiftGiving;
	private String occasionVisitPatient;
	private String occasionCongratulationsToHospital;
	private String occasionFamilyOrder;
	private Set<Gifttable> gifttables = new HashSet<Gifttable>(0);

	// Constructors

	/** default constructor */
	public Occasiontable() {
	}

	/** minimal constructor */
	public Occasiontable(Timestamp timeAdd, Timestamp timeUpdate) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Occasiontable(Gifttable gifttable, Timestamp timeAdd,
			Timestamp timeUpdate, String occasionVisitRelatives,
			String occasionVisitFriends, String occasionGiftGiving,
			String occasionVisitPatient,
			String occasionCongratulationsToHospital,
			String occasionFamilyOrder, Set<Gifttable> gifttables) {
		this.gifttable = gifttable;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.occasionVisitRelatives = occasionVisitRelatives;
		this.occasionVisitFriends = occasionVisitFriends;
		this.occasionGiftGiving = occasionGiftGiving;
		this.occasionVisitPatient = occasionVisitPatient;
		this.occasionCongratulationsToHospital = occasionCongratulationsToHospital;
		this.occasionFamilyOrder = occasionFamilyOrder;
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

	@Column(name = "Occasion_VisitRelatives", length = 1024)
	public String getOccasionVisitRelatives() {
		return this.occasionVisitRelatives;
	}

	public void setOccasionVisitRelatives(String occasionVisitRelatives) {
		this.occasionVisitRelatives = occasionVisitRelatives;
	}

	@Column(name = "Occasion_VisitFriends", length = 1024)
	public String getOccasionVisitFriends() {
		return this.occasionVisitFriends;
	}

	public void setOccasionVisitFriends(String occasionVisitFriends) {
		this.occasionVisitFriends = occasionVisitFriends;
	}

	@Column(name = "Occasion_GiftGiving", length = 1024)
	public String getOccasionGiftGiving() {
		return this.occasionGiftGiving;
	}

	public void setOccasionGiftGiving(String occasionGiftGiving) {
		this.occasionGiftGiving = occasionGiftGiving;
	}

	@Column(name = "Occasion_VisitPatient", length = 1024)
	public String getOccasionVisitPatient() {
		return this.occasionVisitPatient;
	}

	public void setOccasionVisitPatient(String occasionVisitPatient) {
		this.occasionVisitPatient = occasionVisitPatient;
	}

	@Column(name = "Occasion_CongratulationsToHospital", length = 1024)
	public String getOccasionCongratulationsToHospital() {
		return this.occasionCongratulationsToHospital;
	}

	public void setOccasionCongratulationsToHospital(
			String occasionCongratulationsToHospital) {
		this.occasionCongratulationsToHospital = occasionCongratulationsToHospital;
	}

	@Column(name = "Occasion_FamilyOrder", length = 1024)
	public String getOccasionFamilyOrder() {
		return this.occasionFamilyOrder;
	}

	public void setOccasionFamilyOrder(String occasionFamilyOrder) {
		this.occasionFamilyOrder = occasionFamilyOrder;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "occasiontable")
	public Set<Gifttable> getGifttables() {
		return this.gifttables;
	}

	public void setGifttables(Set<Gifttable> gifttables) {
		this.gifttables = gifttables;
	}

}