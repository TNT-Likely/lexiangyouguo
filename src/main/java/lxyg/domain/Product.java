package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "product", catalog = "lxyg")
public class Product implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer proCatId;
	private String proName;
	private String proDescribe;
	private Boolean proIsReduce;
	private Long proPrice;
	private Long proRedPrice;
	private Short proStock;
	private String proShow;
	private String proStoConditions;
	private Long proWeight;
	private String proSaleUnit;
	private String proOrigin;
	private String proSpecifications;
	private String proModel;
	private String proTips;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** minimal constructor */
	public Product(Integer proCatId, String proDescribe, Long proRedPrice,
			String proShow, Timestamp timeAdd, Timestamp timeUpdate) {
		this.proCatId = proCatId;
		this.proDescribe = proDescribe;
		this.proRedPrice = proRedPrice;
		this.proShow = proShow;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Product(Integer proCatId, String proName, String proDescribe,
			Boolean proIsReduce, Long proPrice, Long proRedPrice,
			Short proStock, String proShow, String proStoConditions,
			Long proWeight, String proSaleUnit, String proOrigin,
			String proSpecifications, String proModel, String proTips,
			Timestamp timeAdd, Timestamp timeUpdate) {
		this.proCatId = proCatId;
		this.proName = proName;
		this.proDescribe = proDescribe;
		this.proIsReduce = proIsReduce;
		this.proPrice = proPrice;
		this.proRedPrice = proRedPrice;
		this.proStock = proStock;
		this.proShow = proShow;
		this.proStoConditions = proStoConditions;
		this.proWeight = proWeight;
		this.proSaleUnit = proSaleUnit;
		this.proOrigin = proOrigin;
		this.proSpecifications = proSpecifications;
		this.proModel = proModel;
		this.proTips = proTips;
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

	@Column(name = "ProCatId", nullable = false)
	public Integer getProCatId() {
		return this.proCatId;
	}

	public void setProCatId(Integer proCatId) {
		this.proCatId = proCatId;
	}

	@Column(name = "ProName")
	public String getProName() {
		return this.proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	@Column(name = "ProDescribe", nullable = false)
	public String getProDescribe() {
		return this.proDescribe;
	}

	public void setProDescribe(String proDescribe) {
		this.proDescribe = proDescribe;
	}

	@Column(name = "ProIsReduce")
	public Boolean getProIsReduce() {
		return this.proIsReduce;
	}

	public void setProIsReduce(Boolean proIsReduce) {
		this.proIsReduce = proIsReduce;
	}

	@Column(name = "ProPrice", precision = 10, scale = 0)
	public Long getProPrice() {
		return this.proPrice;
	}

	public void setProPrice(Long proPrice) {
		this.proPrice = proPrice;
	}

	@Column(name = "ProRedPrice", nullable = false, precision = 10, scale = 0)
	public Long getProRedPrice() {
		return this.proRedPrice;
	}

	public void setProRedPrice(Long proRedPrice) {
		this.proRedPrice = proRedPrice;
	}

	@Column(name = "ProStock")
	public Short getProStock() {
		return this.proStock;
	}

	public void setProStock(Short proStock) {
		this.proStock = proStock;
	}

	@Column(name = "ProShow", nullable = false, length = 65535)
	public String getProShow() {
		return this.proShow;
	}

	public void setProShow(String proShow) {
		this.proShow = proShow;
	}

	@Column(name = "ProStoConditions")
	public String getProStoConditions() {
		return this.proStoConditions;
	}

	public void setProStoConditions(String proStoConditions) {
		this.proStoConditions = proStoConditions;
	}

	@Column(name = "ProWeight", precision = 10, scale = 0)
	public Long getProWeight() {
		return this.proWeight;
	}

	public void setProWeight(Long proWeight) {
		this.proWeight = proWeight;
	}

	@Column(name = "ProSaleUnit")
	public String getProSaleUnit() {
		return this.proSaleUnit;
	}

	public void setProSaleUnit(String proSaleUnit) {
		this.proSaleUnit = proSaleUnit;
	}

	@Column(name = "ProOrigin")
	public String getProOrigin() {
		return this.proOrigin;
	}

	public void setProOrigin(String proOrigin) {
		this.proOrigin = proOrigin;
	}

	@Column(name = "ProSpecifications")
	public String getProSpecifications() {
		return this.proSpecifications;
	}

	public void setProSpecifications(String proSpecifications) {
		this.proSpecifications = proSpecifications;
	}

	@Column(name = "ProModel")
	public String getProModel() {
		return this.proModel;
	}

	public void setProModel(String proModel) {
		this.proModel = proModel;
	}

	@Column(name = "ProTips")
	public String getProTips() {
		return this.proTips;
	}

	public void setProTips(String proTips) {
		this.proTips = proTips;
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