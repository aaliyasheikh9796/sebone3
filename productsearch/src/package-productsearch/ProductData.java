/**@ClassName-ProductData
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
public class ProductData {
private int productId;
private String productName;
private int productPrice;
private int productshippingPrice;
private String productdiscount;
private String productBrandname;
private String productStatus;
private String ProductDescription;

/**
 * @return the productDescription
 */
public String getProductDescription() {
	return ProductDescription;
}
/**
 * @param productDescription the productDescription to set
 */
public void setProductDescription(String productDescription) {
	ProductDescription = productDescription;
}
/**
 * @return the productId
 */
public int getProductId() {
	return productId;
}
/**
 * @param productId the productId to set
 */
public void setProductId(int productId) {
	this.productId = productId;
}
/**
 * @return the productName
 */
public String getProductName() {
	return productName;
}
/**
 * @param productName the productName to set
 */
public void setProductName(String productName) {
	this.productName = productName;
}
/**
 * @return the productPrice
 */
public int getProductPrice() {
	return productPrice;
}
/**
 * @param productPrice the productPrice to set
 */
public void setProductPrice(int productPrice) {
	this.productPrice = productPrice;
}
/**
 * @return the shippingPrice
 */
public int getProductShippingPrice() {
	return productshippingPrice;
}
/**
 * @param shippingPrice the shippingPrice to set
 */
public void setShippingPrice(int productshippingPrice) {
	this.productshippingPrice = productshippingPrice;
}
/**
 * @return the discount
 */
public String getProductDiscount() {
	return productdiscount;
}
/**
 * @param discount the discount to set
 */
public void setProductDiscount(String discount) {
	this.productdiscount = discount;
}
/**
 * @return the productshippingPrice
 */
public int getProductshippingPrice() {
	return productshippingPrice;
}
/**
 * @param productshippingPrice the productshippingPrice to set
 */
public void setProductshippingPrice(int productshippingPrice) {
	this.productshippingPrice = productshippingPrice;
}
/**
 * @return the productStatus
 */
public String getProductStatus() {
	return productStatus;
}
/**
 * @param productStatus the productStatus to set
 */
public void setProductStatus(String productStatus) {
	this.productStatus = productStatus;
}
/**
 * @return the productBrandname
 */
public String getProductBrandname() {
	return productBrandname;
}
/**
 * @param productBrandname the productBrandname to set
 */
public void setProductBrandname(String productBrandname) {
	this.productBrandname = productBrandname;
}



}
