package com.qac.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qac.row5project.entities.Image;
import com.qac.row5project.managers.ImageManager;


/**
 * 
 * @author Richard Allen
 *
 */

@Stateless
public class ImageService {
    
    @Inject
    private ImageManager imgManager;
    
    public String findImage(long productID){
	
	List<Image> tmp = imgManager.findImagesbyProductID(productID);
	String url = tmp.get(0).getUrl();
	return url;
	
    }
    		
}
