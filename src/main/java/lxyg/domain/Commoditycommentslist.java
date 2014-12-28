package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Commoditycommentslist entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "commoditycommentslist", catalog = "lxyg")
public class Commoditycommentslist implements java.io.Serializable {

	// Fields

	private Integer id;
	private Commoditylist commoditylist;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private String commodityComType;
	private String commodityComContent;
	private Integer memberId;
	private Integer commodityComDescriptionConsistent;
	private Integer commodityComDeliverySpeed;
	private Integer commodityComLogisticsSpeed;
	private Integer commodityComCourierServiceAttitude;

	// Constructors

	/** default constructor */
	public Commoditycommentslist() {
	}

	/** minimal constructor */
	public Commoditycommentslist(Integer id, Timestamp timeAdd,
			Timestamp timeUpdate) {
		this.id = id;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Commoditycommentslist(Integer id, Commoditylist commoditylist,
			Timestamp timeAdd, Timestamp timeUpdate, String commodityComType,
			String commodityComContent, Integer memberId,
			Integer commodityComDescriptionConsistent,
			Integer commodityComDeliverySpeed,
			Integer commodityComLogisticsSpeed,
			Integer commodityComCourierServiceAttitude) {
		this.id = id;
		this.commoditylist = commoditylist;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.commodityComType = commodityComType;
		this.commodityComContent = commodityComContent;
		this.memberId = memberId;
		this.commodityComDescriptionConsistent = commodityComDescriptionConsistent;
		this.commodityComDeliverySpeed = commodityComDeliverySpeed;
		this.commodityComLogisticsSpeed = commodityComLogisticsSpeed;
		this.commodityComCourierServiceAttitude = commodityComCourierServiceAttitude;
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
	@JoinColumn(name = "Com_Id")
	public Commoditylist getCommoditylist() {
		return this.commoditylist;
	}

	public void setCommoditylist(Commoditylist commoditylist) {
		this.commoditylist = commoditylist;
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

	@Column(name = "CommodityCom_Type", length = 1024)
	public String getCommodityComType() {
		return this.commodityComType;
	}

	public void setCommodityComType(String commodityComType) {
		this.commodityComType = commodityComType;
	}

	@Column(name = "CommodityCom_Content", length = 1024)
	public String getCommodityComContent() {
		return this.commodityComContent;
	}

	public void setCommodityComContent(String commodityComContent) {
		this.commodityComContent = commodityComContent;
	}

	@Column(name = "MemberId")
	public Integer getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	@Column(name = "CommodityCom_DescriptionConsistent")
	public Integer getCommodityComDescriptionConsistent() {
		return this.commodityComDescriptionConsistent;
	}

	public void setCommodityComDescriptionConsistent(
			Integer commodityComDescriptionConsistent) {
		this.commodityComDescriptionConsistent = commodityComDescriptionConsistent;
	}

	@Column(name = "CommodityCom_deliverySpeed")
	public Integer getCommodityComDeliverySpeed() {
		return this.commodityComDeliverySpeed;
	}

	public void setCommodityComDeliverySpeed(Integer commodityComDeliverySpeed) {
		this.commodityComDeliverySpeed = commodityComDeliverySpeed;
	}

	@Column(name = "CommodityCom_LogisticsSpeed")
	public Integer getCommodityComLogisticsSpeed() {
		return this.commodityComLogisticsSpeed;
	}

	public void setCommodityComLogisticsSpeed(Integer commodityComLogisticsSpeed) {
		this.commodityComLogisticsSpeed = commodityComLogisticsSpeed;
	}

	@Column(name = "CommodityCom_CourierServiceAttitude")
	public Integer getCommodityComCourierServiceAttitude() {
		return this.commodityComCourierServiceAttitude;
	}

	public void setCommodityComCourierServiceAttitude(
			Integer commodityComCourierServiceAttitude) {
		this.commodityComCourierServiceAttitude = commodityComCourierServiceAttitude;
	}

}