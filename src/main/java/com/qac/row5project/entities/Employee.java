package com.qac.row5project.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="employees")

public class Employee {
	@OneToOne
	@JoinColumn(name="logindetails_ID",joinColumns=
	@JoinTable(name="employee",
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
	private int id;

	public Employee() {
	}

	public Employee(LoginDetails logInDetails, int id) {
		this.logInDetails = logInDetails;
		this.id = id;
	}

	public LoginDetails getLogInDetails() {
		return this.logInDetails;
	}
}