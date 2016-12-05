/***
 * 
 * @author Ynyr Williams
 *
 */
package com.qac.row5project.managers.offline;
import java.util.ArrayList;

import com.qac.row5project.entities.*;
import com.qac.row5project.managers.ImageManager;

public class ImageManagerOffline implements ImageManager{
	
	//CREATE, READ, UPDATE:INVENTORY MANAGER
	TestData testData;
	public void createImage(Image img){

		ArrayList<Image> imageList = testData.getImages();
		imageList.add(img);
		testData.setImages(imageList);
	}
	public void updateImage(Image img)
	{
		ArrayList<Image> imgList = testData.getImages();
		for(Image i: imgList)
		{
			if(i.getUrl().equals(img.getUrl()))
				testData.setImages(imgList);
		}
	}
	public Image findImagebyURL(String url){
		ArrayList<Image> imgList = testData.getImages();
		for(Image i: imgList)
		{
			if(i.getUrl().equals(url))
				return i;
		}
		return null;
		
	}
	public ArrayList<Image> findImagesbyProductID(int productID){

		ArrayList<Image> tImgList = new ArrayList<Image>();
		ArrayList<Image> imgList = testData.getImages();
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
