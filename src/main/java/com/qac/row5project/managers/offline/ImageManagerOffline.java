/***
 * 
 * @author Ynyr Williams
 *
 */
package com.qac.row5project.managers.offline;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import com.qac.row5project.entities.*;
import com.qac.row5project.managers.ImageManager;
import com.qac.row5project.helpers.*;

@Stateless
@Default
public class ImageManagerOffline implements ImageManager{
	
	//CREATE, READ, UPDATE:INVENTORY MANAGER
	TestData testData;
	/**
	 * Creates an image object and adds to list of images
	 * 
	 * @param img
	 * 
	 */
	public void createImage(Image img){

		List<Image> imageList = testData.getImages();
		imageList.add(img);
		testData.setImages(imageList);
	}
	/**
	 *Updates an image object
	 * 
	 * @param img
	 * 
	 */
	public void updateImage(Image img)
	{
		List<Image> imgList = testData.getImages();
		for(Image i: imgList)
		{
			if(i.getUrl().equals(img.getUrl()))
				testData.setImages(imgList);
		}
	}
	/**
	 * Finds an image by name
	 * 
	 * @param url
	 * 
	 * @return name
	 * 
	 */
	public Image findImagebyName(String name){
		List<Image> imgList = testData.getImages();
		for(Image i: imgList)
		{
			if(i.getUrl().equals(name))
				return i;
		}
		return null;
		
	}
	/**
	 * Creates an image object and adds to list of images
	 * 
	 * @param productID
	 * 
	 * @return tImgList
	 */
	public List<Image> findImagesbyProductID(int productID){

		List<Image> tImgList = new ArrayList<Image>();
		List<Image> imgList = testData.getImages();
		for(Image i: imgList)
		{
			if(i.getProductID()==productID)
				tImgList.add(i);
		}
		if(tImgList.isEmpty())
			return null;
		else
			return tImgList;
	}
}
