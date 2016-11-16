
@Entity 
@Table(name = "Supplier")

public class Supplier {
	
	@Id
	@Column(name ="id", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private int idSupplier;
	
	public Supplier() {
	}

	public Supplier(int idSupplier) {
		this.idSupplier = idSupplier;
	}
	
	
}