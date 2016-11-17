import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity 

public class Supplier  implements Serializable {
	
	static final long serialVersionUID = 6586263742271776754L;
	@Id private long id;
	
	private int idSupplier;
	
	public Supplier() {
	}

	public Supplier(int idSupplier) {
		this.idSupplier = idSupplier;
	}
	
	
}