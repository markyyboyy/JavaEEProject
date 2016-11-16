public class Images {
	private String url;
	private String desc;
	private int productID;
	
	public Images(String url, String desc, int productID) {
		super();
		this.url = url;
		this.desc = desc;
		this.productID = productID;
	}
	public Images(String url, int productID) {
		super();
		this.url = url;
		this.productID = productID;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	@Override
	public String toString() {
		return "Images [url=" + url + ", desc=" + desc + ", productID=" + productID + "]";
	}
}
