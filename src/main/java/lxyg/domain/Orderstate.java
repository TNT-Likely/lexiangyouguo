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
 * Orderstate entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "orderstate", catalog = "lxyg")
public class Orderstate implements java.io.Serializable {

	// Fields

	private Integer id;
	private Orderlist orderlist;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private String osNotDeliverGoods;
	private String osDelivery;
	private String osHaveToSignFor;
	private String osRefusalReceive;
	private String osReturnOfGoods;
	private String osRefundSuccess;
	private String osUnconfirmed;
	private String osOrderFinished;
	private String osPayed;
	private String osNotPaying;

	// Constructors

	/** default constructor */
	public Orderstate() {
	}

	/** minimal constructor */
	public Orderstate(Timestamp timeAdd, Timestamp timeUpdate) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Orderstate(Orderlist orderlist, Timestamp timeAdd,
			Timestamp timeUpdate, String osNotDeliverGoods, String osDelivery,
			String osHaveToSignFor, String osRefusalReceive,
			String osReturnOfGoods, String osRefundSuccess,
			String osUnconfirmed, String osOrderFinished, String osPayed,
			String osNotPaying) {
		this.orderlist = orderlist;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.osNotDeliverGoods = osNotDeliverGoods;
		this.osDelivery = osDelivery;
		this.osHaveToSignFor = osHaveToSignFor;
		this.osRefusalReceive = osRefusalReceive;
		this.osReturnOfGoods = osReturnOfGoods;
		this.osRefundSuccess = osRefundSuccess;
		this.osUnconfirmed = osUnconfirmed;
		this.osOrderFinished = osOrderFinished;
		this.osPayed = osPayed;
		this.osNotPaying = osNotPaying;
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
	@JoinColumn(name = "Ord_Id")
	public Orderlist getOrderlist() {
		return this.orderlist;
	}

	public void setOrderlist(Orderlist orderlist) {
		this.orderlist = orderlist;
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

	@Column(name = "OS_NotDeliverGoods", length = 1024)
	public String getOsNotDeliverGoods() {
		return this.osNotDeliverGoods;
	}

	public void setOsNotDeliverGoods(String osNotDeliverGoods) {
		this.osNotDeliverGoods = osNotDeliverGoods;
	}

	@Column(name = "OS_Delivery", length = 1024)
	public String getOsDelivery() {
		return this.osDelivery;
	}

	public void setOsDelivery(String osDelivery) {
		this.osDelivery = osDelivery;
	}

	@Column(name = "OS_HaveToSignFor", length = 1024)
	public String getOsHaveToSignFor() {
		return this.osHaveToSignFor;
	}

	public void setOsHaveToSignFor(String osHaveToSignFor) {
		this.osHaveToSignFor = osHaveToSignFor;
	}

	@Column(name = "OS_RefusalReceive", length = 1024)
	public String getOsRefusalReceive() {
		return this.osRefusalReceive;
	}

	public void setOsRefusalReceive(String osRefusalReceive) {
		this.osRefusalReceive = osRefusalReceive;
	}

	@Column(name = "OS_ReturnOfGoods", length = 1024)
	public String getOsReturnOfGoods() {
		return this.osReturnOfGoods;
	}

	public void setOsReturnOfGoods(String osReturnOfGoods) {
		this.osReturnOfGoods = osReturnOfGoods;
	}

	@Column(name = "OS_RefundSuccess", length = 1024)
	public String getOsRefundSuccess() {
		return this.osRefundSuccess;
	}

	public void setOsRefundSuccess(String osRefundSuccess) {
		this.osRefundSuccess = osRefundSuccess;
	}

	@Column(name = "OS_Unconfirmed", length = 1024)
	public String getOsUnconfirmed() {
		return this.osUnconfirmed;
	}

	public void setOsUnconfirmed(String osUnconfirmed) {
		this.osUnconfirmed = osUnconfirmed;
	}

	@Column(name = "OS_OrderFinished", length = 1024)
	public String getOsOrderFinished() {
		return this.osOrderFinished;
	}

	public void setOsOrderFinished(String osOrderFinished) {
		this.osOrderFinished = osOrderFinished;
	}

	@Column(name = "OS_Payed", length = 1024)
	public String getOsPayed() {
		return this.osPayed;
	}

	public void setOsPayed(String osPayed) {
		this.osPayed = osPayed;
	}

	@Column(name = "OS_NotPaying", length = 1024)
	public String getOsNotPaying() {
		return this.osNotPaying;
	}

	public void setOsNotPaying(String osNotPaying) {
		this.osNotPaying = osNotPaying;
	}

}