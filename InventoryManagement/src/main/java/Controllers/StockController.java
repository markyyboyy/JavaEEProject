package Controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.BarChartSeries;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;
import org.primefaces.model.chart.PieChartModel;

import com.qac.row5project.entities.Stock;
import com.qac.row5project.helpers.ProductItem;
import com.qac.row5project.helpers.ProductWrapper;
import com.qac.services.GenerateService;
import com.qac.services.ProductService;

/**
 * @author Mark Freeman
**/

@Named("stock")
@RequestScoped
public class StockController {
	@Inject
	private ProductService productService;
	private DataModel<ProductItem> products;
	List<ProductItem> products2 = new ArrayList<ProductItem>();
	PieChartModel pieModel = new PieChartModel();
	BarChartModel lineModel = new BarChartModel();
    private BarChartModel animatedModel1;
	/**
	 * This method returns a list of all of the products in the system.
	 * @return All of the products in the system.
	 */
public DataModel<ProductItem> getProducts() {
	 	
		if(products == null){
		 	setProducts(productService.findAllProducts());
		 	removeUnuused(products);
			return products;
		}
		else {
			return products;
		}
}

private void removeUnuused(DataModel<ProductItem> products3) {
		// TODO Auto-generated method stub
	List<ProductItem> items = new ArrayList<ProductItem>();
		for (ProductItem p:products3){
			if (p.getStockLevel() != 0){
				items.add(p);
			}
		}
		this.products = new ListDataModel<ProductItem>(items);
	}

public void setProducts(List<ProductItem> lsTemp)
{
	
		this.products = new ListDataModel<ProductItem>(lsTemp);
}


	public PieChartModel getPieModel() {
			setPieModel();
        return pieModel;
	}
	public BarChartModel getAnimatedModel1() {
		setPieModel();
    return animatedModel1;
}
	public void setPieModel(){
		products2 = productService.findAllProducts();
		for (ProductItem i:products){
			pieModel.set(i.getDescription(), i.getStockLevel());
			System.out.println(i.getDescription());
    }
		  animatedModel1 = initLinearModel();
	        animatedModel1.setTitle("Product Bar Chart");
	        animatedModel1.setAnimate(true);
	        animatedModel1.setLegendPosition("se");
	        Axis yAxis = animatedModel1.getAxis(AxisType.Y);
	        yAxis.setMin(1);
	}
	private BarChartModel initLinearModel() {
		BarChartModel model = new BarChartModel();
		
        BarChartSeries series1 = new BarChartSeries();
        
        products2 = productService.findAllProducts();
		for (ProductItem i:products){
			series1.set(i.getDescription(),i.getStockLevel());
    }
        
        series1.setLabel("Products");
 
        /*series1.set(1, 2);
        series1.set(2, 1);
        series1.set(3, 3);
        series1.set(4, 6);
        series1.set(5, 8);
 
        BarChartSeries series2 = new BarChartSeries();
        series2.setLabel("Series 2");
 
        series2.set(1, 6);
        series2.set(2, 3);
        series2.set(3, 2);
        series2.set(4, 7);
        series2.set(5, 9);
 */
        model.addSeries(series1);
       // model.addSeries(series2);
        return model;
	}
}