package Controllers;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.chart.PieChartModel;

import com.qac.services.GenerateService;

@Named("bean")
@RequestScoped
public class Bean {

	@Inject
	private GenerateService genServ;
	
   private PieChartModel pieModel;

    public PieChartModel getPieModel() {
        pieModel = new PieChartModel();
        genServ.getProducts();
        pieModel.set("Brand 1", 540);
        pieModel.set("Brand 2", 325);
        pieModel.set("Brand 3", 702);
        pieModel.set("Brand 4", 421);
        return pieModel;
    }

}

