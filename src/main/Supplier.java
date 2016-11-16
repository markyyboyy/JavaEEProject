import java.io.Serializable;

import javax.persistence.Entity;


@Entity 

public class Supplier  implements Serializable {
	
	static final long serialVersionUID = -6586263742271776754L;
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