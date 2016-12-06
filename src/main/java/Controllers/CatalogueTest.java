package Controllers;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Named;

/**
 * Session Bean implementation class CatalogueTest
 */
@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
@LocalBean
@Named("cat")
public class CatalogueTest {

	
	private String Test;
	
    /**
     * Default constructor. 
     */
    public CatalogueTest() {
        // TODO Auto-generated constructor stub
    }
    
    
    public String getTest(){
    	return "hello";
    }
    

}
