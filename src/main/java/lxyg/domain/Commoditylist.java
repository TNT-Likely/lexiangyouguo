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
 * Commoditylist entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "commoditylist", catalog = "lxyg")
public class Commoditylist implements java.io.Serializable {

	// Fields

	private Integer id;
	private Membercollectiontable membercollectiontable;
	private Ordercontentlist ordercontentlist;
	private Gifttablecontents gifttablecontents;
	private Accesspurchaserate accesspurchaserate;
	private Carttable carttable;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private String commodityNumber;
	private String commodityItemNamber;
	private String commodityShelves;
	private Integer commodityInventory;
	private Integer commodityKindNumber;
	private Integer commodityQuantity;
	private String commodityDisplay;
	private Integer commodityCollectionNumber;
	private Integer commodityCommentsId;
	private String commodityName;
	private Set<Commoditycommentslist> commoditycommentslists = new HashSet<Commoditycommentslist>(
			0);
	private Set<Commodityclassification> commodityclassifications = new HashSet<Commodityclassification>(
			0);

	// Constructors

	/** default constructor */
	public Commoditylist() {
	}

	/** minimal constructor */
	public Commoditylist(Timestamp timeAdd, Timestamp timeUpdate,
			String commodityNumber, String commodityItemNamber) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.commodityNumber = commodityNumber;
		this.commodityItemNamber = commodityItemNamber;
	}

	/** full constructor */
	public Commoditylist(Membercollectiontable membercollectiontable,
			Ordercontentlist ordercontentlist,
			Gifttablecontents gifttablecontents,
			Accesspurchaserate accesspurchaserate, Carttable carttable,
			Timestamp timeAdd, Timestamp timeUpdate, String commodityNumber,
			String commodityItemNamber, String commodityShelves,
			Integer commodityInventory, Integer commodityKindNumber,
			Integer commodityQuantity, String commodityDisplay,
			Integer commodityCollectionNumber, Integer commodityCommentsId,
			String commodityName,
			Set<Commoditycommentslist> commoditycommentslists,
			Set<Commodityclassification> commodityclassifications) {
		this.membercollectiontable = membercollectiontable;
		this.ordercontentlist = ordercontentlist;
		this.gifttablecontents = gifttablecontents;
		this.accesspurchaserate = accesspurchaserate;
		this.carttable = carttable;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.commodityNumber = commodityNumber;
		this.commodityItemNamber = commodityItemNamber;
		this.commodityShelves = commodityShelves;
		this.commodityInventory = commodityInventory;
		this.commodityKindNumber = commodityKindNumber;
		this.commodityQuantity = commodityQuantity;
		this.commodityDisplay = commodityDisplay;
		this.commodityCollectionNumber = commodityCollectionNumber;
		this.commodityCommentsId = commodityCommentsId;
		this.commodityName = commodityName;
		this.commoditycommentslists = commoditycommentslists;
		this.commodityclassifications = commodityclassifications;
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
	@JoinColumn(name = "Mem_Id")
	public Membercollectiontable getMembercollectiontable() {
		return this.membercollectiontable;
	}

	public void setMembercollectiontable(
			Membercollectiontable membercollectiontable) {
		this.membercollectiontable = membercollectiontable;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Ord_Id")
	public Ordercontentlist getOrdercontentlist() {
		return this.ordercontentlist;
	}

	public void setOrdercontentlist(Ordercontentlist ordercontentlist) {
		this.ordercontentlist = ordercontentlist;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Gif_Id")
	public Gifttablecontents getGifttablecontents() {
		return this.gifttablecontents;
	}

	public void setGifttablecontents(Gifttablecontents gifttablecontents) {
		this.gifttablecontents = gifttablecontents;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Acc_Id")
	public Accesspurchaserate getAccesspurchaserate() {
		return this.accesspurchaserate;
	}

	public void setAccesspurchaserate(Accesspurchaserate accesspurchaserate) {
		this.accesspurchaserate = accesspurchaserate;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Car_Id")
	public Carttable getCarttable() {
		return this.carttable;
	}

	public void setCarttable(Carttable carttable) {
		this.carttable = carttable;
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

	@Column(name = "CommodityNumber", nullable = false, length = 1024)
	public String getCommodityNumber() {
		return this.commodityNumber;
	}

	public void setCommodityNumber(String commodityNumber) {
		this.commodityNumber = commodityNumber;
	}

	@Column(name = "CommodityItemNamber", nullable = false, length = 1024)
	public String getCommodityItemNamber() {
		return this.commodityItemNamber;
	}

	public void setCommodityItemNamber(String commodityItemNamber) {
		this.commodityItemNamber = commodityItemNamber;
	}

	@Column(name = "CommodityShelves", length = 1024)
	public String getCommodityShelves() {
		return this.commodityShelves;
	}

	public void setCommodityShelves(String commodityShelves) {
		this.commodityShelves = commodityShelves;
	}

	@Column(name = "CommodityInventory")
	public Integer getCommodityInventory() {
		return this.commodityInventory;
	}

	public void setCommodityInventory(Integer commodityInventory) {
		this.commodityInventory = commodityInventory;
	}

	@Column(name = "CommodityKindNumber")
	public Integer getCommodityKindNumber() {
		return this.commodityKindNumber;
	}

	public void setCommodityKindNumber(Integer commodityKindNumber) {
		this.commodityKindNumber = commodityKindNumber;
	}

	@Column(name = "CommodityQuantity")
	public Integer getCommodityQuantity() {
		return this.commodityQuantity;
	}

	public void setCommodityQuantity(Integer commodityQuantity) {
		this.commodityQuantity = commodityQuantity;
	}

	@Column(name = "CommodityDisplay", length = 1024)
	public String getCommodityDisplay() {
		return this.commodityDisplay;
	}

	public void setCommodityDisplay(String commodityDisplay) {
		this.commodityDisplay = commodityDisplay;
	}

	@Column(name = "CommodityCollectionNumber")
	public Integer getCommodityCollectionNumber() {
		return this.commodityCollectionNumber;
	}

	public void setCommodityCollectionNumber(Integer commodityCollectionNumber) {
		this.commodityCollectionNumber = commodityCollectionNumber;
	}

	@Column(name = "CommodityCommentsId")
	public Integer getCommodityCommentsId() {
		return this.commodityCommentsId;
	}

	public void setCommodityCommentsId(Integer commodityCommentsId) {
		this.commodityCommentsId = commodityCommentsId;
	}

	@Column(name = "CommodityName", length = 1024)
	public String getCommodityName() {
		return this.commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "commoditylist")
	public Set<Commoditycommentslist> getCommoditycommentslists() {
		return this.commoditycommentslists;
	}

	public void setCommoditycommentslists(
			Set<Commoditycommentslist> commoditycommentslists) {
		this.commoditycommentslists = commoditycommentslists;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "commoditylist")
	public Set<Commodityclassification> getCommodityclassifications() {
		return this.commodityclassifications;
	}

	public void setCommodityclassifications(
			Set<Commodityclassification> commodityclassifications) {
		this.commodityclassifications = commodityclassifications;
	}

}