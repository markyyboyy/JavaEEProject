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
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employees")

public class Employee {
	/**
	Each employee needs to be linked to a user account.
	 */
	@OneToOne
	@JoinTable(name="logindetails_ID",joinColumns=
	@JoinColumn(name="employee",
	referencedColumnName="Details_email"),
	inverseJoinColumns=
	@JoinColumn(name="logindetails",
	referencedColumnName="email"))
	private LoginDetails logInDetails;
	
	@Id
	@Column(name="idEmployee", nullable=false,
	unique=true)
	@GeneratedValue(strategy=GenerationType.
	IDENTITY)
	private long id;

	public Employee() {
	}
	/**
	To construct a user you need a username, a password and an employeeID.
	 */
	public Employee(LoginDetails logInDetails, long id) {
		this.logInDetails = logInDetails;
		this.id = id;
	}
	/**
	Getters and setters
	 */
	public LoginDetails getLogInDetails() {
		return this.logInDetails;
	}

	public long getID() {
		return id;
	}
}