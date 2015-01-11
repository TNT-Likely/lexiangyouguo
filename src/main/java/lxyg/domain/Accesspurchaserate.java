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
 * Accesspurchaserate entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "accesspurchaserate", catalog = "lxyg")
public class Accesspurchaserate implements java.io.Serializable {

	// Fields

	private Integer id;
	private Product product;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private Integer aprRanking;
	private Integer aprSentimentIndex;
	private Integer aprVisitsNumber;
	private Float aprVisitsPurchaseRate;

	// Constructors

	/** default constructor */
	public Accesspurchaserate() {
	}

	/** minimal constructor */
	public Accesspurchaserate(Product product, Timestamp timeAdd,
			Timestamp timeUpdate, Integer aprRanking) {
		this.product = product;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.aprRanking = aprRanking;
	}

	/** full constructor */
	public Accesspurchaserate(Product product, Timestamp timeAdd,
			Timestamp timeUpdate, Integer aprRanking,
			Integer aprSentimentIndex, Integer aprVisitsNumber,
			Float aprVisitsPurchaseRate) {
		this.product = product;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.aprRanking = aprRanking;
		this.aprSentimentIndex = aprSentimentIndex;
		this.aprVisitsNumber = aprVisitsNumber;
		this.aprVisitsPurchaseRate = aprVisitsPurchaseRate;
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
	@JoinColumn(name = "ProId", nullable = false)
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
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

}