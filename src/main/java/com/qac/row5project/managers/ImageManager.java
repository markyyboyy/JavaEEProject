/***
 * 
 * @author Ynyr Williams
 *
 */
package com.qac.row5project.managers;
import java.util.List;

import com.qac.row5project.entities.Image;

public interface ImageManager {
	
	//CREATE, READ, UPDATE:INVENTORY MANAGER

	public void createImage(Image img);
	public void updateImage(Image img);
	public Image findImagebyURL(String url);
	public List<Image> findImagesbyProductID(int productID);
}
