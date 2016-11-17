public interface SupplierManager {
	
	//CREATE - Inventory Manager Only
	public void createSupplier(Supplier supplier);
	
	//READ - Inventory Manager Only
	public Supplier readByIdSupplier(int idSupplier);
}
