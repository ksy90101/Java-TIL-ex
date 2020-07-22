package jojoldu.aop.ex.common;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String email;
	@Column
	private String name;

	public User() {

	}

	public User(final String email, final String name) {
		this.email = email;
		this.name = name;
	}

	public User(final Long id, final String email, final String name) {
		this.id = id;
		this.email = email;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}
}
