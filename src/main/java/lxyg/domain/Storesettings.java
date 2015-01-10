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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Storesettings entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "storesettings", catalog = "lxyg")
public class Storesettings implements java.io.Serializable {

	// Fields

	private Integer id;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private String storeSsttingsId;
	private String storeBasicSetting;
	private String storeShoppingProcess;
	private String storeCommodityDisplaySetting;
	private Integer shoId;
	private Set<Shopinformation> shopinformations = new HashSet<Shopinformation>(
			0);

	// Constructors

	/** default constructor */
	public Storesettings() {
	}

	/** minimal constructor */
	public Storesettings(Timestamp timeAdd, Timestamp timeUpdate,
			String storeSsttingsId) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.storeSsttingsId = storeSsttingsId;
	}

	/** full constructor */
	public Storesettings(Timestamp timeAdd, Timestamp timeUpdate,
			String storeSsttingsId, String storeBasicSetting,
			String storeShoppingProcess, String storeCommodityDisplaySetting,
			Integer shoId, Set<Shopinformation> shopinformations) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.storeSsttingsId = storeSsttingsId;
		this.storeBasicSetting = storeBasicSetting;
		this.storeShoppingProcess = storeShoppingProcess;
		this.storeCommodityDisplaySetting = storeCommodityDisplaySetting;
		this.shoId = shoId;
		this.shopinformations = shopinformations;
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

	@Column(name = "StoreSsttingsId", nullable = false, length = 1024)
	public String getStoreSsttingsId() {
		return this.storeSsttingsId;
	}

	public void setStoreSsttingsId(String storeSsttingsId) {
		this.storeSsttingsId = storeSsttingsId;
	}

	@Column(name = "StoreBasicSetting", length = 1024)
	public String getStoreBasicSetting() {
		return this.storeBasicSetting;
	}

	public void setStoreBasicSetting(String storeBasicSetting) {
		this.storeBasicSetting = storeBasicSetting;
	}

	@Column(name = "StoreShoppingProcess", length = 1024)
	public String getStoreShoppingProcess() {
		return this.storeShoppingProcess;
	}

	public void setStoreShoppingProcess(String storeShoppingProcess) {
		this.storeShoppingProcess = storeShoppingProcess;
	}

	@Column(name = "StoreCommodityDisplaySetting", length = 1024)
	public String getStoreCommodityDisplaySetting() {
		return this.storeCommodityDisplaySetting;
	}

	public void setStoreCommodityDisplaySetting(
			String storeCommodityDisplaySetting) {
		this.storeCommodityDisplaySetting = storeCommodityDisplaySetting;
	}

	@Column(name = "Sho_Id")
	public Integer getShoId() {
		return this.shoId;
	}

	public void setShoId(Integer shoId) {
		this.shoId = shoId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "storesettings")
	public Set<Shopinformation> getShopinformations() {
		return this.shopinformations;
	}

	public void setShopinformations(Set<Shopinformation> shopinformations) {
		this.shopinformations = shopinformations;
	}

}