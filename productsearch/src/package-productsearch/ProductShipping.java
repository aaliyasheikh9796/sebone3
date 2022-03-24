/**@ClassName-ProductShipping
 *@Method-All the getter and setter for the constraints
 *@Objective-To set and get the value
 *@param-string,integer
 *@ReturnType-int ,string
 *
 * 
 */
package com.sebone.java.searchProduct.data;

/**
 * @author Aaliya Sheikh
 *
 */
public class ProductShipping {
	private int productshippingid;
	private String productShippingType;
	private int productShippingPrice;
	/**
	 * @return the productshippingid
	 */
	public int getProductshippingid() {
		return productshippingid;
	}
	/**
	 * @param productshippingid the productshippingid to set
	 */
	public void setProductshippingid(int productshippingid) {
		this.productshippingid = productshippingid;
	}
	/**
	 * @return the productShippingType
	 */
	public String getProductShippingType() {
		return productShippingType;
	}
	/**
	 * @param productShippingType the productShippingType to set
	 */
	public void setProductShippingType(String productShippingType) {
		this.productShippingType = productShippingType;
	}
	/**
	 * @return the productShippingPrice
	 */
	public int getProductShippingPrice() {
		return productShippingPrice;
	}
	/**
	 * @param productShippingPrice the productShippingPrice to set
	 */
	public void setProductShippingPrice(int productShippingPrice) {
		this.productShippingPrice = productShippingPrice;
	}
	

}
