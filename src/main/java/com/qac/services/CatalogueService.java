/*package com.qac.services;

import java.util.List;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;

import com.qac.row5project.entities.Product;
import com.qac.row5project.entities.ProductItem;
import com.qac.row5project.helpers.PaginationHelper;

public class CatalogueService {

	@Inject
	private ProductService productService;

	private PaginationHelper pagenationHelper;

	private DataModel<Product> products = null;

	private void recreateModel() {
		products = null;
	}

	public DataModel<ProductItem> getProducts() {

		return (DataModel<ProductItem>) getPagination().createPageDataModel();

	}

	public PaginationHelper getPagination() {
		if (pagenationHelper == null) {

			pagenationHelper = new PaginationHelper(9) {

				@Override
				public int getItemsCount() {
					return 15;					
				}

				@Override
				public DataModel<Product> createPageDataModel() {

					try {
						
						List<Product> lstAll = productService.findAllProducts();
						
						
						return new ListDataModel<Product>(lstAll.subList(getPageFirstItem(), getPageFirstItem() + getPageSize()));

					} catch (Exception e) {

						return new ListDataModel<Product>(
								productService.findAllProducts().subList(getPageFirstItem(), getItemsCount()));
					}

				}

			};

		}

		return pagenationHelper;
	}

	public String next() {

		getPagination().nextPage();
		recreateModel();

		return "catalogue";
	}

	public String previous() {

		getPagination().previousPage();
		recreateModel();

		return "catalogue";
	}



}
*/