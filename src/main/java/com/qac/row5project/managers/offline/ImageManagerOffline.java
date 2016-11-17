package com.qac.row5project.managers.offline;

import java.util.List;
import com.qac.row5project.entities.Image;

public interface ImageManagerOffline {
	
	//CREATE, READ, UPDATE:INVENTORY MANAGER

	public void createImage(Image img);
	public void updateImage(Image img);
	public Image findImagebyURL(String url);
	public List<Image> findImagesbyProductID(int productID);
}
