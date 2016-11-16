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
	@Column(name="id", nullable=false,
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