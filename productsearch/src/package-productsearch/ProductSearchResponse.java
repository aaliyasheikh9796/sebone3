/**@ClassName-ProductSearchResponse
 *@Method-Getmessage if result won't match
 *@Objective-To set and get the message
 *@param-string
 *@ReturnType-string
 *
 * 
 */
package com.sebone.java.searchProduct.data;

/**
 * @author Aaliya Sheikh
 *
 */
public class ProductSearchResponse {
	private String Message;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return Message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		Message = message;
	}
	

}
