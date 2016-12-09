package com.qac.row5project.helpers;

import javax.faces.model.DataModel;
/***
 * 
 * @author Mike
 *
 */
public abstract class PaginationHelper {

	private int pageSize;
	private int page;

	public PaginationHelper(int pageSize) {

		this.pageSize = pageSize;

	}

	/**
	 * 
	 * @return the amount of Item within the DataModel
	 */
	public abstract int getItemsCount();

	/**
	 * 
	 * @return the list of items to be used within 
	 * the pagination. M
	 * 
	 * Model takes any Object Type
	 */
	public abstract DataModel<?> createPageDataModel();

	/***
	 * 
	 * @return item to be shown per page
	 */
	public int getPageSize() {
		return pageSize;
	}

	/***
	 * 
	 * @param pageSize how many items to be seen per page
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/***
	 * 
	 * @return the the index of the first item to shown on the 
	 * view
	 */
	public int getPageFirstItem() {

		return page * pageSize;

	}
//javadoc
	public int getPageLastItem() {

		int i = getPageFirstItem() + pageSize - 1;
		int count = getItemsCount() - 1;

		if (i > count)
			i = count;

		if (i < 0)
			i = 0;

		return i;

	}
	/***
	 * 
	 * @return if there are more item to be seen
	 */
	public boolean isHasNextPage() {

		return (page + 1) * pageSize + 1 <= getItemsCount();
	}

	/**
	 * Go to next page to view the additional items
	 */
	public void nextPage() {

		if (isHasNextPage())
			page++;
	}

	public boolean isHasPreviousPage() {
		return page > 0;
	}

	public void previousPage() {
		if (isHasPreviousPage())
			page--;
	}
}
