package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Occasion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "occasion", catalog = "lxyg")
public class Occasion implements java.io.Serializable {

	// Fields

	private Integer id;
	private String occasionCongratulationsToHospital;
	private String occasionFamilyOrder;
	private String occasionGiftGiving;
	private String occasionVisitFriends;
	private String occasionVisitPatient;
	private String occasionVisitRelatives;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;

	// Constructors

	/** default constructor */
	public Occasion() {
	}

	/** minimal constructor */
	public Occasion(Timestamp timeAdd, Timestamp timeUpdate) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Occasion(String occasionCongratulationsToHospital,
			String occasionFamilyOrder, String occasionGiftGiving,
			String occasionVisitFriends, String occasionVisitPatient,
			String occasionVisitRelatives, Timestamp timeAdd,
			Timestamp timeUpdate) {
		this.occasionCongratulationsToHospital = occasionCongratulationsToHospital;
		this.occasionFamilyOrder = occasionFamilyOrder;
		this.occasionGiftGiving = occasionGiftGiving;
		this.occasionVisitFriends = occasionVisitFriends;
		this.occasionVisitPatient = occasionVisitPatient;
		this.occasionVisitRelatives = occasionVisitRelatives;
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

	@Column(name = "Occasion_CongratulationsToHospital")
	public String getOccasionCongratulationsToHospital() {
		return this.occasionCongratulationsToHospital;
	}

	public void setOccasionCongratulationsToHospital(
			String occasionCongratulationsToHospital) {
		this.occasionCongratulationsToHospital = occasionCongratulationsToHospital;
	}

	@Column(name = "Occasion_FamilyOrder")
	public String getOccasionFamilyOrder() {
		return this.occasionFamilyOrder;
	}

	public void setOccasionFamilyOrder(String occasionFamilyOrder) {
		this.occasionFamilyOrder = occasionFamilyOrder;
	}

	@Column(name = "Occasion_GiftGiving")
	public String getOccasionGiftGiving() {
		return this.occasionGiftGiving;
	}

	public void setOccasionGiftGiving(String occasionGiftGiving) {
		this.occasionGiftGiving = occasionGiftGiving;
	}

	@Column(name = "Occasion_VisitFriends")
	public String getOccasionVisitFriends() {
		return this.occasionVisitFriends;
	}

	public void setOccasionVisitFriends(String occasionVisitFriends) {
		this.occasionVisitFriends = occasionVisitFriends;
	}

	@Column(name = "Occasion_VisitPatient")
	public String getOccasionVisitPatient() {
		return this.occasionVisitPatient;
	}

	public void setOccasionVisitPatient(String occasionVisitPatient) {
		this.occasionVisitPatient = occasionVisitPatient;
	}

	@Column(name = "Occasion_VisitRelatives")
	public String getOccasionVisitRelatives() {
		return this.occasionVisitRelatives;
	}

	public void setOccasionVisitRelatives(String occasionVisitRelatives) {
		this.occasionVisitRelatives = occasionVisitRelatives;
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

}