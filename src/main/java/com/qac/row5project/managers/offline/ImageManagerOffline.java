/***
 * 
 * @author Ynyr Williams
 *
 */
package com.qac.row5project.managers.offline;
import java.util.ArrayList;
import java.util.List;

import com.qac.row5project.entities.*;
import com.qac.row5project.managers.ImageManager;
import com.qac.row5project.helpers.*;

public class ImageManagerOffline implements ImageManager{
	
	//CREATE, READ, UPDATE:INVENTORY MANAGER
	TestData testData;
	public void createImage(Image img){

		List<Image> imageList = testData.getImages();
		imageList.add(img);
		testData.setImages(imageList);
	}
	public void updateImage(Image img)
	{
		List<Image> imgList = testData.getImages();
		for(Image i: imgList)
		{
			if(i.getUrl().equals(img.getUrl()))
				testData.setImages(imgList);
		}
	}
	public Image findImagebyURL(String url){
		List<Image> imgList = testData.getImages();
		for(Image i: imgList)
		{
			if(i.getUrl().equals(url))
				return i;
		}
		return null;
		
	}
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
