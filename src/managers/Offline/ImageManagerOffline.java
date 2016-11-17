
public interface ImageManager {
	
	//CREATE, READ, UPDATE:INVENTORY MANAGER

	public void createImage(Image img);
	public void updateImage(Image img);
	public Image findImagebyURL(String url);
	public List<Image> findImagesbyProductID(int productID);
}
