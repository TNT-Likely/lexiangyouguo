package lxyg.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * HolidayspecialareaId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class HolidayspecialareaId implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer proId;

	// Constructors

	/** default constructor */
	public HolidayspecialareaId() {
	}

	/** full constructor */
	public HolidayspecialareaId(Integer id, Integer proId) {
		this.id = id;
		this.proId = proId;
	}

	// Property accessors

	@Column(name = "Id", nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "Pro_Id", nullable = false)
	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HolidayspecialareaId))
			return false;
		HolidayspecialareaId castOther = (HolidayspecialareaId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getProId() == castOther.getProId()) || (this
						.getProId() != null && castOther.getProId() != null && this
						.getProId().equals(castOther.getProId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getProId() == null ? 0 : this.getProId().hashCode());
		return result;
	}

}