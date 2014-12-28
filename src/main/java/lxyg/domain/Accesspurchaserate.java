package lxyg.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Accesspurchaserate entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "accesspurchaserate", catalog = "lxyg")
public class Accesspurchaserate implements java.io.Serializable {

	// Fields

	private Integer id;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private Integer aprRanking;
	private Integer goodsId;
	private Integer aprSentimentIndex;
	private Integer aprVisitsNumber;
	private Float aprVisitsPurchaseRate;
	private Set<Commoditylist> commoditylists = new HashSet<Commoditylist>(0);

	// Constructors

	/** default constructor */
	public Accesspurchaserate() {
	}

	/** minimal constructor */
	public Accesspurchaserate(Integer id, Timestamp timeAdd,
			Timestamp timeUpdate, Integer aprRanking, Integer goodsId) {
		this.id = id;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.aprRanking = aprRanking;
		this.goodsId = goodsId;
	}

	/** full constructor */
	public Accesspurchaserate(Integer id, Timestamp timeAdd,
			Timestamp timeUpdate, Integer aprRanking, Integer goodsId,
			Integer aprSentimentIndex, Integer aprVisitsNumber,
			Float aprVisitsPurchaseRate, Set<Commoditylist> commoditylists) {
		this.id = id;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.aprRanking = aprRanking;
		this.goodsId = goodsId;
		this.aprSentimentIndex = aprSentimentIndex;
		this.aprVisitsNumber = aprVisitsNumber;
		this.aprVisitsPurchaseRate = aprVisitsPurchaseRate;
		this.commoditylists = commoditylists;
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

	@Column(name = "APR_Ranking", nullable = false)
	public Integer getAprRanking() {
		return this.aprRanking;
	}

	public void setAprRanking(Integer aprRanking) {
		this.aprRanking = aprRanking;
	}

	@Column(name = "GoodsId", nullable = false)
	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	@Column(name = "APR_SentimentIndex")
	public Integer getAprSentimentIndex() {
		return this.aprSentimentIndex;
	}

	public void setAprSentimentIndex(Integer aprSentimentIndex) {
		this.aprSentimentIndex = aprSentimentIndex;
	}

	@Column(name = "APR_VisitsNumber")
	public Integer getAprVisitsNumber() {
		return this.aprVisitsNumber;
	}

	public void setAprVisitsNumber(Integer aprVisitsNumber) {
		this.aprVisitsNumber = aprVisitsNumber;
	}

	@Column(name = "APR_VisitsPurchaseRate", precision = 12, scale = 0)
	public Float getAprVisitsPurchaseRate() {
		return this.aprVisitsPurchaseRate;
	}

	public void setAprVisitsPurchaseRate(Float aprVisitsPurchaseRate) {
		this.aprVisitsPurchaseRate = aprVisitsPurchaseRate;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "accesspurchaserate")
	public Set<Commoditylist> getCommoditylists() {
		return this.commoditylists;
	}

	public void setCommoditylists(Set<Commoditylist> commoditylists) {
		this.commoditylists = commoditylists;
	}

}