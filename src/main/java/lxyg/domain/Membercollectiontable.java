package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Membercollectiontable entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "membercollectiontable", catalog = "lxyg")
public class Membercollectiontable implements java.io.Serializable {

	// Fields

	private Integer id;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private Integer memberId;
	private Integer goodsId;
	private Integer comId;
	private Integer memId;

	// Constructors

	/** default constructor */
	public Membercollectiontable() {
	}

	/** minimal constructor */
	public Membercollectiontable(Timestamp timeAdd, Timestamp timeUpdate,
			Integer memberId, Integer goodsId) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.memberId = memberId;
		this.goodsId = goodsId;
	}

	/** full constructor */
	public Membercollectiontable(Timestamp timeAdd, Timestamp timeUpdate,
			Integer memberId, Integer goodsId, Integer comId, Integer memId) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.memberId = memberId;
		this.goodsId = goodsId;
		this.comId = comId;
		this.memId = memId;
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

	@Column(name = "MemberId", nullable = false)
	public Integer getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	@Column(name = "GoodsId", nullable = false)
	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	@Column(name = "Com_Id")
	public Integer getComId() {
		return this.comId;
	}

	public void setComId(Integer comId) {
		this.comId = comId;
	}

	@Column(name = "Mem_Id")
	public Integer getMemId() {
		return this.memId;
	}

	public void setMemId(Integer memId) {
		this.memId = memId;
	}

}