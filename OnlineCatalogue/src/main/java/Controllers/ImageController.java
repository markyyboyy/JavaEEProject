package Controllers;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.row5project.entities.Image;
import com.qac.services.ImageService;

/**
 * 
 * @author Richard Allen
 *
 */

@Named("image")
@SessionScoped
public class ImageController implements Serializable{
    
    private static final long serialVersionUID = 15555555L;
    
    @Inject
    private ImageService imgServ;
    
    public String getProductImage(long productID){
	
	String url = imgServ.findImage(productID);
	return url;
    }
    

}
