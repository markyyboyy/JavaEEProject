package test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ConversationScoped;
import javax.faces.model.DataModel;
import javax.inject.Named;

import com.qac.row5project.entities.Product;
import com.qac.row5project.entities.TestData;

@Named("Catalogue")
@ConversationScoped
public class Catalogue implements Serializable {

	
	
	
	
//	@Inject
//	private ProductService productService;
//
//	private PaginationHelper pagenationHelper;

//	private DataModel<ProductItem> products = null;
//
//	private void recreateModel() {
//
//		products = null;
//
//	}
//
//	public DataModel<ProductItem> getProducts() {
//
//		return (DataModel<ProductItem>) getPagination().createPageDataModel();
//
//	}
//
//	public PaginationHelper getPagination() {
//
//		if (pagenationHelper == null) {
//
//			pagenationHelper = new PaginationHelper(9) {	
//
//				@Override
//				public int getItemsCount() {
//
//					return productService.findAllActive().size();
//
//				}
//
//				@Override
//				public DataModel<ProductItem> createPageDataModel() {
//
//					try {
//
//						return new ListDataModel<ProductItem>(productService.findAllActive().subList(
//
//								getPageFirstItem(), getPageFirstItem() + getPageSize()));
//
//					} catch (Exception e) {
//
//						return new ListDataModel<ProductItem>(productService.findAllActive().subList(
//
//								getPageFirstItem(), getItemsCount()));
//
//					}
//
//				}
//
//			};
//
//		}
//		return pagenationHelper;
//	}
//
//	public String next() {
//
//		getPagination().nextPage();
//		recreateModel();
//
//		return "browse";
//	}
//
//	public String previous() {
//
//		getPagination().previousPage();
//		recreateModel();
//
//		return "browse";
//	}

}
