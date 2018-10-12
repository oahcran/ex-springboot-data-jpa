package com.example.springboot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	private String city;

	@NotNull
	private String name;

	public User() {
	}

	public User(long id) {
		this.id = id;
	}

	public User(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public long getId() {
		return id;
	}

	public void setId(long value) {
		this.id = value;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String value) {
		this.city = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String value) {
		this.name = value;
	}
}
