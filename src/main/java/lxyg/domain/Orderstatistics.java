package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Orderstatistics entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "orderstatistics", catalog = "lxyg")
public class Orderstatistics implements java.io.Serializable {

	// Fields

	private Integer id;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private String osGeneralSituation;
	private String osDistributionMethod;
	private String osPaymentMethod;
	private Double osEffectiveOrderAmount;
	private Double osClickOrdersPerThousand;
	private Double osClickMoneyPerThousand;

	// Constructors

	/** default constructor */
	public Orderstatistics() {
	}

	/** minimal constructor */
	public Orderstatistics(Integer id, Timestamp timeAdd, Timestamp timeUpdate,
			String osGeneralSituation) {
		this.id = id;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.osGeneralSituation = osGeneralSituation;
	}

	/** full constructor */
	public Orderstatistics(Integer id, Timestamp timeAdd, Timestamp timeUpdate,
			String osGeneralSituation, String osDistributionMethod,
			String osPaymentMethod, Double osEffectiveOrderAmount,
			Double osClickOrdersPerThousand, Double osClickMoneyPerThousand) {
		this.id = id;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.osGeneralSituation = osGeneralSituation;
		this.osDistributionMethod = osDistributionMethod;
		this.osPaymentMethod = osPaymentMethod;
		this.osEffectiveOrderAmount = osEffectiveOrderAmount;
		this.osClickOrdersPerThousand = osClickOrdersPerThousand;
		this.osClickMoneyPerThousand = osClickMoneyPerThousand;
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

	@Column(name = "OS_GeneralSituation", nullable = false, length = 1024)
	public String getOsGeneralSituation() {
		return this.osGeneralSituation;
	}

	public void setOsGeneralSituation(String osGeneralSituation) {
		this.osGeneralSituation = osGeneralSituation;
	}

	@Column(name = "OS_DistributionMethod", length = 1024)
	public String getOsDistributionMethod() {
		return this.osDistributionMethod;
	}

	public void setOsDistributionMethod(String osDistributionMethod) {
		this.osDistributionMethod = osDistributionMethod;
	}

	@Column(name = "OS_PaymentMethod", length = 1024)
	public String getOsPaymentMethod() {
		return this.osPaymentMethod;
	}

	public void setOsPaymentMethod(String osPaymentMethod) {
		this.osPaymentMethod = osPaymentMethod;
	}

	@Column(name = "OS_EffectiveOrderAmount", precision = 22, scale = 0)
	public Double getOsEffectiveOrderAmount() {
		return this.osEffectiveOrderAmount;
	}

	public void setOsEffectiveOrderAmount(Double osEffectiveOrderAmount) {
		this.osEffectiveOrderAmount = osEffectiveOrderAmount;
	}

	@Column(name = "OS_ClickOrdersPerThousand", precision = 22, scale = 0)
	public Double getOsClickOrdersPerThousand() {
		return this.osClickOrdersPerThousand;
	}

	public void setOsClickOrdersPerThousand(Double osClickOrdersPerThousand) {
		this.osClickOrdersPerThousand = osClickOrdersPerThousand;
	}

	@Column(name = "OS_ClickMoneyPerThousand", precision = 22, scale = 0)
	public Double getOsClickMoneyPerThousand() {
		return this.osClickMoneyPerThousand;
	}

	public void setOsClickMoneyPerThousand(Double osClickMoneyPerThousand) {
		this.osClickMoneyPerThousand = osClickMoneyPerThousand;
	}

}