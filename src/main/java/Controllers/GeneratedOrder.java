package Controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qac.services.Generate;

@Named("generated")
@RequestScoped
public class GeneratedOrder {
	@Inject
	private Generate generateService;
	private String message = "";
	
	public String getStockItems() {
		return generateService.getStock();
	}
}
