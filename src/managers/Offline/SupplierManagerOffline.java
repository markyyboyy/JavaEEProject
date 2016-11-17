import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

@Stateless
@Default

public class SupplierManagerOffline implements SupplierManger {
	@Inject
	private TestData testData;
	
	//CREATE - Inventory Manager Only
	@Override
	public void createSupplier(Supplier supplier);
		
		
	//READ - Inventory Manager Only
	@Override
	public Supplier readByIdSupplier(int idSupplier) {
		for (Supplier supplier : testData.getIdSupplier()) {
			if (supplier.getIdSupplier() == idSupplier) {
				return supplier;
			}
			return null;
		}
	}
		
	}
	
}