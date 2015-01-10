package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Type entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "type", catalog = "lxyg")
public class Type implements java.io.Serializable {

	// Fields

	private Integer id;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private String typeBeauty;
	private String typeImproveResistance;
	private String typeRecovery;
	private String typeRorBrain;

	// Constructors

	/** default constructor */
	public Type() {
	}

	/** minimal constructor */
	public Type(Timestamp timeAdd, Timestamp timeUpdate) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Type(Timestamp timeAdd, Timestamp timeUpdate, String typeBeauty,
			String typeImproveResistance, String typeRecovery,
			String typeRorBrain) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.typeBeauty = typeBeauty;
		this.typeImproveResistance = typeImproveResistance;
		this.typeRecovery = typeRecovery;
		this.typeRorBrain = typeRorBrain;
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

	@Column(name = "Type_Beauty")
	public String getTypeBeauty() {
		return this.typeBeauty;
	}

	public void setTypeBeauty(String typeBeauty) {
		this.typeBeauty = typeBeauty;
	}

	@Column(name = "Type_ImproveResistance")
	public String getTypeImproveResistance() {
		return this.typeImproveResistance;
	}

	public void setTypeImproveResistance(String typeImproveResistance) {
		this.typeImproveResistance = typeImproveResistance;
	}

	@Column(name = "Type_Recovery")
	public String getTypeRecovery() {
		return this.typeRecovery;
	}

	public void setTypeRecovery(String typeRecovery) {
		this.typeRecovery = typeRecovery;
	}

	@Column(name = "Type_RorBrain")
	public String getTypeRorBrain() {
		return this.typeRorBrain;
	}

	public void setTypeRorBrain(String typeRorBrain) {
		this.typeRorBrain = typeRorBrain;
	}

}