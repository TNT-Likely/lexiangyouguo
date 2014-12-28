package lxyg.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Emailserver entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "emailserver", catalog = "lxyg")
public class Emailserver implements java.io.Serializable {

	// Fields

	private Integer id;
	private Timestamp timeAdd;
	private Timestamp timeUpdate;
	private String esEmailServer;
	private String esSendMailService;
	private String esAccount;
	private String password;
	private String esReplyEmaiAddressl;
	private String esEmailAddress;

	// Constructors

	/** default constructor */
	public Emailserver() {
	}

	/** minimal constructor */
	public Emailserver(Timestamp timeAdd, Timestamp timeUpdate) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
	}

	/** full constructor */
	public Emailserver(Timestamp timeAdd, Timestamp timeUpdate,
			String esEmailServer, String esSendMailService, String esAccount,
			String password, String esReplyEmaiAddressl, String esEmailAddress) {
		this.timeAdd = timeAdd;
		this.timeUpdate = timeUpdate;
		this.esEmailServer = esEmailServer;
		this.esSendMailService = esSendMailService;
		this.esAccount = esAccount;
		this.password = password;
		this.esReplyEmaiAddressl = esReplyEmaiAddressl;
		this.esEmailAddress = esEmailAddress;
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

	@Column(name = "ES_EmailServer", length = 1024)
	public String getEsEmailServer() {
		return this.esEmailServer;
	}

	public void setEsEmailServer(String esEmailServer) {
		this.esEmailServer = esEmailServer;
	}

	@Column(name = "ES_SendMailService", length = 1024)
	public String getEsSendMailService() {
		return this.esSendMailService;
	}

	public void setEsSendMailService(String esSendMailService) {
		this.esSendMailService = esSendMailService;
	}

	@Column(name = "ES_Account", length = 1024)
	public String getEsAccount() {
		return this.esAccount;
	}

	public void setEsAccount(String esAccount) {
		this.esAccount = esAccount;
	}

	@Column(name = "Password", length = 1024)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "ES_ReplyEmaiAddressl", length = 1024)
	public String getEsReplyEmaiAddressl() {
		return this.esReplyEmaiAddressl;
	}

	public void setEsReplyEmaiAddressl(String esReplyEmaiAddressl) {
		this.esReplyEmaiAddressl = esReplyEmaiAddressl;
	}

	@Column(name = "ES_EmailAddress", length = 1024)
	public String getEsEmailAddress() {
		return this.esEmailAddress;
	}

	public void setEsEmailAddress(String esEmailAddress) {
		this.esEmailAddress = esEmailAddress;
	}

}