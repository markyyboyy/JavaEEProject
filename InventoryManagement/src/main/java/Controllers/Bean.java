package Controllers;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import org.primefaces.model.chart.PieChartModel;

@ManagedBean
@SessionScoped
@Named ("bean")
public class Bean implements Serializable {

   private static final long serialVersionUID = 1L;
   private PieChartModel pieModel;

   public Bean() {
        createPieModel();
   }

    public PieChartModel getPieModel() {
        return pieModel;
    }

    private void createPieModel() {
        pieModel = new PieChartModel();

        pieModel.set("Brand 1", 540);
        pieModel.set("Brand 2", 325);
        pieModel.set("Brand 3", 702);
        pieModel.set("Brand 4", 421);
    }
}