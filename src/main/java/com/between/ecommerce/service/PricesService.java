package com.between.ecommerce.service;

import java.util.List;

import com.between.ecommerce.entity.Prices;
import com.between.ecommerce.model.RequestBodyPrices;
import com.between.ecommerce.model.ResponsePrice;


public interface PricesService {
	
	public abstract List<Prices> getPrices(RequestBodyPrices requestBodyPrices);
	public abstract ResponsePrice getPrice(RequestBodyPrices requestBodyPrices);

}
