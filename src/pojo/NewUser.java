package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Registration")
public class NewUser {
	private String name, email, password;

	public NewUser() {
		super();
		System.out.println("In default ctor");
	}

	public NewUser(String name, String email, String password) {
		super();
		System.out.println("In param ctor");
		this.name = name;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "NewUser [name=" + name + ", email=" + email + ", password=" + password + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Id
	@Column(name="email", unique=true)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
