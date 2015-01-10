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
 * Shopinformation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "shopinformation", catalog = "lxyg")
public class Shopinformation implements java.io.Serializable {

	// Fields

	private Integer id;
	private Storesettings storesettings;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private String shopInfoShopName;
	private String shopInfoShopLogo;
	private String shopInfoStoreSlogan;
	private String shopInfoStoreCopyright;
	private String shopInfoStoreAuthoritativeAttestation;

	// Constructors

	/** default constructor */
	public Shopinformation() {
	}

	/** minimal constructor */
	public Shopinformation(Timestamp timeAdd, Timestamp timeUpdate,
			String shopInfoShopName) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.shopInfoShopName = shopInfoShopName;
	}

	/** full constructor */
	public Shopinformation(Storesettings storesettings, Timestamp timeAdd,
			Timestamp timeUpdate, String shopInfoShopName,
			String shopInfoShopLogo, String shopInfoStoreSlogan,
			String shopInfoStoreCopyright,
			String shopInfoStoreAuthoritativeAttestation) {
		this.storesettings = storesettings;
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.shopInfoShopName = shopInfoShopName;
		this.shopInfoShopLogo = shopInfoShopLogo;
		this.shopInfoStoreSlogan = shopInfoStoreSlogan;
		this.shopInfoStoreCopyright = shopInfoStoreCopyright;
		this.shopInfoStoreAuthoritativeAttestation = shopInfoStoreAuthoritativeAttestation;
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
	@JoinColumn(name = "Sto_Id")
	public Storesettings getStoresettings() {
		return this.storesettings;
	}

	public void setStoresettings(Storesettings storesettings) {
		this.storesettings = storesettings;
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

	@Column(name = "ShopInfo_ShopName", nullable = false, length = 1024)
	public String getShopInfoShopName() {
		return this.shopInfoShopName;
	}

	public void setShopInfoShopName(String shopInfoShopName) {
		this.shopInfoShopName = shopInfoShopName;
	}

	@Column(name = "ShopInfo_ShopLogo", length = 1024)
	public String getShopInfoShopLogo() {
		return this.shopInfoShopLogo;
	}

	public void setShopInfoShopLogo(String shopInfoShopLogo) {
		this.shopInfoShopLogo = shopInfoShopLogo;
	}

	@Column(name = "ShopInfo_StoreSlogan", length = 1024)
	public String getShopInfoStoreSlogan() {
		return this.shopInfoStoreSlogan;
	}

	public void setShopInfoStoreSlogan(String shopInfoStoreSlogan) {
		this.shopInfoStoreSlogan = shopInfoStoreSlogan;
	}

	@Column(name = "ShopInfo_StoreCopyright", length = 1024)
	public String getShopInfoStoreCopyright() {
		return this.shopInfoStoreCopyright;
	}

	public void setShopInfoStoreCopyright(String shopInfoStoreCopyright) {
		this.shopInfoStoreCopyright = shopInfoStoreCopyright;
	}

	@Column(name = "ShopInfo_StoreAuthoritativeAttestation", length = 1024)
	public String getShopInfoStoreAuthoritativeAttestation() {
		return this.shopInfoStoreAuthoritativeAttestation;
	}

	public void setShopInfoStoreAuthoritativeAttestation(
			String shopInfoStoreAuthoritativeAttestation) {
		this.shopInfoStoreAuthoritativeAttestation = shopInfoStoreAuthoritativeAttestation;
	}

}