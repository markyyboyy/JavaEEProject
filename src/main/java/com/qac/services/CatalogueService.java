package com.qac.services;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;

import com.qac.row5project.entities.ProductItem;
import com.qac.row5project.helpers.PaginationHelper;

public class CatalogueService {

	@Inject
	private ProductService productService;

	private PaginationHelper pagenationHelper;

	private DataModel<ProductItem> products = null;

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
				public DataModel<ProductItem> createPageDataModel() {

					try {
						return new ListDataModel<ProductItem>(productService.getProductItem(0).subList(getPageFirstItem(),
								getPageFirstItem() + getPageSize()));

					} catch (Exception e) {

						return new ListDataModel<ProductItem>(
								productService.findAllActive().subList(getPageFirstItem(), getItemsCount()));
					}

				}

			};

		}

		return pagenationHelper;
	}

}
