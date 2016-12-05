/**
 * @author Mark Freeman
 */
package com.qac.row5project.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="login Details")
public class LoginDetails {
	/**
	The table has two columns
	 */
	@Column (name="email",length=100,nullable=false,unique=true)
	@Size(max = 100)
	private String email;
	@Column (name="password",length=100,nullable=false)
	@Size(max = 100)
	private String password;
	

	public LoginDetails() {
	}
	/**
	To construct a user you need a username and a password
	 */
	public LoginDetails(String email, String password) { 
		this.email = email;
		this.password = password;
	}
	/**
	Gettters and setters
	 */
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
