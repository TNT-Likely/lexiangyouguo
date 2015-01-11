package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Harvestaddresstable entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "harvestaddresstable", catalog = "lxyg")
public class Harvestaddresstable implements java.io.Serializable {

	// Fields

	private Integer id;
	private Order order;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private String haTheFirstAddress;
	private String haTheSecondAddress;
	private String haTheThirdAddress;
	private String haTheFourthAddress;

	// Constructors

	/** default constructor */
	public Harvestaddresstable() {
	}

	/** minimal constructor */
	public Harvestaddresstable(Timestamp timeAdd, Timestamp timeUpdate) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Harvestaddresstable(Order order, Timestamp timeAdd,
			Timestamp timeUpdate, String haTheFirstAddress,
			String haTheSecondAddress, String haTheThirdAddress,
			String haTheFourthAddress) {
		this.order = order;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.haTheFirstAddress = haTheFirstAddress;
		this.haTheSecondAddress = haTheSecondAddress;
		this.haTheThirdAddress = haTheThirdAddress;
		this.haTheFourthAddress = haTheFourthAddress;
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
	@JoinColumn(name = "OrderId")
	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
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

	@Column(name = "HA_TheFirstAddress", length = 1024)
	public String getHaTheFirstAddress() {
		return this.haTheFirstAddress;
	}

	public void setHaTheFirstAddress(String haTheFirstAddress) {
		this.haTheFirstAddress = haTheFirstAddress;
	}

	@Column(name = "HA_TheSecondAddress", length = 1024)
	public String getHaTheSecondAddress() {
		return this.haTheSecondAddress;
	}

	public void setHaTheSecondAddress(String haTheSecondAddress) {
		this.haTheSecondAddress = haTheSecondAddress;
	}

	@Column(name = "HA_TheThirdAddress", length = 1024)
	public String getHaTheThirdAddress() {
		return this.haTheThirdAddress;
	}

	public void setHaTheThirdAddress(String haTheThirdAddress) {
		this.haTheThirdAddress = haTheThirdAddress;
	}

	@Column(name = "HA_TheFourthAddress", length = 1024)
	public String getHaTheFourthAddress() {
		return this.haTheFourthAddress;
	}

	public void setHaTheFourthAddress(String haTheFourthAddress) {
		this.haTheFourthAddress = haTheFourthAddress;
	}

}