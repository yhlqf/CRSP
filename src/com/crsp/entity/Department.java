package com.crsp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/*部门表实体类*/
@Entity
@Table(name = "department")
public class Department implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	@GenericGenerator(name = "paymentableGenerator", strategy = "native")
	@GeneratedValue(generator = "paymentableGenerator")
	private Integer id;// 主键,自增
	@Column
	private String name;// 名称
	@Column
	private String description;// 描述
	@Column
	private String avatar;//头像

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", description="
				+ description + ", avatar=" + avatar + "]";
	}
}
