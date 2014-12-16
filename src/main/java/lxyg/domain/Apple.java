package lxyg.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Apple entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "apple", catalog = "apple")
public class Apple implements java.io.Serializable {

	// Fields

	private String id;
	private String color;
	private Float size;
	private Float weight;

	// Constructors

	/** default constructor */
	public Apple() {
	}

	/** minimal constructor */
	public Apple(String id) {
		this.id = id;
	}

	/** full constructor */
	public Apple(String id, String color, Float size, Float weight) {
		this.id = id;
		this.color = color;
		this.size = size;
		this.weight = weight;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false, length = 32)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "color", length = 50)
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Column(name = "size", precision = 12, scale = 0)
	public Float getSize() {
		return this.size;
	}

	public void setSize(Float size) {
		this.size = size;
	}

	@Column(name = "weight", precision = 12, scale = 0)
	public Float getWeight() {
		return this.weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

}