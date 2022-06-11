package com.between.ecommerce.component;

import org.springframework.stereotype.Component;

import com.between.ecommerce.entity.Prices;
import com.between.ecommerce.model.ResponsePrice;


@Component("responsePriceConverter")
public class ResponsePriceConverter {
	
	/**
	 * 
	 * @param prices
	 * @return
	 */
	public ResponsePrice convertPricesToResponsePrice (Prices prices) {
		
		ResponsePrice responsePrice = new ResponsePrice();
		responsePrice.setIdBrand(prices.getBrand().getIdBrand());
		responsePrice.setIdProduct(prices.getProduct().getIdProduct());
		responsePrice.setPriceList(prices.getPriceList());
		responsePrice.setStartDate(prices.getStartDate());
		responsePrice.setEndDate(prices.getEndDate());
		responsePrice.setPrice(prices.getPrice());
		responsePrice.setCurr(prices.getCurr());
		
		
		return responsePrice;
	}

}
