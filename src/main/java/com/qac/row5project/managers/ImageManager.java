package com.qac.row5project.managers;
import java.util.List;

import com.qac.row5project.entities.Image;

/***
 * This is the entity manager for the image entity
 * 
 * @author Ynyr Williams
 *
 */
public interface ImageManager {
	
	//CREATE, READ, UPDATE:INVENTORY MANAGER
	/**	
	 * Creates an image for a product
	 * 
	 * @param img
	 * @return
	 */
	public void createImage(Image img);
	/**
	 * Updates specific image
	 * 
	 * @param id
	 * @return
	 */
	public void updateImage(Image img);
	/**
	 * Finds a specific image by url
	 * 
	 * @param url
	 * @return
	 */
	public Image findImagebyURL(String url);
	/**
	 * Finds a collection of images by id
	 * 
	 * @param productID
	 * @return
	 */
	public List<Image> findImagesbyProductID(int productID);
}
