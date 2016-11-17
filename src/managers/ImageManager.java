
public interface ImageManager {
	
	//CREATE - INVENTORY MANAGER
	public void createImage(Image img);
	
	//UPDATE - INVENTORY MANAGER
	public void updateImage(Image img);
	
	//READ - INVENTORY MANAGER
	public Image findImagebyURL(String url);
	public List<Image> findImagesbyProductID(int productID);
}
