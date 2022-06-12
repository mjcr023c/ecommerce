package com.between.ecommerce.service;

import com.between.ecommerce.model.RequestBodyPrices;
import com.between.ecommerce.model.ResponsePrice;


public interface PricesService {
	
	public abstract ResponsePrice getPrice(RequestBodyPrices requestBodyPrices);

}
