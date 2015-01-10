package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Ordercomments entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ordercomments", catalog = "lxyg")
public class Ordercomments implements java.io.Serializable {

	// Fields

	private Integer id;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private Integer orderId;
	private String orderComType;
	private String orderComContent;
	private Integer orderComDescriptionConsistent;
	private Integer orderComDeliverySpeed;
	private Integer orderComLogisticsSpeed;
	private Integer orderComCourierServiceAttitude;

	// Constructors

	/** default constructor */
	public Ordercomments() {
	}

	/** minimal constructor */
	public Ordercomments(Timestamp timeAdd, Timestamp timeUpdate,
			Integer orderId) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.orderId = orderId;
	}

	/** full constructor */
	public Ordercomments(Timestamp timeAdd, Timestamp timeUpdate,
			Integer orderId, String orderComType, String orderComContent,
			Integer orderComDescriptionConsistent,
			Integer orderComDeliverySpeed, Integer orderComLogisticsSpeed,
			Integer orderComCourierServiceAttitude) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.orderId = orderId;
		this.orderComType = orderComType;
		this.orderComContent = orderComContent;
		this.orderComDescriptionConsistent = orderComDescriptionConsistent;
		this.orderComDeliverySpeed = orderComDeliverySpeed;
		this.orderComLogisticsSpeed = orderComLogisticsSpeed;
		this.orderComCourierServiceAttitude = orderComCourierServiceAttitude;
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

	@Column(name = "OrderId", nullable = false)
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@Column(name = "OrderCom_Type", length = 1024)
	public String getOrderComType() {
		return this.orderComType;
	}

	public void setOrderComType(String orderComType) {
		this.orderComType = orderComType;
	}

	@Column(name = "OrderCom_Content", length = 1024)
	public String getOrderComContent() {
		return this.orderComContent;
	}

	public void setOrderComContent(String orderComContent) {
		this.orderComContent = orderComContent;
	}

	@Column(name = "OrderCom_DescriptionConsistent")
	public Integer getOrderComDescriptionConsistent() {
		return this.orderComDescriptionConsistent;
	}

	public void setOrderComDescriptionConsistent(
			Integer orderComDescriptionConsistent) {
		this.orderComDescriptionConsistent = orderComDescriptionConsistent;
	}

	@Column(name = "OrderCom_deliverySpeed")
	public Integer getOrderComDeliverySpeed() {
		return this.orderComDeliverySpeed;
	}

	public void setOrderComDeliverySpeed(Integer orderComDeliverySpeed) {
		this.orderComDeliverySpeed = orderComDeliverySpeed;
	}

	@Column(name = "OrderCom_LogisticsSpeed")
	public Integer getOrderComLogisticsSpeed() {
		return this.orderComLogisticsSpeed;
	}

	public void setOrderComLogisticsSpeed(Integer orderComLogisticsSpeed) {
		this.orderComLogisticsSpeed = orderComLogisticsSpeed;
	}

	@Column(name = "OrderCom_CourierServiceAttitude")
	public Integer getOrderComCourierServiceAttitude() {
		return this.orderComCourierServiceAttitude;
	}

	public void setOrderComCourierServiceAttitude(
			Integer orderComCourierServiceAttitude) {
		this.orderComCourierServiceAttitude = orderComCourierServiceAttitude;
	}

}